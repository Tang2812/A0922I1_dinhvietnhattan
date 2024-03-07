using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace bai3
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("nhap vao so nguyen n: ");
            int n = int.Parse(Console.ReadLine());
            int s = 0;
            for (int i = 1; i <= n; i++)
            {
                s = s * i;
            }
            Console.WriteLine("giai thua la: {0}", s);
            Console.ReadLine();
        }
    }
}
