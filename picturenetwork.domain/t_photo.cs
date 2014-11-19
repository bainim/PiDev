using System;
using System.Collections.Generic;

namespace picturenetwork.domain
{
    public partial class t_photo
    {
        public int idphoto { get; set; }
        public string description { get; set; }
        public byte[] picbyte { get; set; }
        public Nullable<int> userphoto_fk { get; set; }
        public virtual t_user t_user { get; set; }
    }
}
