using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QLXE
{
    class XeChoHang :Xe
    {

        int sotan;
        public int Sotan
        {
            get
            {
                return sotan;
            }

            set
            {
                sotan            }
        }
        public override void Nhap()
        {
            base.Nhap();
            Console.WriteLine("Nhap vao so tan xe cho hang");
           Sotan = int.Parse(Console.ReadLine());
        }
        public override void Xuat()
        {
            base.Xuat();
            Console.WriteLine("So tan xe cho hang la: " + Sotan);

        }
    }
}
