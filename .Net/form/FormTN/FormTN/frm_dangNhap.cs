using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace FormTN
{
    public partial class frm_dangNhap : Form
    {
        public frm_dangNhap()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void btn_Thoat_Click(object sender, EventArgs e)
        {
           DialogResult dt= MessageBox.Show("Ban co muon thoat hay khong","thong bao",MessageBoxButtons.YesNo,MessageBoxIcon.Warning);
            if (dt == DialogResult.Yes)
            {
                Application.Exit();
            }
        }

        private void btn_dangNhap_Click(object sender, EventArgs e)
        {
            int dem = 0;
            if (txt_TenDangNhap.Text.ToLower() == "admin" && txt_MatKhau.Text == "123456")
            {
                frm_tt frm_Tt = new frm_tt();
                frm_Tt.Show();
            }
            else
            {
                dem++;
                MessageBox.Show("Ban da nhap sai " + dem.ToString()+" lan");
                if (dem == 3)
                {
                    Application.Exit();
                }

            }
        }
    }
}
