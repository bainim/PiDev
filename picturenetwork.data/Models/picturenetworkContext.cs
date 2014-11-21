using System.Data.Entity;
using System.Data.Entity.Infrastructure;
using picturenetwork.data.Models.Mapping;
using picturenetwork.domain;

namespace picturenetwork.data.Models
{
    public partial class picturenetworkContext : DbContext
    {
        static picturenetworkContext()
        {
            Database.SetInitializer<picturenetworkContext>(null);
        }

        public picturenetworkContext()
            : base("Name=picturenetworkContext")
        {
        }

        public DbSet<t_blacklist> t_blacklist { get; set; }
        public DbSet<t_claims> t_claims { get; set; }
        public DbSet<t_comment> t_comment { get; set; }
        public DbSet<t_event> t_event { get; set; }
        public DbSet<t_forum> t_forum { get; set; }
        public DbSet<t_photo> t_photo { get; set; }
        public DbSet<t_subject> t_subject { get; set; }
        public DbSet<t_user> t_user { get; set; }

        protected override void OnModelCreating(DbModelBuilder modelBuilder)
        {
            modelBuilder.Configurations.Add(new t_blacklistMap());
            modelBuilder.Configurations.Add(new t_claimsMap());
            modelBuilder.Configurations.Add(new t_commentMap());
            modelBuilder.Configurations.Add(new t_eventMap());
            modelBuilder.Configurations.Add(new t_forumMap());
            modelBuilder.Configurations.Add(new t_photoMap());
            modelBuilder.Configurations.Add(new t_subjectMap());
            modelBuilder.Configurations.Add(new t_userMap());

            modelBuilder.Conventions
        .Remove <System.Data.Entity.ModelConfiguration.Conventions.TableAttributeConvention>();

            modelBuilder.Conventions.Remove<System.Data.Entity.Infrastructure.IncludeMetadataConvention>();
        }
    }
}
