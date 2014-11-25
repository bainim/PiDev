using picturenetwork.data.Models;
using picturenetwork.domain;
using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace picturenetwork.data.Infrasricture
{
    public class UserRepository : RepositoryBase<t_user>, IUserRepository
    {
        private picturenetworkContext dataContext;
        public picturenetworkContext DataContext
        {
            get
            {
                return dataContext = dbFactory.DataContext;
            }
        }

        private IDbSet<t_user> dbset;
        IDatabaseFactory dbFactory;
         public UserRepository(IDatabaseFactory dbFactory)
            : base(dbFactory)
        {

        }

         public void Deactivate(t_user u)
         {
             u.state = 0;
             dbset.Attach(u);
             dataContext.Entry(u).State = EntityState.Modified;
         }


         public void Activate(t_user u)
         {
             u.state = 1;
             dbset.Attach(u);
             dataContext.Entry(u).State = EntityState.Modified;
         }
         
    }


    public interface IUserRepository : IRepository<t_user>
    {
        public void Deactivate(t_user u);
    }


}
