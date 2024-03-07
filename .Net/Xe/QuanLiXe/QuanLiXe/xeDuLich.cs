using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLiXe
{
   public class xeDuLich : Xe
    {
        public int SoChoNgoi { get => soChoNgoi; set => soChoNgoi = value; }
        int soChoNgoi;

        public xeDuLich()
            :base()
        {
        }
        public xeDuLich(string BienSo, string TenXe, int TrongTai, DateTime NgayDangKiem, int TieuChuanBang, int SoChoNgoi)
             : base(BienSo, TenXe, TrongTai, NgayDangKiem, TieuChuanBang)
        {
            this.soChoNgoi = SoChoNgoi;
        }



        public override void nhap()
        {
            base.nhap();
            Console.WriteLine("Nhap vao so cho ngoi: ");
            this.SoChoNgoi = int.Parse(Console.ReadLine());
        }
        public override void xuat()
        {
            base.xuat();
            Console.WriteLine("So cho ngoi la: ", this.SoChoNgoi);
        }
    }
}
