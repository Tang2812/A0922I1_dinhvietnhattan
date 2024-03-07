using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Collection
{
    class Program
    {
        static void Main(string[] args)
        {
            Dictionary<string, string> dsMonHoc = new Dictionary<string, string>();
            Console.WriteLine("Nhap vao so luong mon hoc trong danh sach: ");
            int soMon = int.Parse(Console.ReadLine());
            for (int i = 0; i < soMon; i++)
            {
                Console.WriteLine("Nhap vao ma mon: ");
                string maMon = Console.ReadLine();
                Console.WriteLine("Nhap vao ten mon: ");
                string tenMon = Console.ReadLine();
                dsMonHoc.Add(maMon, tenMon);
            }
            if (dsMonHoc.ContainsValue("kttmdt"))
            {
                Console.WriteLine("Da co mon nay roi");
            }
            else
            {
                dsMonHoc.Add("IS383", "tmdt");
            }
            Console.WriteLine("So luong mon hoc: " + dsMonHoc.Count);
            if (dsMonHoc.ContainsKey("CS364"))
            {
                Console.WriteLine("Da co mon nay roi");
                dsMonHoc.Remove("CS364");
            }
            else
            {
                Console.WriteLine("Khong co mon nay");
            }
            //for (int i = 0; i < soMon; i++)
            //{
            //    Console.WriteLine(dsMonHoc.ElementAt(i).Key);
            //    Console.WriteLine(dsMonHoc.ElementAt(i).Value);
            //}
            Console.ReadLine();
        }
    }
}
