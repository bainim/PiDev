using System;
using System.Collections.Generic;

namespace picturenetwork.domain
{
    public partial class t_user
    {
        public t_user()
        {
            this.t_comment = new List<t_comment>();
            this.t_comment1 = new List<t_comment>();
            this.t_event = new List<t_event>();
            this.t_photo = new List<t_photo>();
        }

        public string DTYPE { get; set; }
        public int id { get; set; }
        public string age { get; set; }
        public string birthday { get; set; }
        public string country { get; set; }
        public string description { get; set; }
        public string fname { get; set; }
        public string gender { get; set; }
        public string grade { get; set; }
        public string lname { get; set; }
        public string login { get; set; }
        public string password { get; set; }
        public byte[] photobyte { get; set; }
        public int state { get; set; }
        public string type { get; set; }
        public virtual ICollection<t_comment> t_comment { get; set; }
        public virtual ICollection<t_comment> t_comment1 { get; set; }
        public virtual ICollection<t_event> t_event { get; set; }
        public virtual ICollection<t_photo> t_photo { get; set; }
    }
}
