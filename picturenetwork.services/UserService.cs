using picturenetwork.data.Infrasricture;
using picturenetwork.domain;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace picturenetwork.services
{
    public class UserService
    {

        static IDatabaseFactory dbFactory = new DatabaseFactory();
        IUnitOfWork utOfWork = new UnitOfWork(dbFactory);

        public IEnumerable<t_user> GetAllUsers()
        {
            var Users = utOfWork.UserRepository.GetMany(x => x.type == "User", x => x.state == 1 );
             return Users;
        }

        public IEnumerable<t_user> GetAllPhotographers()
        {
            var Photographers = utOfWork.UserRepository.GetMany(x => x.type == "Photographer", x => x.state == 1);
            return Photographers;
        }

        public IEnumerable<t_user> GetAllModels()
        {
            var Models = utOfWork.UserRepository.GetMany(x => x.type == "Model", x => x.state == 1);
            return Models;
        }

        public IEnumerable<t_user> GetUserByName(string name)
        {
            var Models = utOfWork.UserRepository.GetMany(x => x.fname == name, x => x.state == 1);
            return Models;
        }

    }
}
