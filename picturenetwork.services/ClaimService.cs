using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using picturenetwork.domain;
using picturenetwork.data.Infrasricture;
using System.Threading.Tasks;

namespace picturenetwork.services
{
    public class ClaimService:IClaimService
    {
        IDatabaseFactory dbFactory = null;
        IUnitOfWork utOfWork = null;
        public ClaimService()
        {
            dbFactory = new DatabaseFactory();
            utOfWork = new UnitOfWork(dbFactory);
        }
        public void CreateClaim(t_claims c)
        {
            utOfWork.ClaimRepository.Add(c);
            utOfWork.Commit();
        }




        public void Dispose()
        {
            utOfWork.Dispose();
        }
    }
}
