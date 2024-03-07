using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLiXe
{
    class QuanLiHopDong
    {
        Dictionary<string, HopDongChoThue> so;
        public QuanLiHopDong()
        {
            so = new Dictionary<string, HopDongChoThue>();
        }
        public void menu()
        {
            int chon;
            while (true)
            {
                Console.WriteLine("Moi ban chon chuc nang quan li hop dong: \r\n" +
                        "1.Nhap\r\n" +
                         "2.tim\r\n" +
                        "3.xoa\r\n" +
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
                            this.luu();
                            break;
                        case 2:
                            this.tim();
                            break;
                        case 3:
                            this.xoa();
                            break;
                        default:
                            Console.WriteLine("Nhap sai, Nhap lai");
                            break;
                    }
                }
               

            }

        }
        public void luu()
        {

            HopDongChoThue hopDong = new HopDongChoThue();
            hopDong.Nhap();

            this.so.Add(hopDong.Sohopdong, hopDong);

        }

        public void tim()
        {
            Console.WriteLine("Nhap vao so hop dong can tim");
            string soHopDongFind = Console.ReadLine();
            if (so.ContainsKey(soHopDongFind))
            {
                so[soHopDongFind].Xuat();
            }
            else
            {
                Console.WriteLine("khong tim thay hop dong!");
            }
        }
        public void xoa()
        {
            Console.WriteLine("Nhap vao so hop dong can xoa");
            string soHopDongDel = Console.ReadLine();
            if (so.ContainsKey(soHopDongDel))
            {
                so.Remove(soHopDongDel);
                Console.WriteLine("Da xoa thanh cong");
            }
            else
            {
                Console.WriteLine("khong tim thay hop dong!");
            }
        }
    }
}
