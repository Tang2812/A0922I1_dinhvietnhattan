using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace OnTapCuoiKi1
{
    public partial class Site1 : System.Web.UI.MasterPage
    {
       // string sql_connect = @"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Thương mại điện tử\ONTApTan\OnTapCuoiKi1\OnTapCuoiKi1\App_Data\DB.mdf;Integrated Security=True";
        Ketnoi ketnoi = new Ketnoi();
        protected void Page_Load(object sender, EventArgs e)
        {
            if (Page.IsPostBack) return;
            string q = "SELECT * FROM DanhMuc";
            try
            {
               // SqlDataAdapter da = new SqlDataAdapter(q, sql_connect);
                //DataTable dt = new DataTable();
                //da.Fill(dt);
                //this.DataList1.DataSource = dt;
                //this.DataList1.DataBind();
                 this.DataList1.DataSource = ketnoi.getData(q);
                this.DataList1.DataBind();
            }catch(SqlException ex)
            {
                Response.Write(ex.Message);
            }
        }

        protected void DataList1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        protected void LinkButton1_Click(object sender, EventArgs e)
        {
            string maDM = ((LinkButton)sender).CommandArgument;
            Context.Items["dm"] = maDM;
            //HttpContext.Current.RewritePath("SanPham.aspx");
            Server.Transfer("sanPham.aspx");
            //Server.Transfer("sanPham.aspx");
        }
    }
}