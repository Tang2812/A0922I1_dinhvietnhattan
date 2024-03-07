using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QLXE
{
   abstract class Nguoi
    {
        long socm;
        string hoten, diachi, dienthoai;
        public long Socm
        {
            get
            {
                return socm;
            }

            set
            {
                socm = value;
            }
        }
        public string Hoten
        {
            get
            {
                return hoten;
            }

            set
            {
                hoten = value;
            }
        }
        public string Diachi
        {
            get
            {
                return diachi;
            }

            set
            {
                diachi = value;
            }
        }
        public string Dienthoai
        {
            get
            {
                return dienthoai;
            }

            set
            {
                dienthoai = value;
            }
        }
        public abstract void Nhap();
        public abstract void Xuat();
    }
}
