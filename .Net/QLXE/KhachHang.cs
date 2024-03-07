using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QLXE
{
    class KhachHang :Nguoi
    {
        string makhachhang;
        DateTime hangbanglai;
        public string Makhachhang
        {
            get
            {
                return makhachhang;
            }

            set
            {
                makhachhang = value;
            }
        }
        public DateTime Hangbanglai
        {
            get
            {
                return hangbanglai;
            }

            set
            {
                hangbanglai = value;
            }
        }
        public override void Nhap()
        {
            Console.WriteLine("****Nhap vao thong tin khach hang****");
            Console.WriteLine("Nhap vao ma khach hang");
            Makhachhang = Console.ReadLine();
            Console.WriteLine("Nhap vao ho ten khach hang");
            Hoten = Console.ReadLine();
            Console.WriteLine("Nhap vao dia chi khach hang");
            Diachi = Console.ReadLine();
            Console.WriteLine("Nhap vao dien thoai khach hang");
            Dienthoai = Console.ReadLine();
            Console.WriteLine("Nhap vao so cm khach hang");
            Socm = int.Parse(Console.ReadLine());
            Console.WriteLine("Hang bang lai khách hang");
            Hangbanglai = DateTime.Parse(Console.ReadLine());
        }
        public override void Xuat()
        {
            Console.WriteLine("****Thong tin nhan vien****");
            Console.WriteLine("Ma nhan vien: " + Manhanvien);
            Console.WriteLine("Ho ten nhan vien: " + Hoten);
            Console.WriteLine("Dia chi nhan vien: " + Diachi);
            Console.WriteLine("Dien thoai nhan vien: " + Dienthoai);
            Console.WriteLine("So CMND nhan vien: " + Socm);
            Console.WriteLine("Ngay vao co quan nhan vien: " + Ngayvaocoquan);
        }
    }
}
