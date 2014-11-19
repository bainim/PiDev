using picturenetwork.data.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace picturenetwork.data.Infrasricture
{
    public class UnitOfWork : IUnitOfWork
    {
        IDatabaseFactory dbFactory;
        picturenetworkContext dataContext;

        public picturenetworkContext DataContext
        {
            get { return dataContext = dbFactory.DataContext; }
        }


        public UnitOfWork(IDatabaseFactory dbFactory)
        {
            this.dbFactory = dbFactory;
        }
        public void Commit()
        {
            DataContext.SaveChanges();
        }

        private ISubjectRepository subjectRepository;
        public ISubjectRepository SubjectRepository
        {
            get { return subjectRepository = new SubjectRepository(dbFactory); }
        }

        private ICommentRepository commentRepository;
        public ICommentRepository ProviderRepository
        {
            get { return commentRepository = new CommentRepository(dbFactory); }
        }
        public void Dispose()
        {
            dbFactory.Dispose();
        }
    }
    
}
