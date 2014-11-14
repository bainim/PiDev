using System;
using System.Collections.Generic;

namespace picturenetwork.data.Models
{
    public partial class t_comment
    {
        public int idcomment { get; set; }
        public string comm { get; set; }
        public string datecomment { get; set; }
        public Nullable<int> subjectcomment_fk { get; set; }
        public Nullable<int> usercomment_fk { get; set; }
        public virtual t_user t_user { get; set; }
        public virtual t_user t_user1 { get; set; }
        public virtual t_subject t_subject { get; set; }
    }
}
