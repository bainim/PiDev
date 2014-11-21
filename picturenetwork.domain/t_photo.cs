using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;

namespace picturenetwork.domain
{
    public partial class t_photo
    {
        public int idphoto { get; set; }
        [DataType(DataType.MultilineText)]
        public string description { get; set; }
        [Display(Name = "Image")]
        [DataType(DataType.ImageUrl)]
        public string picbyte { get; set; }
        public Nullable<int> userphoto_fk { get; set; }
        public virtual t_user t_user { get; set; }
    }
}
