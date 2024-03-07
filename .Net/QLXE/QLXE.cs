using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QLXE
{
    class QLXE
    {
        Dictionary<string, Xe> list;
        internal Dictionary<string, Xe> List
        {
            get
            {
                return list;
            }

            set
            {
                list = value;
            }
        }
        public QLXE()
        {
            List = new Dictionary<string, Xe>();
        }
        public void Nhap()
        {
            Console.WriteLine("Nhap vao so luong xe");
            int soluong = int.Parse(Console.ReadLine());
            for (int i = 0; i < soluong; i++)
            {
                Console.WriteLine("Bam phim (H) de nhap xe cho hang, (D) de nhap xe du lich");
                char kytu = char.Parse(Console.ReadLine().ToUpper());
                if (kytu=='D')
                {
                    XeDuLich xedl = new XeDuLich();
                    xedl.Nhap();
                    List.Add(xedl.Bienso, xedl);
                }
                if (kytu == 'H')
                {
                    XeChoHang xech = new XeChoHang();
                    xech.Nhap();
                    List.Add(xech.Bienso, xech);
                }

            }
        }
        public void Tim()
        {
            Console.WriteLine("Nhap vao bien so can tim");
            string bs = Console.ReadLine();
            if (List.ContainsKey(bs))
            {
                Console.WriteLine("Co xe can tim");
                List[bs].Xuat();
            }
            else Console.WriteLine("Khong co xe can tim");
        }
        public void XoaXe()
        {
            Console.WriteLine("Nhap vao bien so can xoa");
            string bs = Console.ReadLine();
            if (List.ContainsKey(bs))
            {
                Console.WriteLine("Co xe can xoa - da xoa");
                List.Remove(bs);
            }
            else Console.WriteLine("Khong co xe can xoa");
        }
        public void XuatXe()
        {
            foreach (var xe in List.Values)
            {
                xe.Xuat();
            }
        }
    }
}
