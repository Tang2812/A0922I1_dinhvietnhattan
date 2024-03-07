using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QLXE
{
    class NhanVien :Nguoi
    {
        string manhanvien;
        DateTime ngayvaocoquan;
        public string Manhanvien
        {
            get
            {
                return manhanvien;
            }

            set
            {
                manhanvien = value;
            }
        }
        public DateTime Ngayvaocoquan
        {
            get
            {
                return ngayvaocoquan;
            }

            set
            {
                ngayvaocoquan = value;
            }
        }
        public override void Nhap()
        {
            Console.WriteLine("****Nhap vao thong tin nhan vien****");
            Console.WriteLine("Nhap vao ma nhan vien");
            Manhanvien = Console.ReadLine();
            Console.WriteLine("Nhap vao ho ten nhan vien");
            Hoten = Console.ReadLine();
            Console.WriteLine("Nhap vao dia chi nhan vien");
            Diachi = Console.ReadLine();
            Console.WriteLine("Nhap vao dien thoai nhan vien");
            Dienthoai = Console.ReadLine();
            Console.WriteLine("Nhap vao so cm nhan vien");
            Socm = int.Parse(Console.ReadLine());
            Console.WriteLine("Nhap vao ngay vao co quan nhan vien");
            Ngayvaocoquan = DateTime.Parse(Console.ReadLine());
        }
    }
}
