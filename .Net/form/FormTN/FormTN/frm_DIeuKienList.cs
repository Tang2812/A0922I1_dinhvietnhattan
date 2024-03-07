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
    public partial class frm_DIeuKienList : Form
    {
        public frm_DIeuKienList()
        {
            InitializeComponent();
        }

        private void listBox2_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void Lib_A_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void btn_1_Click(object sender, EventArgs e)
        {
            
            for (int i = Lib_A.SelectedItems.Count-1; i >= 0; i--)
            {
                Lib_B.Items.Add(Lib_A.SelectedItems[i]);
                Lib_A.Items.Remove(Lib_A.SelectedItems[i]);
            }
            Lib_B.Sorted = true;
            Lib_A.Sorted = true;
        }

        private void btn_3_Click(object sender, EventArgs e)
        {
            for (int i = Lib_B.SelectedItems.Count - 1; i >= 0; i--)
            {
                Lib_A.Items.Add(Lib_B.SelectedItems[i]);
                Lib_B.Items.Remove(Lib_B.SelectedItems[i]);
            }
            Lib_B.Sorted = true;
            Lib_A.Sorted = true;
        }

        private void btn_2_Click(object sender, EventArgs e)
        {
            for (int i = Lib_A.Items.Count - 1; i >= 0; i--)
            {
                Lib_B.Items.Add(Lib_A.Items[i]);
                Lib_A.Items.Remove(Lib_A.Items[i]);
            }
            Lib_A.Items.Clear();
            Lib_B.Sorted = true;
           
        }

        private void btn_4_Click(object sender, EventArgs e)
        {
            for (int i = Lib_B.Items.Count - 1; i >= 0; i--)
            {
                Lib_A.Items.Add(Lib_B.Items[i]);
              
            }
            Lib_B.Items.Clear();
            Lib_A.Sorted = true;
        }
        Dictionary<string, string[]> ho = new Dictionary<string, string[]>();
        private void frm_DIeuKienList_Load(object sender, EventArgs e)
        {
            ho.Add("Nguyen", new string[] { "Nguyen Nhi", "Nguyen Tan", "Nguyen Khoa" });
            ho.Add("Le", new string[] { "Le Nhi", "Le Tan", "Le Khoa" });
            ho.Add("Tran", new string[] { "Tran Nhi", "Tran Tan", "Tran Khoa" });
            foreach(string H in ho.Keys)
            {
                cb_1.Items.Add(H);
            }
        }
    }
}
