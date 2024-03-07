using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;
using System.Data.SqlClient;
namespace OnTapCuoiKi1
{
    public partial class sanPham : System.Web.UI.Page
    {
        Ketnoi ketnoi = new Ketnoi();
        protected void Page_Load(object sender, EventArgs e)
    
        {
            if (Page.IsPostBack) return;
            string q;
            if(Context.Items["dm"]==null)
            {
                q = "SELECT * FROM Hoa";
            }
            else
            {
                string danhmuc = Context.Items["dm"].ToString();
                q = "SELECT * FROM HOA WHERE MaDM= '" + danhmuc + "'";

            }
            try
            {
                this.DataList1.DataSource = ketnoi.getData(q);
                this.DataList1.DataBind();
            }catch(SqlException ex)
            {
                Response.Write(ex.Message);
            }
        }

  

        protected void LinkButton2_Click(object sender, EventArgs e)
        {
            string maHoa = ((LinkButton)sender).CommandArgument;
            Context.Items["hoa"] = maHoa;
            Server.Transfer("chiTiet.aspx");
        }
    }
}