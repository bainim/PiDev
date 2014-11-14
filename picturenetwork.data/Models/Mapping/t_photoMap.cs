using System.ComponentModel.DataAnnotations.Schema;
using System.Data.Entity.ModelConfiguration;

namespace picturenetwork.data.Models.Mapping
{
    public class t_photoMap : EntityTypeConfiguration<t_photo>
    {
        public t_photoMap()
        {
            // Primary Key
            this.HasKey(t => t.idphoto);

            // Properties
            this.Property(t => t.description)
                .HasMaxLength(255);

            // Table & Column Mappings
            this.ToTable("t_photo", "picturenetwork");
            this.Property(t => t.idphoto).HasColumnName("idphoto");
            this.Property(t => t.description).HasColumnName("description");
            this.Property(t => t.picbyte).HasColumnName("picbyte");
            this.Property(t => t.userphoto_fk).HasColumnName("userphoto_fk");

            // Relationships
            this.HasOptional(t => t.t_user)
                .WithMany(t => t.t_photo)
                .HasForeignKey(d => d.userphoto_fk);

        }
    }
}
