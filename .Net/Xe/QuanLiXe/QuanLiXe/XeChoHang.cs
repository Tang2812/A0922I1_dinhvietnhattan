using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLiXe
{
    class XeChoHang :Xe
    {
        double soTan;
        public double SoTan { get => soTan; set => soTan = value; }
        public XeChoHang() : base() { }
        public XeChoHang(string BienSo, string TenXe, int TrongTai, DateTime NgayDangKiem, int TieuChuanBang, double soTan)
         : base(BienSo, TenXe, TrongTai, NgayDangKiem, TieuChuanBang)
        {
            this.soTan = soTan;   
        }
        public override void nhap()
        {
            base.nhap();
            Console.WriteLine("Nhap vao so Tan: ");
            this.soTan = double.Parse(Console.ReadLine());

        }
        public override void xuat()
        {
            base.xuat();
            Console.WriteLine("So tan la: " + soTan);
        }
    }
}
