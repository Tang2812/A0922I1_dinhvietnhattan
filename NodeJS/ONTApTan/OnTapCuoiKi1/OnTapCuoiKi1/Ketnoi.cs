using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Data;
using System.Data.SqlClient;
namespace OnTapCuoiKi1
{
    public class Ketnoi
    {
        SqlConnection connect;
        //Ket noi database
        private void ConectData()
        {
            connect = new SqlConnection(@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Thương mại điện tử\ONTApTan\OnTapCuoiKi1\OnTapCuoiKi1\App_Data\DB.mdf;Integrated Security=True");
            connect.Open();
        }
        //Dong ket noi database
        private void DisconnectData()
        {
            if (connect.State == ConnectionState.Open)
            {
                connect.Close();
            }
        }
        //Lay du lieu
        public DataTable getData(string sql)
        {
            DataTable dt = new DataTable();
            try
            {
                ConectData();
                SqlDataAdapter adap = new SqlDataAdapter(sql, connect);
                adap.Fill(dt);

            }
            catch
            {
                dt = null;
            }
            finally
            {
                DisconnectData();
            }
            return dt;
        }
    }
}