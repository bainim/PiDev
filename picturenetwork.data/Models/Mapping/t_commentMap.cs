using System.ComponentModel.DataAnnotations.Schema;
using System.Data.Entity.ModelConfiguration;
using picturenetwork.domain;

namespace picturenetwork.data.Models.Mapping
{
    public class t_commentMap : EntityTypeConfiguration<t_comment>
    {
        public t_commentMap()
        {
            // Primary Key
            this.HasKey(t => t.idcomment);

            // Properties
            this.Property(t => t.comm)
                .HasMaxLength(1073741823);

            this.Property(t => t.datecomment)
                .HasMaxLength(255);

            // Table & Column Mappings
            this.ToTable("t_comment", "picturenetwork");
            this.Property(t => t.idcomment).HasColumnName("idcomment");
            this.Property(t => t.comm).HasColumnName("comm");
            this.Property(t => t.datecomment).HasColumnName("datecomment");
            this.Property(t => t.subjectcomment_fk).HasColumnName("subjectcomment_fk");
            this.Property(t => t.usercomment_fk).HasColumnName("usercomment_fk");

            // Relationships
            this.HasOptional(t => t.t_user)
                .WithMany(t => t.t_comment)
                .HasForeignKey(d => d.usercomment_fk);
            this.HasOptional(t => t.t_user1)
                .WithMany(t => t.t_comment1)
                .HasForeignKey(d => d.subjectcomment_fk);
            this.HasOptional(t => t.t_subject)
                .WithMany(t => t.t_comment)
                .HasForeignKey(d => d.subjectcomment_fk);

        }
    }
}
