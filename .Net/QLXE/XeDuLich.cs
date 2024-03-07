using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QLXE
{
    class XeDuLich :Xe
    {
        int sochongoi;
        public int Sochongoi
        {
            get
            {
                return sochongoi;
            }

            set
            {
                sochongoi = value;
            }
        }
        public override void Nhap()
        {
            base.Nhap();
            Console.WriteLine("Nhap vao so cho ngoi xe du lich");
            Sochongoi = int.Parse(Console.ReadLine());
        }
        public override void Xuat()
        {
            base.Xuat();
            Console.WriteLine("So cho ngoi xe la: " + Sochongoi);

        }
    }
}
