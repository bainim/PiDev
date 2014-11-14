using System.ComponentModel.DataAnnotations.Schema;
using System.Data.Entity.ModelConfiguration;

namespace picturenetwork.data.Models.Mapping
{
    public class t_subjectMap : EntityTypeConfiguration<t_subject>
    {
        public t_subjectMap()
        {
            // Primary Key
            this.HasKey(t => t.idsubject);

            // Properties
            this.Property(t => t.date)
                .HasMaxLength(255);

            this.Property(t => t.title)
                .HasMaxLength(255);

            // Table & Column Mappings
            this.ToTable("t_subject", "picturenetwork");
            this.Property(t => t.idsubject).HasColumnName("idsubject");
            this.Property(t => t.date).HasColumnName("date");
            this.Property(t => t.title).HasColumnName("title");
        }
    }
}
