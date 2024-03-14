namespace TanProject
{
    partial class frm_TrangChu
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.trangChuToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.chucNangToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.quanLiSachToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.quanLyNguoiDocToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.thamKhaoToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.troGiupToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.menuStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // menuStrip1
            // 
            this.menuStrip1.ImageScalingSize = new System.Drawing.Size(20, 20);
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.trangChuToolStripMenuItem,
            this.chucNangToolStripMenuItem,
            this.thamKhaoToolStripMenuItem,
            this.troGiupToolStripMenuItem});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(800, 28);
            this.menuStrip1.TabIndex = 0;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // trangChuToolStripMenuItem
            // 
            this.trangChuToolStripMenuItem.Name = "trangChuToolStripMenuItem";
            this.trangChuToolStripMenuItem.Size = new System.Drawing.Size(85, 24);
            this.trangChuToolStripMenuItem.Text = "Trang chu";
            // 
            // chucNangToolStripMenuItem
            // 
            this.chucNangToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.quanLiSachToolStripMenuItem,
            this.quanLyNguoiDocToolStripMenuItem});
            this.chucNangToolStripMenuItem.Name = "chucNangToolStripMenuItem";
            this.chucNangToolStripMenuItem.Size = new System.Drawing.Size(90, 24);
            this.chucNangToolStripMenuItem.Text = "Chuc nang";
            // 
            // quanLiSachToolStripMenuItem
            // 
            this.quanLiSachToolStripMenuItem.Name = "quanLiSachToolStripMenuItem";
            this.quanLiSachToolStripMenuItem.Size = new System.Drawing.Size(205, 26);
            this.quanLiSachToolStripMenuItem.Text = "Quan ly sach";
            this.quanLiSachToolStripMenuItem.Click += new System.EventHandler(this.quanLiSachToolStripMenuItem_Click);
            // 
            // quanLyNguoiDocToolStripMenuItem
            // 
            this.quanLyNguoiDocToolStripMenuItem.Name = "quanLyNguoiDocToolStripMenuItem";
            this.quanLyNguoiDocToolStripMenuItem.Size = new System.Drawing.Size(205, 26);
            this.quanLyNguoiDocToolStripMenuItem.Text = "Quan ly nguoi doc";
            this.quanLyNguoiDocToolStripMenuItem.Click += new System.EventHandler(this.quanLyNguoiDocToolStripMenuItem_Click);
            // 
            // thamKhaoToolStripMenuItem
            // 
            this.thamKhaoToolStripMenuItem.Name = "thamKhaoToolStripMenuItem";
            this.thamKhaoToolStripMenuItem.Size = new System.Drawing.Size(96, 24);
            this.thamKhaoToolStripMenuItem.Text = "Tham Khao";
            // 
            // troGiupToolStripMenuItem
            // 
            this.troGiupToolStripMenuItem.Name = "troGiupToolStripMenuItem";
            this.troGiupToolStripMenuItem.Size = new System.Drawing.Size(76, 24);
            this.troGiupToolStripMenuItem.Text = "Tro giup";
            // 
            // frm_TrangChu
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.menuStrip1);
            this.IsMdiContainer = true;
            this.MainMenuStrip = this.menuStrip1;
            this.Name = "frm_TrangChu";
            this.Text = "Trang chu";
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem trangChuToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem chucNangToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem quanLiSachToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem thamKhaoToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem troGiupToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem quanLyNguoiDocToolStripMenuItem;
    }
}