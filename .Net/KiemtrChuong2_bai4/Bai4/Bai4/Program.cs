using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Bai4
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Nhap vao so dong: ");
            int n = int.Parse(Console.ReadLine());

            Console.Write("Nhap vao so cot: ");
            int m = int.Parse(Console.ReadLine());

            int[,] Mang = new int[n, m];

            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < m; j++)
                {
                    Console.Write($"Nhap vao phan tu {i + 1}, cot {j + 1}: ");
                    Mang[i, j] = int.Parse(Console.ReadLine());
                }
            }

            // Tìm số lớn nhất trong mảng
            int max = Mang.Cast<int>().Max();
            Console.WriteLine($"Max= : {max}");

            // Xoá 1 dòng bất kỳ trong mảng 2 chiều
            Console.Write("Nhap dong muon xoa: ");
            int Xoa = Convert.ToInt32(Console.ReadLine()) - 1;

            int[,] newmang = new int[n - 1, m];
            int p = 0;
            for (int i = 0; i < n; i++)
            {
                if (i == Xoa) continue;
                for (int j = 0; j < m; j++)
                {
                    newmang[p, j] = Mang[i, j];
                }
                p++;
            }

            Console.WriteLine("Mang sau khi xoa:");
            for (int i = 0; i < newmang.GetLength(0); i++)
            {
                for (int j = 0; j < newmang.GetLength(1); j++)
                {
                    Console.Write(newmang[i, j] + " ");
                }
            }
            Console.ReadLine();
        }
    }
}
