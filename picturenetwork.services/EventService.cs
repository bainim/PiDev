using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using picturenetwork.domain;
using picturenetwork.data.Infrasricture;
using System.Threading.Tasks;

namespace picturenetwork.services
{
    public class EventService:IEventService
    {
        IDatabaseFactory dbFactory = null;
        IUnitOfWork utOfWork = null;

        public EventService()
        {
            dbFactory = new DatabaseFactory();
            utOfWork = new UnitOfWork(dbFactory);
        }

        public void CreateEvent(t_event e) 
        {
            utOfWork.EventRepository.Add(e);
            utOfWork.Commit();
        }

        public IEnumerable<t_event> GetEvents()
        {
            return utOfWork.EventRepository.GetAll();
        }

        public t_event GetEventById(int idevent)
        {
            return utOfWork.EventRepository.GetById(idevent) as t_event;
        }

        public void UpdateEvent(t_event ev)
        {
            utOfWork.EventRepository.Update(ev);
            utOfWork.Commit();
        }

        public void Dispose()
        {
            utOfWork.Dispose();
        }

    }
}
