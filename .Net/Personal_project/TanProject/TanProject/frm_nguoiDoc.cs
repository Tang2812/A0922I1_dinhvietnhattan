using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace TanProject
{
    public partial class frm_nguoiDoc : Form
    {
        LOPDUNGCHUNG lopchung = new LOPDUNGCHUNG();
        public frm_nguoiDoc()
        {
            InitializeComponent();
        }

        private void label2_Click(object sender, EventArgs e)
        {
           
        }
        public void loadData()
        {
            string sql = "Select * from NguoiDoc";
            //DataTable dt = lopchung.LoadDL(sql);
            dt_NguoiDoc.DataSource = lopchung.LoadDL(sql);
        }
        
        private void frm_nguoiDoc_Load(object sender, EventArgs e)
        {
            loadData();
        }

        private void btn_Dem_Click(object sender, EventArgs e)
        {
            string sql = "Select COUNT (*) from NguoiDoc";
            int songuoi = (int)lopchung.LayGT(sql);
            txt_SoNguoiDoc.Text = songuoi.ToString();
        }

        private void dt_NguoiDoc_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            txb_manguoidoc.Text = dt_NguoiDoc.CurrentRow.Cells["MASO"].Value.ToString();
            Txb_TENNGUOIDOC.Text = dt_NguoiDoc.CurrentRow.Cells["TEN"].Value.ToString();
            txb_SODIENTHOAI.Text= dt_NguoiDoc.CurrentRow.Cells["SDT"].Value.ToString();
        }

        private void btn_Them_Click(object sender, EventArgs e)
        {
            string sql = "Insert into NguoiDoc values ('" + txb_manguoidoc.Text + "', N'" + Txb_TENNGUOIDOC.Text + "', N'" + txb_SODIENTHOAI.Text + "')";
            int kq = lopchung.ThemXoaSua(sql);
            if (kq >= 1) MessageBox.Show("Thêm người đọc thành công");
            else MessageBox.Show("Thêm người đọc thất bại");
            loadData();
        }

        private void btn_Xoa_Click(object sender, EventArgs e)
        {
            string sql = "Delete NguoiDoc where MASO = '" + txb_manguoidoc.Text + "'";
            int kq = lopchung.ThemXoaSua(sql);
            if (kq >= 1) MessageBox.Show("Xoá người đọc  thành công");
            else MessageBox.Show("Xoá người đọc  thất bại");
            loadData();
        }

        private void btn_Sua_Click(object sender, EventArgs e)
        {
            string sql = "Update NguoiDoc set TEN = N'" + Txb_TENNGUOIDOC.Text + "',SDT = N'" + txb_SODIENTHOAI.Text +"' where MASO ='" + txb_manguoidoc.Text + "'";
            int kq = lopchung.ThemXoaSua(sql);
            if (kq >= 1) MessageBox.Show("Cập nhật người đọc thành công");
            else MessageBox.Show("Cập nhật người đọc  thất bại");
            loadData();
        }
    }
}
