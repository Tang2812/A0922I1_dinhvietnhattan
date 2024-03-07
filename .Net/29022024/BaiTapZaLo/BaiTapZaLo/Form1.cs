using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace BaiTapZaLo
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void chucNangToolStripMenuItem_Click(object sender, EventArgs e)
        {

        }

        private void toolStripDropDownButton1_Click(object sender, EventArgs e)
        {

        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            lb_NgayGio.Text = DateTime.Now.ToString();
        }

        private void lb_NgayGio_Click(object sender, EventArgs e)
        {
            lb_NgayGio.Text = DateTime.Now.ToString();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void BT_DANHSACHSV_Click(object sender, EventArgs e)
        {
            if (Application.OpenForms["frm_SV"] == null)
            {
                frm_SV sv = new frm_SV();
                sv.MdiParent = this;
                sv.Show();
            }
            else
            {
                Application.OpenForms["frm_sv"].Activate();
            }
        }

        private void BTN_THONGTINKH_Click(object sender, EventArgs e)
        {
            if (Application.OpenForms["frm_ThongTin"] == null)
            {
                frm_ThongTin tt = new frm_ThongTin();
                tt.MdiParent = this;
                tt.Show();
            }
            else
            {
                Application.OpenForms["frm_ThongTin"].Activate();
            }
        }
    }
}
