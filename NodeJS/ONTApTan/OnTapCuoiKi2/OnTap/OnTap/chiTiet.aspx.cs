using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace OnTap
{
    public partial class chiTiet : System.Web.UI.Page
    {
        Ketnoi ketnoi = new Ketnoi();
        protected void Page_Load(object sender, EventArgs e)
        {
            if (Page.IsPostBack) return;
            string q;
            if (Context.Items["hoa"] == null)
            {
                q = "SELECT * FROM Hoa";
            }
            else
            {
                string maHoa = Context.Items["hoa"].ToString();
                q = "SELECT * FROM Hoa where MaHoa= '" + maHoa + "'";
            }
            this.DataList1.DataSource = ketnoi.getData(q);
            this.DataList1.DataBind();
        }
    }
}