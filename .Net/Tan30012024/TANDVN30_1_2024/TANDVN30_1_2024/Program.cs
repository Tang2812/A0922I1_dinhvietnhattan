using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TANDVN30_1_2024
{
    internal class Program
    {
        static void Main(string[] args)
        {
            
            Console.Write("\r\nNhap so luong sinh vien: ");
            int n = int.Parse(Console.ReadLine());
            SinhVienKCNTT[] svcntt = new SinhVienKCNTT[n];
            SinhVienDienTu[] svdt = new SinhVienDienTu[n];
            QuanLySV quanLySV = new QuanLySV();
            quanLySV.NhapvaXuat();
            for (int i = 0; i < n; i++)
            {
                Console.Write("\nNhap thong tin sinh vien CNTT thu {}:", i + 1);
                svcntt[i].Nhap();
            }

            for (int i = 0; i < svdt.Length; i++)
            {
                Console.Write("\nThong tin sinh vien CNTT thu {}:", i + 1);
                svcntt[i].Xuat();
            }

            for (int i = 0; i < n; i++)
            {
                Console.Write("\nNhap thong tin sinh vien DT thu {}:", i + 1);
                svdt[i].Nhap();
            }
            for (int i = 0; i < svdt.Length; i++)
            {
                Console.Write("\nThong tin sinh vien DT thu {}:", i + 1);
                svdt[i].Xuat();
            }
            int countHSG = 0, counHSK = 0, countHSTB = 0, countHSY = 0;
            for (int i = 0; i < svcntt.Length; i++)
            {
                if (svcntt[i].Diemtb() >= 8) countHSG += 1;
                if (svcntt[i].Diemtb() >= 6.5) counHSK += 1;
                if (svcntt[i].Diemtb() >= 5) countHSTB += 1;
                else countHSY += 1;
            }
            int counthsg = 0, counthsk = 0, counthstb = 0, counthsy = 0;
            for (int i = 0; i < svdt.Length; i++)
            {
                if (svdt[i].Diemtb() >= 8) counthsg += 1;
                if (svdt[i].Diemtb() >= 6.5) counthsk += 1;
                if (svdt[i].Diemtb() >= 5) counthstb += 1;
                else counthsy += 1;
            }
            Console.Write("\n=====KHOA CONG NGHE THONG TIN=====");
            Console.Write($"\nSo HSG: {countHSG} \nSo HSK: {counHSK} \nSo HSTB: {countHSTB} \nSo HSY: {countHSY}");
            Console.Write("\n=====KHOA DIEN TU=====");
            Console.Write($"\nSo HSG: {counthsg} \nSo HSK: {counthsk} \nSo HSTB: {counthstb} \nSo HSY: {counthsy}");
        }
    }
}
