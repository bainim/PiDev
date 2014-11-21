using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using picturenetwork.domain;

namespace picturenetwork.services
{
   public interface IPhotoService :IDisposable

    {
       void CreatePhoto(t_photo p);
       IEnumerable<t_photo> GetPhotos();
      
       t_photo GetPhoto(int idphoto);

    }
}
