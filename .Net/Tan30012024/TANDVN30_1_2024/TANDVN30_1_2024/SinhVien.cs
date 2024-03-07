using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TANDVN30_1_2024
{
    class SinhVien
    {
        private string mssv;
        private string hoten;
        private string diachi;
        private DateTime ngaysinh;
        public string Mssv { get => mssv; set => mssv = value; }
        public string Hoten { get => hoten; set => hoten = value; }
        public string Diachi { get => diachi; set => diachi = value; }
        public DateTime Ngaysinh { get => ngaysinh; set => ngaysinh = value; }

        public virtual void Nhap()
        {
            Console.Write("\nNhap ma so sinh vien: ");
            Mssv = Console.ReadLine();
            Console.Write("\nNhap Ho ten: ");
            Hoten = Console.ReadLine();
            Console.Write("\nNhap dia chi: ");
            Diachi = Console.ReadLine();
            while (true)
            {
                try
                {

                    Console.Write("\nNhap ngay thang nam sinh: ");
                    Ngaysinh = DateTime.Parse(Console.ReadLine());
                    break;
                }
                catch (FormatException)
                {
                    Console.Write("\nNgay sinh sai hoac khong dung dinh dang, vui long nhap lai!!");
                }

            }

        }
        public virtual void Xuat()
        {
            Console.Write($"\nHo ten: {Hoten} \nMa so sinh vien: {Mssv} \nDia chi: {Diachi} \nNgay sinh: {Ngaysinh} \n");
        }
        public virtual double Diemtb()
        {
            return 0;
        }
        public virtual void TinhXepLoai()
        {
            while (Diemtb() >= 0 && Diemtb() <= 10)
            {
                if (Diemtb() >= 8)
                {
                    Console.Write("\nXep loai gioi!!!");
                }
                else if (Diemtb() >= 6.5)
                {
                    Console.Write("\nXep loai kha!!!");
                }
                else if (Diemtb() >= 5)
                {
                    Console.Write("\nXep loai trung binh!!!");
                }
                else
                {
                    Console.Write("\nXep lai yeu!!!");
                }
            }

        }
    }
}

