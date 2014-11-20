using picturenetwork.domain;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace picturenetwork.services
{
    interface IForumService : IDisposable
    {

        void CreateSubject(t_subject s);
        IEnumerable<t_subject> GetSubjects();
        t_subject GetSubject(int idsubject);
        void CreateComment(t_comment c);
        IEnumerable<t_comment> GetComments();
        t_comment GetComment(int idcomment);
        IEnumerable<t_comment> GetCommentsBySubject(string title);
        IEnumerable<t_comment> GetCommentsBySubject(int idsubject);
        void UpdateComment(t_comment c);
        void DeleteComment(int idcomment);
    }
}
