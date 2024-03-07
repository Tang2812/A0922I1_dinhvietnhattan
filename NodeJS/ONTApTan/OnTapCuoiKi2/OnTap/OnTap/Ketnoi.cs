using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Data;
using System.Data.SqlClient;
namespace OnTap
{
    public class Ketnoi
    {
        SqlConnection connect;
       public void connectData()
        {
            connect = new SqlConnection(@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Thương mại điện tử\ONTApTan\OnTapCuoiKi2\OnTap\OnTap\App_Data\Data.mdf;Integrated Security=True");
            connect.Open();
   
        }
        public void disconnectData()
        {
            if (connect.State == ConnectionState.Open)
            {
                connect.Close();

            }
        }
        //lay du lieu
        public DataTable getData(String sql)
        {
            DataTable da = new DataTable();
            try
            {
                connectData();
                SqlDataAdapter adapt = new SqlDataAdapter(sql, connect);
                adapt.Fill(da);
            }
            catch
            {
                da = null;
            }
            finally
            {
                disconnectData();
            }
            return da;
        }
    }
}