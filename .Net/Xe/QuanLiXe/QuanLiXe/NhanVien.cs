using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLiXe
{
    class NhanVien : Nguoi
    {
        string maNV;
        DateTime ngayVaoCoQuan;
        public override void nhap()
        {
            Console.WriteLine("Nhap vao so CM: ");
            this.Scm = Console.ReadLine();
            Console.WriteLine("Nhap vao Ho ten: ");
            this.Hoten = Console.ReadLine();
            Console.WriteLine("Nhap vao dia chi: ");
            this.Diachi = Console.ReadLine();
            Console.WriteLine("Nhap vao so DT: ");
            this.Dienthoai = Console.ReadLine();
            Console.WriteLine("Nhap vao ma NV: ");
            this.maNV = Console.ReadLine();
            Console.WriteLine("Nhap vao Ngay vao co quan: ");
            this.ngayVaoCoQuan = DateTime.Parse(Console.ReadLine());
          
        }

        public override void xuat()
        {
            Console.WriteLine("Thong tin nhan vien: \r\n");
            Console.WriteLine(this.Scm);
            Console.WriteLine(this.Hoten);
            Console.WriteLine(this.Diachi);
            Console.WriteLine(this.Dienthoai);
            Console.WriteLine(this.maNV);
            Console.WriteLine(this.ngayVaoCoQuan);
         
        }
    }
}
