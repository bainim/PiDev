using System;
using System.Collections.Generic;

namespace picturenetwork.data.Models
{
    public partial class t_event
    {
        public int idevent { get; set; }
        public string dateEvent { get; set; }
        public string description { get; set; }
        public string local { get; set; }
        public Nullable<int> userevent_fk { get; set; }
        public virtual t_user t_user { get; set; }
    }
}
