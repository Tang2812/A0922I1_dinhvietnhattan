using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TANDVN30_1_2024
{
    internal class SinhVienKCNTT :SinhVien
    {
 
        private float diemcs414;
        private float diemis311;
        private float diemcs311;

        
        public float Diemcs414 { get => diemcs414; set => diemcs414 = value; }
        public float Diemis311 { get => diemis311; set => diemis311 = value; }
        public float Diemcs311 { get => diemcs311; set => diemcs311 = value; }

        public SinhVienKCNTT()
        {

        }
        public override double Diemtb()
        {
            return (Diemcs311 + Diemcs414 + Diemis311) / 3;
        }

        public override void Nhap()
        {
            base.Nhap();
            Console.Write("\nNhap diem CS414: ");
            Diemcs414 = float.Parse(Console.ReadLine());
            Console.Write("\nNhap diem CS311: ");
            Diemcs311 = float.Parse(Console.ReadLine());
            Console.Write("\nNhap diem IS311: ");
            Diemis311 = float.Parse(Console.ReadLine());
        }

        public override void TinhXepLoai()
        {
            base.TinhXepLoai();
        }

        public virtual void Xuat()
        {
            base.Xuat();
            Console.Write($"DiemCS411 {Diemcs414} \nnDiemIS311: {Diemis311} \nDiemCS311: {Diemcs311}");
            Console.Write("\nDiem trung binh: {0} ", Diemtb());
        }
    }
}
