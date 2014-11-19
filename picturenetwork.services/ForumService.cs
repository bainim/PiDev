using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using picturenetwork.data.Infrasricture;
using picturenetwork.domain;

namespace picturenetwork.services
{
    public class ForumService : IForumService
    {
        IDatabaseFactory dbFactory = null;
        IUnitOfWork utOfWork = null;

        public ForumService()
        {
            dbFactory = new DatabaseFactory();
            utOfWork = new UnitOfWork(dbFactory);
        }
        public IEnumerable<domain.t_subject> GetSubjects()
        {
            return utOfWork.SubjectRepository.GetAll();
        }

        public domain.t_subject GetSubject(int idsubject)
        {
            return utOfWork.SubjectRepository.GetById(idsubject) as t_subject;
        }

        public void CreateComment(domain.t_comment c)
        {
            utOfWork.CommentRepository.Add(c);
            utOfWork.Commit();
        }

        public IEnumerable<domain.t_comment> GetComments()
        {
            return utOfWork.CommentRepository.GetAll();
        }

        public domain.t_comment GetComment(int idcomment)
        {
            return utOfWork.CommentRepository.GetById(idcomment) as t_comment;
        }

        public IEnumerable<domain.t_comment> GetCommentsBySubject(string title)
        {
            return utOfWork.CommentRepository.GetMany(c => c.t_subject.title == title);
        }

        public IEnumerable<domain.t_comment> GetCommentsBySubject(int idsubject)
        {
            return utOfWork.CommentRepository.GetMany(c => c.t_subject.idsubject == idsubject);
        }

        public void UpdateComment(domain.t_comment c)
        {
            utOfWork.CommentRepository.Update(c);
            utOfWork.Commit();
        }

        public void DeleteComment(int idcomment)
        {
            utOfWork.CommentRepository.Delete(idcomment);
            utOfWork.Commit();
        }

        public void Dispose()
        {
            utOfWork.Dispose();
        }
    }
}
