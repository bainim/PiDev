using System.ComponentModel.DataAnnotations.Schema;
using System.Data.Entity.ModelConfiguration;

namespace picturenetwork.data.Models.Mapping
{
    public class t_eventMap : EntityTypeConfiguration<t_event>
    {
        public t_eventMap()
        {
            // Primary Key
            this.HasKey(t => t.idevent);

            // Properties
            this.Property(t => t.dateEvent)
                .HasMaxLength(255);

            this.Property(t => t.description)
                .HasMaxLength(1073741823);

            this.Property(t => t.local)
                .HasMaxLength(255);

            // Table & Column Mappings
            this.ToTable("t_event", "picturenetwork");
            this.Property(t => t.idevent).HasColumnName("idevent");
            this.Property(t => t.dateEvent).HasColumnName("dateEvent");
            this.Property(t => t.description).HasColumnName("description");
            this.Property(t => t.local).HasColumnName("local");
            this.Property(t => t.userevent_fk).HasColumnName("userevent_fk");

            // Relationships
            this.HasOptional(t => t.t_user)
                .WithMany(t => t.t_event)
                .HasForeignKey(d => d.userevent_fk);

        }
    }
}
