using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace picturenetwork.data.Infrasricture
{
   public interface IUnitOfWork : IDisposable
    {
        void Commit();

        ISubjectRepository SubjectRepository { get; }
        ICommentRepository CommentRepository { get; }
        IPhotoRepository PhotoRepository { get; }
        IClaimRepository ClaimRepository { get; }
        IEventRepository EventRepository { get; }
      
    }
}
