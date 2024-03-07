using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLiXe
{
    class HopDongChoThue
    {
         string sohopdong;
        string bs;
        int songaythue;
        Manage qlxe;
        KhachHang kh;
        NhanVien nv;

        public string Sohopdong { get => sohopdong; set => sohopdong = value; }

        public HopDongChoThue()
        {
            qlxe = new Manage();
            kh = new KhachHang();
            nv = new NhanVien();
        }
        public void Nhap()
        {
            Console.WriteLine("Nhap vao so hop dong: ");
            this.sohopdong = Console.ReadLine();
            qlxe.nhap();
            Console.WriteLine("Nhap vao bien so xe can thue");
            bs = Console.ReadLine();
            if (qlxe.List.ContainsKey(bs))
            {
                Console.WriteLine("Co xe can thue");
                Console.WriteLine("Nhap vao so ngay thue");
                songaythue = int.Parse(Console.ReadLine());
                nv.nhap();
                kh.nhap();
            }
            else Console.WriteLine("Khong co xe can thue");
        }
        public void Xuat()
        {
            qlxe.List[bs].xuat();
            Console.WriteLine("So tien can phai tra la:" + ThanhTien());
            nv.xuat();
            kh.xuat();
        }
        public double ThanhTien()
        {
            if (qlxe.List[bs] is XeChoHang)
            {
                return songaythue * 500000;
            }
            else
            {
                if (((xeDuLich)qlxe.List[bs]).SoChoNgoi <= 5)
                {
                    return songaythue * 500000;
                }
                else
                {
                    if (((xeDuLich)qlxe.List[bs]).SoChoNgoi <= 7)
                    {
                        return songaythue * 700000;
                    }
                }
            }
            return songaythue * 1000000;
        }

    }
}
