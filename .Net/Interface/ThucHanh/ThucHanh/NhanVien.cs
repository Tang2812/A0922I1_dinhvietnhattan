using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ThucHanh
{
   abstract class NhanVien
    {
        string hoTen;
        DateTime namSinh;
        string gioiTinh;
        string cmnd;
        string maNV;

        public string HoTen { get => hoTen; set => hoTen = value; }
        public DateTime NamSinh { get => namSinh; set => namSinh = value; }
        public string GioiTinh { get => gioiTinh; set => gioiTinh = value; }
        public string Cmnd { get => cmnd; set => cmnd = value; }
        public string MaNV { get => maNV; set => maNV = value; }

        public virtual void nhap()
        {
            Console.WriteLine("nhap vao Ho Ten: ");
            this.HoTen=Console.ReadLine();
            Console.WriteLine("nhap vao nam sinh ");
            this.NamSinh = DateTime.Parse( Console.ReadLine());
            Console.WriteLine("nhap vao Gioi tinh: ");
            this.GioiTinh = Console.ReadLine();
            Console.WriteLine("nhap vao Cmnd: ");
            this.Cmnd = Console.ReadLine();
            Console.WriteLine("Nhap vao ma NV");
            this.MaNV = Console.ReadLine();
        }
        public virtual void xuat()
        {
            Console.WriteLine("Ho Ten: ", this.HoTen);
            Console.WriteLine("Nam sinh: ", this.NamSinh);
            Console.WriteLine("Gioi tinh: ", this.GioiTinh);
            Console.WriteLine("Cmnd: ", this.Cmnd);
            Console.WriteLine("Ma nhan vien: ", this.MaNV);
        }

        public abstract double ThucLinh();
    }
}
