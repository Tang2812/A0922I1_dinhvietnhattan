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
    public partial class chiTiet : System.Web.UI.Page
    {
        Ketnoi ketnoi = new Ketnoi();
    
        protected void Page_Load(object sender, EventArgs e)
        {
            if (IsPostBack) return;
            string q;
            if (Context.Items["hoa"] == null)
            {
                q = "SELECT * FROM HOA";
            }
            else
            {
                string mahoa = Context.Items["hoa"].ToString();
                q = "SELECT * FROM HOA WHERE MaHoa= '" + mahoa + "'";
            }
            try
            {
                this.DataList1.DataSource = ketnoi.getData(q);
                this.DataList1.DataBind();
            }
            catch(SqlException ex)
            {
                Response.Write(ex);
            }
        }
    }
}