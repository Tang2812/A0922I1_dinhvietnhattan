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
    public partial class Site1 : System.Web.UI.MasterPage
    {
        KetNoi ketnoi = new KetNoi();
        protected void Page_Load(object sender, EventArgs e)
        {
            if (Page.IsPostBack) return;
            string q = "SELECT * FROM DanhMuc";
            this.DataList1.DataSource = ketnoi.getDuLieu(q);
            this.DataList1.DataBind();
        }

        protected void LinkButton1_Click(object sender, EventArgs e)
        {
            string maDM = ((LinkButton)sender).CommandArgument;
            Context.Items["dm"] = maDM;
            Server.Transfer("SanPham.aspx");
        }
    }
}