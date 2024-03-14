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
    public partial class frm_DangNhap : Form
    {
        LOPDUNGCHUNG lopchung = new LOPDUNGCHUNG();
        public frm_DangNhap()
        {
            InitializeComponent();
        }

        private void ck_HienThiMatKhau_CheckedChanged(object sender, EventArgs e)
        {
            if (ck_HienThiMatKhau.Checked == true)
                txt_MatKhau.UseSystemPasswordChar = false;
            else txt_MatKhau.UseSystemPasswordChar = true;
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void btn_DangNhap_Click(object sender, EventArgs e)
        {
            string sql = "Select COUNT (*) from ACCOUNT where USERNAME = '" + txt_TenDangNhap.Text + "' and PASSWORD = '" + txt_MatKhau.Text + "'";
            int kq = (int)lopchung.LayGT(sql);
            if (kq >= 1)
            {
                MessageBox.Show("Đăng nhập thành công");
                frm_Main sv = new frm_Main();
                sv.Show();
            }
            else MessageBox.Show("Sai tên hoặc mật khẩu, đăng nhập thất bại");
        }

        private void btn_Thoat_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }
    }
}
