using picturenetwork.domain;
using System.ComponentModel.DataAnnotations.Schema;
using System.Data.Entity.ModelConfiguration;

namespace picturenetwork.data.Models.Mapping
{
    public class t_claimsMap : EntityTypeConfiguration<t_claims>
    {
        public t_claimsMap()
        {
            // Primary Key
            this.HasKey(t => t.idclaim);

            // Properties
            this.Property(t => t.claim)
                .HasMaxLength(255);

            this.Property(t => t.dateclaims)
                .HasMaxLength(255);

            this.Property(t => t.email)
                .HasMaxLength(255);

            this.Property(t => t.subject)
                .HasMaxLength(255);

            // Table & Column Mappings
            this.ToTable("t_claims", "picturenetwork");
            this.Property(t => t.idclaim).HasColumnName("idclaim");
            this.Property(t => t.claim).HasColumnName("claim");
            this.Property(t => t.dateclaims).HasColumnName("dateclaims");
            this.Property(t => t.email).HasColumnName("email");
            this.Property(t => t.subject).HasColumnName("subject");
        }
    }
}
