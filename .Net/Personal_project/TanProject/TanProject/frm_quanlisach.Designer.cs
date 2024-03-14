namespace TanProject
{
    partial class frm_quanlisach
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
            this.label6 = new System.Windows.Forms.Label();
            this.dt_Sach = new System.Windows.Forms.DataGridView();
            this.btn_Dem = new System.Windows.Forms.Button();
            this.btn_Sua = new System.Windows.Forms.Button();
            this.btn_Xoa = new System.Windows.Forms.Button();
            this.btn_Them = new System.Windows.Forms.Button();
            this.txt_SoSach = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.txb_TacGia = new System.Windows.Forms.TextBox();
            this.Txb_TenSach = new System.Windows.Forms.TextBox();
            this.Txb_MaSach = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.txb_NoiDung = new System.Windows.Forms.TextBox();
            this.cb_LoaiSach = new System.Windows.Forms.ComboBox();
            this.label5 = new System.Windows.Forms.Label();
            this.label7 = new System.Windows.Forms.Label();
            ((System.ComponentModel.ISupportInitialize)(this.dt_Sach)).BeginInit();
            this.SuspendLayout();
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Font = new System.Drawing.Font("Times New Roman", 19.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label6.Location = new System.Drawing.Point(45, 254);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(152, 37);
            this.label6.TabIndex = 49;
            this.label6.Text = "Noi Dung";
            // 
            // dt_Sach
            // 
            this.dt_Sach.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dt_Sach.Location = new System.Drawing.Point(59, 517);
            this.dt_Sach.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.dt_Sach.Name = "dt_Sach";
            this.dt_Sach.RowTemplate.Height = 28;
            this.dt_Sach.Size = new System.Drawing.Size(950, 188);
            this.dt_Sach.TabIndex = 46;
            this.dt_Sach.CellClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dt_Sach_CellContentClick);
            this.dt_Sach.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dt_Sach_CellContentClick);
            // 
            // btn_Dem
            // 
            this.btn_Dem.Font = new System.Drawing.Font("Times New Roman", 22F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_Dem.Location = new System.Drawing.Point(742, 157);
            this.btn_Dem.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.btn_Dem.Name = "btn_Dem";
            this.btn_Dem.Size = new System.Drawing.Size(194, 57);
            this.btn_Dem.TabIndex = 45;
            this.btn_Dem.Text = "Dem";
            this.btn_Dem.UseVisualStyleBackColor = true;
            this.btn_Dem.Click += new System.EventHandler(this.btn_Dem_Click);
            // 
            // btn_Sua
            // 
            this.btn_Sua.Font = new System.Drawing.Font("Times New Roman", 22F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_Sua.Location = new System.Drawing.Point(616, 450);
            this.btn_Sua.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.btn_Sua.Name = "btn_Sua";
            this.btn_Sua.Size = new System.Drawing.Size(117, 47);
            this.btn_Sua.TabIndex = 44;
            this.btn_Sua.Text = "Sua";
            this.btn_Sua.UseVisualStyleBackColor = true;
            this.btn_Sua.Click += new System.EventHandler(this.btn_Sua_Click);
            // 
            // btn_Xoa
            // 
            this.btn_Xoa.Font = new System.Drawing.Font("Times New Roman", 22F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_Xoa.Location = new System.Drawing.Point(408, 450);
            this.btn_Xoa.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.btn_Xoa.Name = "btn_Xoa";
            this.btn_Xoa.Size = new System.Drawing.Size(137, 47);
            this.btn_Xoa.TabIndex = 43;
            this.btn_Xoa.Text = "Xoa";
            this.btn_Xoa.UseVisualStyleBackColor = true;
            this.btn_Xoa.Click += new System.EventHandler(this.btn_Xoa_Click);
            // 
            // btn_Them
            // 
            this.btn_Them.Font = new System.Drawing.Font("Times New Roman", 22F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_Them.Location = new System.Drawing.Point(178, 450);
            this.btn_Them.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.btn_Them.Name = "btn_Them";
            this.btn_Them.Size = new System.Drawing.Size(138, 47);
            this.btn_Them.TabIndex = 42;
            this.btn_Them.Text = "Them";
            this.btn_Them.UseVisualStyleBackColor = true;
            this.btn_Them.Click += new System.EventHandler(this.btn_Them_Click);
            // 
            // txt_SoSach
            // 
            this.txt_SoSach.Font = new System.Drawing.Font("Times New Roman", 22F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_SoSach.Location = new System.Drawing.Point(919, 74);
            this.txt_SoSach.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.txt_SoSach.Name = "txt_SoSach";
            this.txt_SoSach.Size = new System.Drawing.Size(126, 50);
            this.txt_SoSach.TabIndex = 41;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Times New Roman", 22F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.Location = new System.Drawing.Point(645, 77);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(256, 42);
            this.label4.TabIndex = 40;
            this.label4.Text = "So Luong Sach";
            // 
            // txb_TacGia
            // 
            this.txb_TacGia.Font = new System.Drawing.Font("Times New Roman", 22F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txb_TacGia.Location = new System.Drawing.Point(313, 188);
            this.txb_TacGia.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.txb_TacGia.Name = "txb_TacGia";
            this.txb_TacGia.Size = new System.Drawing.Size(259, 50);
            this.txb_TacGia.TabIndex = 39;
            // 
            // Txb_TenSach
            // 
            this.Txb_TenSach.Font = new System.Drawing.Font("Times New Roman", 22F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Txb_TenSach.Location = new System.Drawing.Point(313, 128);
            this.Txb_TenSach.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Txb_TenSach.Name = "Txb_TenSach";
            this.Txb_TenSach.Size = new System.Drawing.Size(259, 50);
            this.Txb_TenSach.TabIndex = 38;
            // 
            // Txb_MaSach
            // 
            this.Txb_MaSach.Font = new System.Drawing.Font("Times New Roman", 22F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Txb_MaSach.Location = new System.Drawing.Point(313, 66);
            this.Txb_MaSach.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Txb_MaSach.Name = "Txb_MaSach";
            this.Txb_MaSach.Size = new System.Drawing.Size(259, 50);
            this.Txb_MaSach.TabIndex = 37;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Times New Roman", 19.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(45, 188);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(125, 37);
            this.label3.TabIndex = 36;
            this.label3.Text = "Tac Gia";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Times New Roman", 19.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(45, 128);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(144, 37);
            this.label2.TabIndex = 35;
            this.label2.Text = "Ten Sach";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Times New Roman", 19.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(45, 74);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(140, 37);
            this.label1.TabIndex = 34;
            this.label1.Text = "Ma Sach";
            // 
            // txb_NoiDung
            // 
            this.txb_NoiDung.Font = new System.Drawing.Font("Times New Roman", 22F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txb_NoiDung.Location = new System.Drawing.Point(313, 267);
            this.txb_NoiDung.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.txb_NoiDung.Name = "txb_NoiDung";
            this.txb_NoiDung.Size = new System.Drawing.Size(259, 50);
            this.txb_NoiDung.TabIndex = 51;
            // 
            // cb_LoaiSach
            // 
            this.cb_LoaiSach.FormattingEnabled = true;
            this.cb_LoaiSach.Location = new System.Drawing.Point(313, 352);
            this.cb_LoaiSach.Name = "cb_LoaiSach";
            this.cb_LoaiSach.Size = new System.Drawing.Size(259, 24);
            this.cb_LoaiSach.TabIndex = 52;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Font = new System.Drawing.Font("Times New Roman", 19.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label5.Location = new System.Drawing.Point(45, 334);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(156, 37);
            this.label5.TabIndex = 53;
            this.label5.Text = "Loai Sach";
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Font = new System.Drawing.Font("Times New Roman", 22.2F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label7.Location = new System.Drawing.Point(413, 0);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(249, 43);
            this.label7.TabIndex = 54;
            this.label7.Text = "Quan Ly Sach";
            // 
            // frm_quanlisach
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1135, 703);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.cb_LoaiSach);
            this.Controls.Add(this.txb_NoiDung);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.dt_Sach);
            this.Controls.Add(this.btn_Dem);
            this.Controls.Add(this.btn_Sua);
            this.Controls.Add(this.btn_Xoa);
            this.Controls.Add(this.btn_Them);
            this.Controls.Add(this.txt_SoSach);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.txb_TacGia);
            this.Controls.Add(this.Txb_TenSach);
            this.Controls.Add(this.Txb_MaSach);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Name = "frm_quanlisach";
            this.Text = "Sach ";
            this.Load += new System.EventHandler(this.frm_quanlisach_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dt_Sach)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.DataGridView dt_Sach;
        private System.Windows.Forms.Button btn_Dem;
        private System.Windows.Forms.Button btn_Sua;
        private System.Windows.Forms.Button btn_Xoa;
        private System.Windows.Forms.Button btn_Them;
        private System.Windows.Forms.TextBox txt_SoSach;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox txb_TacGia;
        private System.Windows.Forms.TextBox Txb_TenSach;
        private System.Windows.Forms.TextBox Txb_MaSach;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox txb_NoiDung;
        private System.Windows.Forms.ComboBox cb_LoaiSach;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label7;
    }
}