using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Data;
namespace WebApplication1
{
    public class Ketnoi
    {
        SqlConnection connectData;
        void ConnectData()
        {
            connectData = new SqlConnection(@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Thương mại điện tử\ONTApTan\OnTapCuoiKi4\WebApplication1\WebApplication1\App_Data\Database1.mdf;Integrated Security=True");
            connectData.Open();
        }
        void disConnectData()
        {
            if (connectData.State == ConnectionState.Open)
            {
                connectData.Close();
            }
        }
        public DataTable getData(string sql)
        {
            DataTable dt = new DataTable();
            try
            {
                ConnectData();
                SqlDataAdapter adapt = new SqlDataAdapter(sql, connectData);
                adapt.Fill(dt);
            }
            catch
            {
                dt = null;
            }
            finally
            {
                disConnectData();
            }
            return dt;
        }
    }
}