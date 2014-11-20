using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(picturenetwork.web.Startup))]
namespace picturenetwork.web
{
    public partial class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            ConfigureAuth(app);
        }
    }
}
