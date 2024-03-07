using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ThucHanh
{
    class DanhSach
    {
        Dictionary<string, NhanVien> list;
        public DanhSach()
        {
            list = new Dictionary<string, NhanVien>();
        }
        public void menu()
        {
            int chon;
            while (true)
            {
                Console.WriteLine("Moi ban lua chon:\r\n" +
                    "1.Nhap\r\n" +
                    "2.Xuat\r\n" +
                    "3.Tong luong\r\n" +
                    "4.Thoat\r\n");
                chon = int.Parse(Console.ReadLine());
                if (chon == 4)
                {
                    break;
                }
                else
                {
                    switch (chon)
                    {
                        case 1:
                            this.nhap();
                            break;
                        case 2:
                            this.xuat();
                            break;
                        case 3:
                            this.tongLuong();
                            break;
                        default:
                            Console.WriteLine("Nhap lai");
                            break;
                    }
                }
            }
        }
        public void nhap()
        {
            NhanVien nhap;
            while (true)
            {
                Console.WriteLine("Moi ban chon: \r\n" +
                    "1.Nham Vien Bien Che\r\n" +
                    "2.Nhan Vien Hop Dong\r\n" +
                    "3.Thoat\r\n");
                int chon = int.Parse(Console.ReadLine());
                if (chon == 3) { break; } else
                {
                    if (chon == 2)
                    {
                        nhap = new NhanVienHopDong();
                        nhap.nhap();
                        list.Add(nhap.MaNV, nhap);
                    }
                    else
                    {
                        if (chon == 1)
                        {
                            nhap = new NhanVienBienChe();
                            nhap.nhap();
                            list.Add(nhap.MaNV, nhap);
                        }
                        else
                        {
                            Console.WriteLine("Nhap sai nhap lai");
                        }
                    }
                }
            }
        }
        public void xuat()
        {
            foreach (NhanVien item in list.Values)
            {
                item.xuat();
            }
        }
        public void tongLuong()
        {
            double tong = 0;
            foreach (NhanVien item in list.Values)
            {
                tong = tong + item.ThucLinh();
            }
            Console.WriteLine("Tong luong la: {0}", tong);
        }
    }
}
