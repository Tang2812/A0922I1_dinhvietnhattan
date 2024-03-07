using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QLXE
{
    class HopDongChoThue
    {
        string bs;
        int songaythue;
        QLXE qlxe;
        KhachHang kh;
        NhanVien nv;
        public HopDongChoThue()
        {
            qlxe = new QLXE();
            kh = new KhachHang();
            nv = new NhanVien();
        }
        public void Nhap()
        {
            qlxe.Nhap();
            Console.WriteLine("Nhap vao bien so xe can thue");
            bs = Console.ReadLine();
            if (qlxe.List.ContainsKey(bs))
            {
                Console.WriteLine("Co xe can thue");
                Console.WriteLine("Nhap vao so ngay thue");
                songaythue = int.Parse(Console.ReadLine());
                nv.Nhap();
                kh.Nhap();
            }
            else Console.WriteLine("Khong co xe can thue");
        }
        public void Xuat()
        {
            qlxe.List[bs].Xuat();
            Console.WriteLine("So tien can phai tra la:" + ThanhTien());
            nv.Xuat();
            kh.Xuat();
        }
        public double ThanhTien()
        {
            if (qlxe.List[bs] is XeChoHang)
            {
                return songaythue * 500000;
            }
            else
            {
                if (((XeDuLich)qlxe.List[bs]).Sochongoi <= 5)
                {
                    return songaythue * 500000;
                }
                else
                {
                    if (((XeDuLich)qlxe.List[bs]).Sochongoi <= 7)
                    {
                        return songaythue * 700000;
                    }
                }
            }
            return songaythue * 1000000;
        }
    }
}
