using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ThucHanh
{
     class NhanVienHopDong : NhanVien, IPhuCap
    {
        int mucLuong;

        public int MucLuong { get => mucLuong; set => mucLuong = value; }

       public override void  nhap()
        {
            base.nhap();
            Console.WriteLine("Nhap vao muc luong: ");
            MucLuong = int.Parse(Console.ReadLine());
        }
      public  override void xuat()
        {
            base.xuat();
            Console.WriteLine("muc luong la: ", MucLuong);
        }
        public double PhuCap()
        {
            return (double)MucLuong / 10;
        }

        public override double ThucLinh()
        {
            return (double) MucLuong + PhuCap();
          ;
        }
    }
}
