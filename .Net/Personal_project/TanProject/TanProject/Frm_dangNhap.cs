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
    public partial class Frm_dangNhap : Form
    {
        LOPDUNGCHUNG lopchung = new LOPDUNGCHUNG();
        public Frm_dangNhap()
        {
            InitializeComponent();
        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void btn_DangNhap_Click(object sender, EventArgs e)
        {
            string sql = "Select COUNT (*) from TAIKHOAN where TENTAIKHOAN = '" + txt_TaiKhoan.Text + "' and MATKHAU = '" + txt_MatKhau.Text + "'";
            int kq = (int)lopchung.LayGT(sql);
            if (kq >= 1)
            {
                MessageBox.Show("Đăng nhập thành công");
                frm_TrangChu sv = new frm_TrangChu();
                sv.Show();
            }
            else MessageBox.Show("Sai tên hoặc mật khẩu, đăng nhập thất bại");
        }

        private void ck_HienThiMatKhau_CheckedChanged(object sender, EventArgs e)
        {
            if (ck_HienThiMatKhau.Checked == true)
                txt_MatKhau.UseSystemPasswordChar = false;
            else txt_MatKhau.UseSystemPasswordChar = true;
        }
    }
}
