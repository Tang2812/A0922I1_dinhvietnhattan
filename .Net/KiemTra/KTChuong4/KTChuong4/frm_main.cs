using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace KTChuong4
{
    public partial class frm_main : Form
    {
        public frm_main()
        {
            InitializeComponent();
        }

        private void baiTap3ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (Application.OpenForms["frm_BaiTap3"] == null)
            {
                frm_BaiTap3 sv = new frm_BaiTap3();
                sv.MdiParent = this;
                sv.Show();
            }
            else
            {
                Application.OpenForms["frm_BaiTap3"].Activate();
            }
        }

        private void toolscr_BT1_Click(object sender, EventArgs e)
        {
            if (Application.OpenForms["frm_PTB2"] == null)
            {
                frm_PTB2 sv = new frm_PTB2();
                sv.MdiParent = this;
                sv.Show();
            }
            else
            {
                Application.OpenForms["frm_PTB2"].Activate();
            }
        }

        private void tollscr_BT2_Click(object sender, EventArgs e)
        {
            if (Application.OpenForms["frm_BTLB"] == null)
            {
                frm_BTLB sv = new frm_BTLB();
                sv.MdiParent = this;
                sv.Show();
            }
            else
            {
                Application.OpenForms["frm_BTLB"].Activate();
            }
        }
    }
}
