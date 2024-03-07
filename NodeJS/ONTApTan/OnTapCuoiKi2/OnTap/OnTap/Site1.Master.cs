using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;
using System.Data.SqlClient;
namespace OnTap
{
    public partial class Site1 : System.Web.UI.MasterPage
    {
        Ketnoi ketnoi = new Ketnoi();
        protected void Page_Load(object sender, EventArgs e)
        {
            if (Page.IsPostBack) return;
            string q = "SELECT * FROM DanhMuc";
            try
            {
                this.DataList1.DataSource = ketnoi.getData(q);
                this.DataList1.DataBind();
            }
            catch(SqlException ex)
            {
                Response.Write(ex.Message);
            }
        }

        protected void LinkButton1_Click(object sender, EventArgs e)
        {
            string maDM = ((LinkButton)sender).CommandArgument;
            Context.Items["dm"] = maDM;
            Server.Transfer("SanPham.aspx");
        }
    }
}