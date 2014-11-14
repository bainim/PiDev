using System;
using System.Collections.Generic;

namespace picturenetwork.data.Models
{
    public partial class t_subject
    {
        public t_subject()
        {
            this.t_comment = new List<t_comment>();
        }

        public int idsubject { get; set; }
        public string date { get; set; }
        public string title { get; set; }
        public virtual ICollection<t_comment> t_comment { get; set; }
    }
}
