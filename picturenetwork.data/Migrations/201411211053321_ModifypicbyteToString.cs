namespace picturenetwork.data.Migrations
{
    using System;
    using System.Data.Entity.Migrations;
    
    public partial class ModifypicbyteToString : DbMigration
    {
        public override void Up()
        {
            AlterColumn("t_photo", "picbyte", c => c.String(unicode: false));
        }
        
        public override void Down()
        {
            AlterColumn("t_photo", "picbyte", c => c.Binary());
        }
    }
}
