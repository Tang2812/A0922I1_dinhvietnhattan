using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLyXe
{
    class XeChoHang : Xe
    {
        double soTan;

        public XeChoHang()
        {
        }

        public XeChoHang(string bienSo, string tenXe, int trongTai, DateTime ngayDangKiem, 
            int tieuChuanBang, double soTan)
            : base(bienSo, tenXe, trongTai, ngayDangKiem, tieuChuanBang)
        {
            this.SoTan = soTan;
        }

        public double SoTan { get => soTan; set => soTan = value; }
        //public double SoTan
        //{
        //    get { return soTan; }
        //    set { soTan = value; }
        //}
        
        public override void Nhap()
        {
            Console.WriteLine("Nhập thông tin xe Chở Hàng");
            base.Nhap();
            Console.WriteLine("Nhập số tấn");
            this.SoTan = int.Parse(Console.ReadLine());
        }
        public override void Xuat()
        {
            Console.WriteLine("----------------------*** Thông tin Xe Chở Hàng ***---------------------");
            base.Xuat();
            Console.WriteLine("Số Tấn là: {0}", this.SoTan);
        }
    }
}
