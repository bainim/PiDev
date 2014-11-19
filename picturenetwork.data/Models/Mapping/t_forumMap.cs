using System.ComponentModel.DataAnnotations.Schema;
using System.Data.Entity.ModelConfiguration;
using picturenetwork.domain;

namespace picturenetwork.data.Models.Mapping
{
    public class t_forumMap : EntityTypeConfiguration<t_forum>
    {
        public t_forumMap()
        {
            // Primary Key
            this.HasKey(t => t.idforum);

            // Properties
            this.Property(t => t.title)
                .HasMaxLength(255);

            // Table & Column Mappings
            this.ToTable("t_forum", "picturenetwork");
            this.Property(t => t.idforum).HasColumnName("idforum");
            this.Property(t => t.title).HasColumnName("title");
        }
    }
}
