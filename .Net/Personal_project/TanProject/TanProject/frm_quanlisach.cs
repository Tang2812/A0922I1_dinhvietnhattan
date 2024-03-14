using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace TanProject
{
    public partial class frm_quanlisach : Form
    {
        LOPDUNGCHUNG lopchung = new LOPDUNGCHUNG();
        public frm_quanlisach()
        {
            InitializeComponent();
        }
        public void LoadSach()
        {

            string sql = "Select * from Sach";
            //DataTable dt = lopchung.LoadDL(sql);
            dt_Sach.DataSource = lopchung.LoadDL(sql);
        }
        private void frm_quanlisach_Load(object sender, EventArgs e)
        {
            LoadSach();
            string sql = "Select * from TheLoai";
            cb_LoaiSach.DataSource = lopchung.LoadDL(sql);
            cb_LoaiSach.DisplayMember = "TENTHELOAI";
            cb_LoaiSach.ValueMember = "MATHELOAI";
        }

        private void btn_Them_Click(object sender, EventArgs e)
        {
            string sql = "insert into Sach values ('" + Txb_MaSach.Text + "',N'" + Txb_TenSach.Text + "',N'" + txb_TacGia.Text + "',N'" + txb_NoiDung.Text + "','" + cb_LoaiSach.SelectedValue + "')";
            int kq = lopchung.ThemXoaSua(sql);
            if (kq >= 1) MessageBox.Show("Them sach thanh cong");
            else MessageBox.Show("Them sach that bai");
            LoadSach();
        }

        private void dt_Sach_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            Txb_MaSach.Text = dt_Sach.CurrentRow.Cells["MASACH"].Value.ToString();
            Txb_TenSach.Text = dt_Sach.CurrentRow.Cells["TENSACH"].Value.ToString();
            txb_TacGia.Text = dt_Sach.CurrentRow.Cells["TACGIA"].Value.ToString();
            txb_NoiDung.Text = dt_Sach.CurrentRow.Cells["NOIDUNG"].Value.ToString();
            cb_LoaiSach.SelectedValue = dt_Sach.CurrentRow.Cells["THELOAI"].Value.ToString();
        }

        private void btn_Xoa_Click(object sender, EventArgs e)
        {
            string sql = "Delete Sach where MASACH = '" + Txb_MaSach.Text + "'";
            int kq = lopchung.ThemXoaSua(sql);
            if (kq >= 1) MessageBox.Show("Xoa sach thanh cong");
            else MessageBox.Show("Xoa sach that bai ");
            LoadSach();
        }

        private void btn_Sua_Click(object sender, EventArgs e)
        {
            string sql = "update Sach set TENSACH= N'" + Txb_TenSach.Text + "',TACGIA= N'" + txb_TacGia.Text + "',NOIDUNG= N'" + txb_NoiDung.Text + "',THELOAI ='" + cb_LoaiSach.SelectedValue + "' where MASACH='"+Txb_MaSach.Text+"'";
            int kq = lopchung.ThemXoaSua(sql);
            if (kq >= 1) MessageBox.Show("Sua sach thanh cong");
            else MessageBox.Show("Sua sach that bai");
            LoadSach();
        }

        private void btn_Dem_Click(object sender, EventArgs e)
        {
            string sql = "Select COUNT (*) from Sach";
            int sosach = (int)lopchung.LayGT(sql);
            txt_SoSach.Text = sosach.ToString();
        }
    }
}
