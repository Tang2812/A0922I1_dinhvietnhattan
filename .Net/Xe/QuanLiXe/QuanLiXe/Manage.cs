using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLiXe
{
    class Manage
    {
        Dictionary<string, Xe> list;
        public Dictionary<string, Xe> List { get => list; set => list = value; }
       public Manage()
        {
            this.list = new Dictionary<string, Xe>();
        }
        public void menu()
        {
           
            while (true)
            {
                Console.WriteLine("Moi ban chon chuc nang: \r\n" +
                    "1.Nhap\r\n" +
                    "2.Xuat\r\n" +
                    "3.Tim\r\n" +
                    "4.Xoa\r\n" +
                    "5:thoat\r\n");
                string luaChon = Console.ReadLine();
                if (luaChon == "0")
                    break;
                else if (luaChon == "1")
                    nhap();
                else if (luaChon == "2")
                    xuat();
                else if (luaChon == "3")
                    Tim();
                else if (luaChon == "4")
                    Xoa();
                else if (luaChon == "5")
                    break;
              
            }
        }
        public void nhap()
        {
            while (true)
            {
                Console.Write("=============Moi ban lua chon:==============\r\n" +
                    "Bam H de them xe cho hang\r\n" +
                    "Bam D de them xe du lich\r\n" +
                    "Bam Exit de thoat khoi chuong trinh\r\n");
                string chon = Console.ReadLine().ToLower();
                if (chon == "exit")
                {
                    break;
                }
                else
                {
                    if (chon == "h")
                    {
                        Xe xeNhap = new XeChoHang();
                        while (true)
                        {
                            try {
                                xeNhap.nhap();
                                list.Add(xeNhap.BienSo, xeNhap);
                                break;
                            }
                            catch
                            {
                                Console.WriteLine("Nhap loi,nhap lai");
                            }

                        }
                    }
                    else
                    {
                        if (chon == "d")
                        {
                            Xe xeNhap = new Xe();
                            while (true)
                            {
                                try
                                {
                                    xeNhap.nhap();
                                    list.Add(xeNhap.BienSo, xeNhap);
                                    break;
                                }
                                catch
                                {
                                    Console.WriteLine("Nhap loi,nhap lai");
                                }

                            }
                        }
                    }
                }
            }
        }
        void xuat()
        {
            Console.WriteLine("Xuat danh sach xe");
            foreach (Xe item in list.Values)
            {
                item.xuat();
            }
        }
        public Xe Tim()
        {
            Console.WriteLine("nhap bien so xe can tim");
            string bienSoTim = Console.ReadLine();
            int tim = 0;
            Xe X = null;
            foreach (Xe item in list.Values)
            {
                if (item.BienSo == bienSoTim)
                {
                    tim = 1;
                    X = item;
                    Console.WriteLine("bien xo xe can tim co xuat hien trong list: ", bienSoTim);
                    X.xuat();
                    break;
                }
            }
            if (tim == 0)
                Console.WriteLine("bien xo xe can tim khong xuat hien trong list: ", bienSoTim);
            return X;
        }
        public void Xoa()
        {
            Console.WriteLine("Nhập biển số xe cần xoá");
            string bienSoTim = Console.ReadLine();
            if (list.Remove(bienSoTim) == true)
                Console.WriteLine("Xoa thanh cong");
            else Console.WriteLine("Khong tim thay xe");
            Console.WriteLine("Danh sach sau khi xoa");
            xuat();
        }

    }
}
