using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using picturenetwork.domain;
using picturenetwork.data.Infrasricture;
namespace picturenetwork.services
{
    public class PhotoService:IPhotoService
    {
        IDatabaseFactory dbFactory = null;
        IUnitOfWork utOfWork = null;

        public PhotoService()
        {
            dbFactory = new DatabaseFactory();
            utOfWork = new UnitOfWork(dbFactory);
        }
        public void CreatePhoto(t_photo p)
        {
            utOfWork.PhotoRepository.Add(p);
            utOfWork.Commit();
        }
        public IEnumerable<t_photo> GetPhotos() 
        {
            return utOfWork.PhotoRepository.GetAll();
        }
        public t_photo GetPhoto(int idphoto)
        {
            return utOfWork.PhotoRepository.GetById(idphoto) as t_photo;
        }


        public void Dispose()
        {
            utOfWork.Dispose();
        }
    }
}
