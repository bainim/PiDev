using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace picturenetwork.data.Infrasricture
{
    interface IUnitOfWork : IDisposable
    {
        void Commit();

        ISubjectRepository SubjectRepository { get; }
        ICommentRepository CommentRepository { get; }
      
    }
}
