using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using picturenetwork.domain;
using System.Threading.Tasks;

namespace picturenetwork.services
{
    public interface IClaimService : IDisposable
    {
       void CreateClaim(t_claims c);
    }
}
