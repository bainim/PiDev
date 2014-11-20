using picturenetwork.data.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace picturenetwork.data.Infrasricture
{
    public interface IDatabaseFactory : IDisposable
    {
        picturenetworkContext DataContext { get; }
    }
}
