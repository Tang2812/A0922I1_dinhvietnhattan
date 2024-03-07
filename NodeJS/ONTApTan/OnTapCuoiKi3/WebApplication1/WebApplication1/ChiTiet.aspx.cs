using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;
using System.Data.SqlClient;
namespace WebApplication1
{
    public partial class ChiTiet : System.Web.UI.Page
    {
        KetNoi ketnoi = new KetNoi();
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
                q = "SELECT * FROM Hoa WHERE MaHoa = '" + maHoa + "'";
            }
            this.DataList1.DataSource = ketnoi.getDuLieu(q);
            this.DataList1.DataBind();
        }
    }
}