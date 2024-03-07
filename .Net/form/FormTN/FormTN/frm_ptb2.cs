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
    public partial class frm_ptb2 : Form
    {
        public frm_ptb2()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void btn_giai_Click(object sender, EventArgs e)
        {
            double a = double.Parse(txt_HeSoA.Text);
            double b = double.Parse(txt_HeSoB.Text);
            double c = double.Parse(Txt_HeSoC.Text);
            double delta = b * b - 4 * a * c;

            if (delta < 0)
            {
                MessageBox.Show("Vo Nghiem");
            }
            else if (delta == 0)
            {
                double x = -b / (2 * a);
                txt_KetQua.Text=x.ToString();
            }
            else
            {
                double x1 = (-b + Math.Sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.Sqrt(delta)) / (2 * a);
                string result = x1.ToString() + " va " + x2.ToString();
                txt_KetQua.Text = result;
            }
        }

        private void btn_thoat_Click(object sender, EventArgs e)
        {

            DialogResult dt = MessageBox.Show("Ban co muon thoat hay khong", "thong bao", MessageBoxButtons.YesNo, MessageBoxIcon.Warning);
            if (dt == DialogResult.Yes)
            {
                Application.Exit();
            }
        }
    }
}
