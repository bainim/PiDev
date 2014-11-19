using picturenetwork.domain;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace picturenetwork.data.Infrasricture
{
    public class CommentRepository : RepositoryBase<t_comment>, ICommentRepository
    {
         public CommentRepository(IDatabaseFactory dbFactory)
            : base(dbFactory)
        {

        }
    }

    public interface ICommentRepository : IRepository<t_comment>
    {

    }
}
