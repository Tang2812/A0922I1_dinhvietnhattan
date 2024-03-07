using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Data;
using System.Data.SqlClient;
using ontap_cuoiki;

public partial class Chitiet : System.Web.UI.Page
{
    // string sql_connect = @"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Thương mại điện tử\ontap_cuoiki\ontap_cuoiki\App_Data\Ontap.mdf;Integrated Security=True";
    Xuli kn = new Xuli();
    protected void Page_Load(object sender, EventArgs e)
    {
        if (Page.IsPostBack) return;
        string q;
        if (Context.Items["dm"] == null)
        {
            q = "SELECT * FROM HOA";
        }
        else
        {
            string danhmuc = Context.Items["dm"].ToString();
            q = "SELECT * FROM HOA WHERE MaHoa = '" + danhmuc + "'";
        }
        try
        {
            //SqlDataAdapter da = new SqlDataAdapter(q, sql_connect);
            //DataTable dt = new DataTable();
            //da.Fill(dt);
            this.DataList1.DataSource = kn.getdata(q);
            this.DataList1.DataBind();

        }
        catch (SqlException ex)
        {
            Response.Write(ex.Message);
        }
    }
}
