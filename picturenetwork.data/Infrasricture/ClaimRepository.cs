using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using picturenetwork.domain;
using System.Threading.Tasks;

namespace picturenetwork.data.Infrasricture
{
    public class ClaimRepository : RepositoryBase<t_claims>, IClaimRepository
    {
        public ClaimRepository(IDatabaseFactory dbFactory) : base(dbFactory) { }
    }


    public interface IClaimRepository : IRepository<t_claims> 
    { 
    }
}
