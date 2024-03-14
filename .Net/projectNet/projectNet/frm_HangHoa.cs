using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace projectNet
{
    public partial class frm_HangHoa : Form
    {
        LOPDUNGCHUNG lopchung = new LOPDUNGCHUNG();
        private void frm_HangHoa_Load(object sender, EventArgs e)
        {
            LoadHH();

        }
        public void LoadHH()
        {
            string sql = "Select * from HANGHOA";
            string sqlPhanLoai = "Select TENLOAI from PHANLOAI";
            //DataTable dt = lopchung.LoadDL(sql);
            dt_DanhSach.DataSource = lopchung.LoadDL(sql);
            cb_PhanLoai.DataSource = lopchung.LoadDL(sqlPhanLoai);
            cb_PhanLoai.DisplayMember = "TENLOAI";
            cb_PhanLoai.ValueMember = "TENLOAI";

        }
        public frm_HangHoa()
        {
            InitializeComponent();
        }

        private void btn_Them_Click(object sender, EventArgs e)
        {
            string sql = "Insert into HANGHOA values ('"+txt_MaHangHoa.Text+"', N'"+txt_TenHangHoa.Text+"', N'"+ txt_SoLuong.Text +"', N'"+txt_XuatXu.Text+"', N'"+cb_PhanLoai.Text+"', N'"+txt_MoTa.Text+"')";
            int kq = lopchung.ThemXoaSua(sql);
            if (kq >= 1) MessageBox.Show("Thêm sản phẩm thành công");
            else MessageBox.Show("Thêm sản phẩm thất bại");
            LoadHH();
        }

        private void btn_Sua_Click(object sender, EventArgs e)
        {
            string sql = "Update HANGHOA set TENHANGHOA = N'" + txt_TenHangHoa.Text + "',SOLUONG = '"+txt_SoLuong.Text+"',XUATXU = '" + txt_XuatXu.Text + "',PHANLOAI='"+ cb_PhanLoai.Text + "' where MAHH ='" + txt_MaHangHoa.Text + "'";
            int kq = lopchung.ThemXoaSua(sql);
            if (kq >= 1) MessageBox.Show("Cập nhật hàng hóa thành công");
            else MessageBox.Show("Cập nhật hàng hóa thất bại");
            LoadHH();
        }

        private void dt_DanhSach_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            txt_MaHangHoa.Text = dt_DanhSach.CurrentRow.Cells["MAHH"].Value.ToString();
            txt_TenHangHoa.Text = dt_DanhSach.CurrentRow.Cells["TENHANGHOA"].Value.ToString();
            txt_SoLuong.Text = dt_DanhSach.CurrentRow.Cells["SOLUONG"].Value.ToString();
            txt_XuatXu.Text = dt_DanhSach.CurrentRow.Cells["XUATXU"].Value.ToString();
            cb_PhanLoai.Text = dt_DanhSach.CurrentRow.Cells["PHANLOAI"].Value.ToString();
            txt_MoTa.Text = dt_DanhSach.CurrentRow.Cells["MOTA"].Value.ToString();
        }

        private void btn_Xoa_Click(object sender, EventArgs e)
        {
            string sql = "Delete HANGHOA where MAHH = '" + txt_MaHangHoa.Text + "'";
            int kq = lopchung.ThemXoaSua(sql);
            if (kq >= 1) MessageBox.Show("Xoá hàng hóa thành công");
            else MessageBox.Show("Xoá hàng hóa thất bại");
            LoadHH();
        }
    }
}
