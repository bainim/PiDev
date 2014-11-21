using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using picturenetwork.domain;

namespace picturenetwork.data.Infrasricture
{
    public class PhotoRepository : RepositoryBase<t_photo>, IPhotoRepository
    {
        public PhotoRepository(IDatabaseFactory dbFactory):base(dbFactory)
        {

        }
    }


    public interface IPhotoRepository : IRepository<t_photo> 
    {
    }
}
