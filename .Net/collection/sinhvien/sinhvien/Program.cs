using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace sinhvien
{
    class Program
    {
        static void Main(string[] args)
        {
            Dictionary<string, string[]> dsSV = new Dictionary<string, string[]>();
            Console.WriteLine("Nhap vao so luong sinh vien: ");
            int sl = int.Parse(Console.ReadLine());
            for (int i = 0; i < sl; i++)
            {
                Console.WriteLine("nhap ma sinh vien:");
                string msv = Console.ReadLine();
                Console.WriteLine("Nhap thong tin ho ten, dia chi, ngay sinh cua sinh vien thu: " + i + 1);
                string[] s=new string[3];
                for (int j = 0; j < 3; j++)
                {
                    s[i] = Console.ReadLine();
                }
                dsSV.Add(msv, s);
            }
            Console.WriteLine("Nha vao ma sinh vien check: ");
            string check= Console.ReadLine();
            if (dsSV.ContainsKey(check))
            {
                Console.WriteLine("MSV: "+check);
                Console.WriteLine("HVT: "+dsSV[check][0]);
                Console.WriteLine("DC: "+ dsSV[check][1]);
                Console.WriteLine("NS: "+ dsSV[check][2]);

            }

            Console.ReadLine();
        }
    }
}
