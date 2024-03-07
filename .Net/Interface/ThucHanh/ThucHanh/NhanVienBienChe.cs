using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ThucHanh
{
    class NhanVienBienChe : NhanVien, IPhuCap
    {
        double heSoLuong;
        int luongCoBan;
        public double HeSoLuong { get => heSoLuong; set => heSoLuong = value; }
        public int LuongCoBan { get => luongCoBan; set => luongCoBan = value; }

        public override void nhap()
           
        {
            base.nhap();
            Console.WriteLine("Nhap vao he so luong: ");
            HeSoLuong = double.Parse(Console.ReadLine());
            Console.WriteLine("Nhap vao luong co ban: ");
            LuongCoBan = int.Parse(Console.ReadLine());
        }
       public override void  xuat()
        {
            base.xuat();
            Console.WriteLine("He so luong: ", HeSoLuong);
            Console.WriteLine("Luong co ban: ", LuongCoBan);
        }
        public double PhuCap()
        {
            return  (double)LuongCoBan / 10;
        }

        public override double ThucLinh()
        {
           return  (double)HeSoLuong*LuongCoBan+PhuCap();
           
        }
    }
}
