using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLiXe
{
    class Program
    {
        static void Main(string[] args)
        {
            Manage manage = new Manage();
            //manage.menu();
            //NhanVien nhanVien = new NhanVien();
            //nhanVien.nhap();
            //nhanVien.xuat();
            //KhachHang khach = new KhachHang();
            //khach.nhap();
            //khach.xuat();
            QuanLiHopDong quanLiHopDong = new QuanLiHopDong();
            quanLiHopDong.menu();
            //while (true)
            //{
            //    Console.WriteLine("Moi ban chon: \r\n" +
            //        "1.Quan Li Xe\r\n" +
            //        "2.Quan li hop dong\r\n" +
            //        "3.Thoat\r\n");
            //    int chon = int.Parse(Console.ReadLine());
            //    if (chon == 3) { break; }
            //    else
            //    {
            //        if (chon == 1)
            //        {
            //            manage.menu();
            //        }
            //        else
            //        {
            //            if (chon == 2)
            //            {
            //                quanLiHopDong.menu();
            //            }
            //        }
            //    }
            //}

        }
    }
}
