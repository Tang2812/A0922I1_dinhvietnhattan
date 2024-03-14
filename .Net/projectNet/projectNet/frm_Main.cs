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
    public partial class frm_Main : Form
    {
        public frm_Main()
        {
            InitializeComponent();
        }

        private void quảnLýHàngHóaToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (Application.OpenForms["frm_HangHoa"] == null)
            {
                frm_HangHoa sv = new frm_HangHoa();
                // Gán sinh viên form này là form con của form Main
                sv.MdiParent = this;
                // hiển thị form sinh viên
                sv.Show();
            }
            else
            {
                Application.OpenForms["frm_HangHoa"].Activate();
            }

        }

        private void menuStrip1_ItemClicked(object sender, ToolStripItemClickedEventArgs e)
        {

        }
    }
}
