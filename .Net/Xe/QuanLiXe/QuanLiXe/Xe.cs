using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLiXe
{
   public class Xe
    {
        string bienSo;
        string tenXe;
        int trongTai;
        DateTime ngayDangKiem;
        int tieuChuanBang;

        public string BienSo { get => bienSo; set => bienSo = value; }

        public Xe()
        {
        }

        public Xe(string bienSo, string tenXe, int trongTai, DateTime ngayDangKiem, int tieuChuanBang)
        {
            this.bienSo = bienSo;
            this.tenXe = tenXe;
            this.trongTai = trongTai;
            this.ngayDangKiem = ngayDangKiem;
            this.tieuChuanBang = tieuChuanBang;
        }

        public virtual void nhap()
        {
            Console.Write("nhap vao bien so xe: ");
            string biensoNhap=Console.ReadLine();
            this.bienSo = biensoNhap;
            Console.WriteLine("Nhap vao ten xe: ");
            string tenXeNhap = Console.ReadLine();
            this.tenXe = tenXeNhap;
            Console.WriteLine("nhap vao trong tai xe: ");
            int trongTai = int.Parse(Console.ReadLine());
            Console.WriteLine("Nhap ngay dang kiem: ");
            this.ngayDangKiem = DateTime.Parse(Console.ReadLine());
            Console.WriteLine("Nhap vao tieu chuan bang: ");
            this.tieuChuanBang = int.Parse(Console.ReadLine());
        }
        public virtual void xuat()
        {
            Console.WriteLine("Bien so xe: ", this.bienSo);
            Console.WriteLine("Ten xe: ", this.tenXe);
            Console.WriteLine("Trong tai xe: ", this.trongTai);
            Console.WriteLine("Ngay dang kiem xe: ", this.ngayDangKiem);
            Console.WriteLine("Tieu chuan bang: ", this.tieuChuanBang);
        }
    }
}
