using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Data;
using System.Data.SqlClient;
namespace WebApplication1
{
    public class KetNoi
    {
        SqlConnection connect;
       public void connectData()
        {
            connect = new SqlConnection(@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Thương mại điện tử\ONTApTan\OnTapCuoiKi3\WebApplication1\WebApplication1\App_Data\Database1.mdf;Integrated Security=True");
            connect.Open();
        }
        public void disconnectData()
        {
            if (connect.State == ConnectionState.Open)
            {
                connect.Close();
            }
        }
        //Lay Du Lieu
       public DataTable getDuLieu(string sql)
        {
            DataTable dt = new DataTable();
            try
            {
                connectData();
                SqlDataAdapter adapt = new SqlDataAdapter(sql, connect);
                adapt.Fill(dt);
            }catch
            {
                dt = null;
            }
            finally
            {
                disconnectData();
            }
            return dt;
        }
    }
}