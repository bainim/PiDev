using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using picturenetwork.domain;
using System.Threading.Tasks;

namespace picturenetwork.data.Infrasricture
{
    public class EventRepository : RepositoryBase<t_event>, IEventRepository
    {
        public EventRepository(IDatabaseFactory dbFactory)
            : base(dbFactory)
        {

        }
    }

    public interface IEventRepository : IRepository<t_event> { }

}
