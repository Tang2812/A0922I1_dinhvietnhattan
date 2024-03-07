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
    public partial class frm_NhapMang : Form
    {
        public frm_NhapMang()
        {
            InitializeComponent();
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void label4_Click(object sender, EventArgs e)
        {

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void btn_TinhToan_Click(object sender, EventArgs e)
        {
            // Đọc dữ liệu từ textbox vào một chuỗi
            string input = Txt_MangA.Text;

            // Tách chuỗi thành các số nguyên, sử dụng dấu phẩy làm dấu phân cách
            string[] numberStrings = input.Split(' ');

            // Khai báo mảng số nguyên để lưu trữ các số sau khi chuyển đổi từ chuỗi
            int[] numbers = new int[numberStrings.Length];

            // Chuyển đổi từ chuỗi sang số nguyên và lưu vào mảng
            int tong = 0;
            int tl = 0;
            int tc = 0;
            for (int i = 0; i < numberStrings.Length; i++)
            {
                numbers[i] = int.Parse(numberStrings[i]);
                tong = tong + numbers[i];
                if (numbers[i] % 2 == 0)
                {
                    tc = tc + numbers[i];
                }
                else
                {
                    tl = tl + numbers[i];
                }
            }
     
            Txt_TongCacSo.Text = tong.ToString();
            Txt_TongSoChan.Text = tc.ToString();
            txt_TongSoLe.Text = tl.ToString();

        }

        private void Btn_LamMoi_Click(object sender, EventArgs e)
        {
            Txt_MangA.Text = "";
            Txt_TongCacSo.Text = "";
            Txt_TongSoChan.Text = "";
            txt_TongSoLe.Text = "";
        }

        private void Btn_Thoat_Click(object sender, EventArgs e)
        {

            DialogResult dt = MessageBox.Show("Ban co muon thoat hay khong", "thong bao", MessageBoxButtons.YesNo, MessageBoxIcon.Warning);
            if (dt == DialogResult.Yes)
            {
                Application.Exit();
            }
        }

     
    }
}
