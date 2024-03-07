using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Data;
using System.Data.SqlClient;
namespace ontap_cuoiki
{
    public class Xuli
    {
        SqlConnection con;
        ///Phuonng thuc ket noi data
        private void knoi()
        {
            con = new SqlConnection(@"Data Source = (LocalDB)\MSSQLLocalDB; AttachDbFilename = C:\Thương mại điện tử\ontap_cuoiki\ontap_cuoiki\App_Data\Ontap.mdf; Integrated Security = True");
            con.Open();//Mo ket noi
        }
        private void dongknoi()
        {
            //neu ket noi dang moi
            if (con.State == ConnectionState.Open)
                con.Close();
        }
        public DataTable getdata(String sql)
        {
            DataTable dt = new DataTable();
            try {
                knoi();//mo Ket noi
                SqlDataAdapter adap = new SqlDataAdapter(sql, con);
                adap.Fill(dt);//do du lieu vao dt
            }
            catch
            {
                dt = null;
            }
            finally
            {
                dongknoi();
            }
            return dt;//Ket qua tra ve la mot dataTable
        }
    }
}