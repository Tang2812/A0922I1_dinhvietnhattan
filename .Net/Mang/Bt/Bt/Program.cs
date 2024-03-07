using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Bt
{
    class Program
    {
        static void Main(string[] args)
        {
           
            Console.WriteLine("Nhap so luong cua mang:");
            int n = int.Parse(Console.ReadLine());
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
            {
                Console.WriteLine("Phan tu tai arr[" + i + "]:");
                arr[i] = int.Parse(Console.ReadLine());
            }

            for (int i = 0; i < n; i++)
            {
                Console.Write("{0} ", arr[i]);
            }

            int sum = 0;
            for (int i = 0; i < n; i++)
            {
                sum += arr[i];
            }
            Console.WriteLine("\nTong mang la {0}", sum);

            int max = arr[0];
            for (int i = 0; i < n; i++)
            {
                if (max < arr[i])
                {
                    max = arr[i];
                }
            }
            Console.WriteLine("So lon nhat trong mang {0}", max);

            int dem = 0, sum1 = 0;
            for (int i = 0; i < n; i++)
            {
                if (arr[i] % 2 == 0)
                {
                    sum1 += arr[i];
                    dem++;
                }
            }

            Console.WriteLine("Tong so nguyen duong và so luong la {0},{1}", sum1, dem);

            Console.ReadLine();
        }
    }
}
