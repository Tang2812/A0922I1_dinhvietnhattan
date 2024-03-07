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
    public partial class frm_BaiTap3 : Form
    {
        public frm_BaiTap3()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void dateTimePicker1_ValueChanged(object sender, EventArgs e)
        {
            //toolStripStatusLabel1.Text = DateTime.Now.ToString();
        }

        private void btn_1_Click(object sender, EventArgs e)
        {
            for (int i = Lib_A.SelectedItems.Count - 1; i >= 0; i--)
            {
                lib_MONHOC.Items.Add(Lib_A.SelectedItems[i]);
                Lib_A.Items.Remove(Lib_A.SelectedItems[i]);
            }
            lib_MONHOC.Sorted = true;
            Lib_A.Sorted = true;
        }

        private void btn_2_Click(object sender, EventArgs e)
        {
            for (int i = Lib_A.Items.Count - 1; i >= 0; i--)
            {
                lib_MONHOC.Items.Add(Lib_A.Items[i]);
                Lib_A.Items.Remove(Lib_A.Items[i]);
            }
            Lib_A.Items.Clear();
            lib_MONHOC.Sorted = true;
        }

        private void btn_3_Click(object sender, EventArgs e)
        {
            for (int i = lib_MONHOC.SelectedItems.Count - 1; i >= 0; i--)
            {
                Lib_A.Items.Add(lib_MONHOC.SelectedItems[i]);
                lib_MONHOC.Items.Remove(lib_MONHOC.SelectedItems[i]);
            }
            lib_MONHOC.Sorted = true;
            Lib_A.Sorted = true;
        }

        private void btn_4_Click(object sender, EventArgs e)
        {
            for (int i = lib_MONHOC.Items.Count - 1; i >= 0; i--)
            {
                Lib_A.Items.Add(lib_MONHOC.Items[i]);

            }
            lib_MONHOC.Items.Clear();
            Lib_A.Sorted = true;
        }

        private void btn_Nhap_Click(object sender, EventArgs e)
        {
            string str = txb_HOTEN.Text + "\r\n" + DT_NGAY.Text + " " + DT_GIO.Text + "\r\nMon Da chon: \r\n";
            for (int i = lib_MONHOC.Items.Count - 1; i >= 0; i--)
            {
                str=str+lib_MONHOC.Items[i]+"\r\n";

            }
            TXB_THONGTIN.Text = str;
        }

        private void Btn_LamTrong_Click(object sender, EventArgs e)
        {
            lib_MONHOC.Items.Clear();
            txb_HOTEN.Text = "";
            TXB_THONGTIN.Text = "";
        }
    }
}
