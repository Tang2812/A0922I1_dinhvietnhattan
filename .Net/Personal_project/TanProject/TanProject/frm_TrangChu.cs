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
    public partial class frm_TrangChu : Form
    {
        public frm_TrangChu()
        {
            InitializeComponent();
        }

        private void quanLiSachToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (Application.OpenForms["frm_quanlisach"] == null)
            {
                frm_quanlisach sach = new frm_quanlisach();
                sach.MdiParent = this;
                sach.Show();
            }
            else
            {
                Application.OpenForms["frm_quanlisach"].Activate();
            }
        }

        private void quanLyNguoiDocToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (Application.OpenForms["frm_nguoiDoc"] == null)
            {
                frm_nguoiDoc nguoiDoc = new frm_nguoiDoc();
                nguoiDoc.MdiParent = this;
                nguoiDoc.Show();
            }
            else
            {
                Application.OpenForms["frm_nguoiDoc"].Activate();
            }

        }
    }
}
