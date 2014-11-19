using System.ComponentModel.DataAnnotations.Schema;
using System.Data.Entity.ModelConfiguration;
using picturenetwork.domain;

namespace picturenetwork.data.Models.Mapping
{
    public class t_userMap : EntityTypeConfiguration<t_user>
    {
        public t_userMap()
        {
            // Primary Key
            this.HasKey(t => t.id);

            // Properties
            this.Property(t => t.DTYPE)
                .IsRequired()
                .HasMaxLength(31);

            this.Property(t => t.age)
                .HasMaxLength(255);

            this.Property(t => t.birthday)
                .HasMaxLength(255);

            this.Property(t => t.country)
                .HasMaxLength(255);

            this.Property(t => t.description)
                .HasMaxLength(255);

            this.Property(t => t.fname)
                .HasMaxLength(255);

            this.Property(t => t.gender)
                .HasMaxLength(255);

            this.Property(t => t.grade)
                .HasMaxLength(255);

            this.Property(t => t.lname)
                .HasMaxLength(255);

            this.Property(t => t.login)
                .HasMaxLength(255);

            this.Property(t => t.password)
                .HasMaxLength(255);

            this.Property(t => t.type)
                .HasMaxLength(255);

            // Table & Column Mappings
            this.ToTable("t_user", "picturenetwork");
            this.Property(t => t.DTYPE).HasColumnName("DTYPE");
            this.Property(t => t.id).HasColumnName("id");
            this.Property(t => t.age).HasColumnName("age");
            this.Property(t => t.birthday).HasColumnName("birthday");
            this.Property(t => t.country).HasColumnName("country");
            this.Property(t => t.description).HasColumnName("description");
            this.Property(t => t.fname).HasColumnName("fname");
            this.Property(t => t.gender).HasColumnName("gender");
            this.Property(t => t.grade).HasColumnName("grade");
            this.Property(t => t.lname).HasColumnName("lname");
            this.Property(t => t.login).HasColumnName("login");
            this.Property(t => t.password).HasColumnName("password");
            this.Property(t => t.photobyte).HasColumnName("photobyte");
            this.Property(t => t.state).HasColumnName("state");
            this.Property(t => t.type).HasColumnName("type");
        }
    }
}
