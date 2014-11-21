using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;

namespace picturenetwork.domain
{
    public partial class t_claims
    {
        public int idclaim { get; set; }
        [DataType(DataType.MultilineText)]
        public string claim { get; set; }
        public string dateclaims { get; set; }
        [DataType(DataType.EmailAddress)]
        public string email { get; set; }
        public string subject { get; set; }
    }
}
