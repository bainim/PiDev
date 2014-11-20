using picturenetwork.data.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace picturenetwork.data.Infrasricture
{
   public class DatabaseFactory : Disposable, IDatabaseFactory
    {
        private picturenetworkContext dataContext;
        public picturenetworkContext DataContext
        {
            get { return dataContext; }
        }

        public DatabaseFactory()
        {
            dataContext = new picturenetworkContext();
        }

        protected override void DisposeCore()
        {
            if (DataContext != null)
            {
                DataContext.Dispose();
            }
        }
    }
}
