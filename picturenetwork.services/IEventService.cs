using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using picturenetwork.domain;
using System.Threading.Tasks;

namespace picturenetwork.services
{
    public interface IEventService : IDisposable
    {
       void CreateEvent(t_event e);
       IEnumerable<t_event> GetEvents();
       t_event GetEventById(int idevent);
       void UpdateEvent(t_event ev);
    }
}
