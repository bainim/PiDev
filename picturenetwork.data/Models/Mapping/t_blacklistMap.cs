using System.ComponentModel.DataAnnotations.Schema;
using System.Data.Entity.ModelConfiguration;
using picturenetwork.domain;

namespace picturenetwork.data.Models.Mapping
{
    public class t_blacklistMap : EntityTypeConfiguration<t_blacklist>
    {
        public t_blacklistMap()
        {
            // Primary Key
            this.HasKey(t => t.idword);

            // Properties
            this.Property(t => t.word)
                .HasMaxLength(255);

            // Table & Column Mappings
            this.ToTable("t_blacklist", "picturenetwork");
            this.Property(t => t.idword).HasColumnName("idword");
            this.Property(t => t.word).HasColumnName("word");
        }
    }
}
