using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TANDVN30_1_2024
{
    internal class QuanLySV
    {
   
        public void NhapvaXuat()
        {
            string lc;
            
            while (true)
            {
                Console.Write("\nNhap lua chon \r\n1.[Sinh vien dien tu (D)] \r\n2. [Sinh vien cong nghe thong tin[C]  \r\n3. [T] de thoat: ");
                lc = Console.ReadLine();
                lc = lc.ToUpper();
                if (lc == "D")
                {
                    SinhVienDienTu svdt = new SinhVienDienTu();
                    svdt.Nhap();
                    svdt.Xuat();
                }
                if (lc == "C")
                {
                    SinhVienKCNTT svcntt = new SinhVienKCNTT();
                    svcntt.Nhap();
                    svcntt.Xuat();
                }
                if (lc == "T") break;
            }
        }


    }
}
