using picturenetwork.domain;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace picturenetwork.data.Infrasricture
{
    public class SubjectRepository : RepositoryBase<t_subject>, ISubjectRepository
    {
        public SubjectRepository(IDatabaseFactory dbFactory)
            : base(dbFactory)
        {

        }
    }

    public interface ISubjectRepository : IRepository<t_subject>
    {

    }
}
