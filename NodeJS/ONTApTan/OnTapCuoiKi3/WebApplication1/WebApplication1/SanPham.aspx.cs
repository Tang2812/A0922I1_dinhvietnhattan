using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApplication1
{
    public partial class SanPham : System.Web.UI.Page
    {
        KetNoi ketnoi = new KetNoi();
        protected void Page_Load(object sender, EventArgs e)
        {
            if (Page.IsPostBack) return;
            string q;
            if (Context.Items["dm"] == null)
            {
                q = "SELECT * FROM Hoa";
            }
            else
            {
                string maDM = Context.Items["dm"].ToString();
                q = "SELECT * FROM Hoa WHERE MaDM = '"+maDM+"'";
            }
            this.DataList1.DataSource = ketnoi.getDuLieu(q);
            this.DataList1.DataBind();
        }

        protected void LinkButton2_Click(object sender, EventArgs e)
        {
            string maHoa = ((LinkButton)sender).CommandArgument;
            Context.Items["hoa"] = maHoa;
            Server.Transfer("ChiTiet.aspx");
        }
    }
}