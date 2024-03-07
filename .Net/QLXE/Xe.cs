using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QLXE
{
    class Xe
    {
        string bienso, tenxe;
        int trongtai, tieuchuangbang;
        DateTime ngaydangkiem;
        public string Bienso
        {
            get
            {
                return bienso;
            }

            set
            {
                bienso = value;
            }
        }
        public string Tenxe
        {
            get
            {
                return tenxe;
            }

            set
            {
                tenxe = value;
            }
        }
        public int Trongtai
        {
            get
            {
                return trongtai;
            }

            set
            {
                trongtai = value;
            }
        }
        public int Tieuchuangbang
        {
            get
            {
                return tieuchuangbang;
            }

            set
            {
                tieuchuangbang = value;
            }
        }
        public DateTime Ngaydangkiem
        {
            get
            {
                return ngaydangkiem;
            }

            set
            {
                ngaydangkiem = value;
            }
        }
        public virtual void Nhap()
        {
            Console.WriteLine("*****Nhap vao thong tin xe*****");
            Console.WriteLine("Nhap vao bien so xe");
            Bienso = Console.ReadLine();
            Console.WriteLine("Nhap vao ten xe");
            Tenxe = Console.ReadLine();
            Console.WriteLine("Nhap vao trong tai xe");
            Trongtai = int.Parse(Console.ReadLine());
            Console.WriteLine("Nhap vao tieu chuan bang xe");
            Tieuchuangbang = int.Parse(Console.ReadLine());
            Console.WriteLine("Nhap vao ngay dang kiem xe");
            Ngaydangkiem = DateTime.Parse(Console.ReadLine());
        }
        public virtual void Xuat()
        {
            Console.WriteLine("*****Thong tin xe*****");
            Console.WriteLine("Bien so xe la: " + Bienso);
            Console.WriteLine("Ten xe la: " + Tenxe);
            Console.WriteLine("Trong tai xe la: " + Trongtai);
            Console.WriteLine("Tieu chuan bang xe la: " + Tieuchuangbang);
            Console.WriteLine("Ngay dang kiem xe la: " + Ngaydangkiem);
        }
    }
}
