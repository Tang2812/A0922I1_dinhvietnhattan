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
    public partial class frm_PTB2 : Form
    {
        public frm_PTB2()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }
        static string giaiPTBac2(float a, float b, float c)
        {
            // kiem tra cac he so
            if (a == 0)
            {
                if (b == 0)
                {
                    return "Phuong trinh vo nghiem!";
                }
                else
                {
                    return "Phuong trinh co mot nghiem: x = " + (-c / b);
                }
            }
            float delta = b * b - 4 * a * c;
            float x1;
            float x2;
            if (delta > 0)
            {
                x1 = (float)((-b + Math.Sqrt(delta)) / (2 * a));
                x2 = (float)((-b - Math.Sqrt(delta)) / (2 * a));
                return "Phuong trinh co 2 nghiem x1 va x2: " + x1 + " " + x2;
            }
            else if (delta == 0)
            {
                x1 = (-b / (2 * a));
                return "Phong trinh co nghiem kep: x1 = x2 = " + x1;
            }
            else
            {
                return "Phuong trinh vo nghiem!";
            }
        }
        private void BTN_GIAI_Click(object sender, EventArgs e)
        {
            float a = float.Parse(TXB_HSA.Text.ToString());
            float b = float.Parse(TXB_HSB.Text.ToString());
            float c = float.Parse(TXB_HSC.Text.ToString());
            string s = giaiPTBac2(a, b, c);
            TXB_KQ.Text = s;

        }
    }
}
