using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLiXe
{
   abstract class  Nguoi
    {
        string scm;
        string hoten;
        string diachi;
        string dienthoai;

        public string Scm { get => scm; set => scm = value; }
        public string Hoten { get => hoten; set => hoten = value; }
        public string Diachi { get => diachi; set => diachi = value; }
        public string Dienthoai { get => dienthoai; set => dienthoai = value; }
        public Nguoi() { }
        public abstract void nhap();
        public abstract void xuat();
    }

}
