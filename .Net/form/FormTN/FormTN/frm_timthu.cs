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
    public partial class frm_timthu : Form
    {
        public frm_timthu()
        {
            InitializeComponent();
        }

        private void btn_tim_Click(object sender, EventArgs e)
        {
            string thu = txt_thu.Text;
            string thutxt;
            switch (thu)
            {
                case "2":
                    thutxt = "thu hai";
                    break;
                case "3":
                    thutxt = "thu ba";
                    break;
                case "4":
                    thutxt = "thu tu";
                    break;
                case "5":
                    thutxt = "thu nam";
                    break;
                case "6":
                    thutxt = "thu sau";
                    break;
                case "7":
                    thutxt = "thu bay";
                    break;
                case "8":
                    thutxt = "chu nhat";
                    break;
                default:
                    thutxt = "Nhap sai";
                    break;
            }
            MessageBox.Show(thutxt);
        }
    }
}
