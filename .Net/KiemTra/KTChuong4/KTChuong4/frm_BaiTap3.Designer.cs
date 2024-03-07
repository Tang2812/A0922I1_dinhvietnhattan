namespace KTChuong4
{
    partial class frm_BaiTap3
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
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.txb_HOTEN = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.DT_GIO = new System.Windows.Forms.DateTimePicker();
            this.DT_NGAY = new System.Windows.Forms.DateTimePicker();
            this.btn_4 = new System.Windows.Forms.Button();
            this.btn_3 = new System.Windows.Forms.Button();
            this.btn_2 = new System.Windows.Forms.Button();
            this.btn_1 = new System.Windows.Forms.Button();
            this.lib_MONHOC = new System.Windows.Forms.ListBox();
            this.Lib_A = new System.Windows.Forms.ListBox();
            this.label5 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.label7 = new System.Windows.Forms.Label();
            this.TXB_THONGTIN = new System.Windows.Forms.TextBox();
            this.btn_Nhap = new System.Windows.Forms.Button();
            this.Btn_LamTrong = new System.Windows.Forms.Button();
            this.Btn_Thoat = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(445, 9);
            this.label1.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(172, 23);
            this.label1.TabIndex = 0;
            this.label1.Text = "CHON MON HOC";
            this.label1.Click += new System.EventHandler(this.label1_Click);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.ForeColor = System.Drawing.Color.Black;
            this.label2.Location = new System.Drawing.Point(136, 75);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(71, 23);
            this.label2.TabIndex = 1;
            this.label2.Text = "Ho Ten";
            this.label2.Click += new System.EventHandler(this.label2_Click);
            // 
            // txb_HOTEN
            // 
            this.txb_HOTEN.Location = new System.Drawing.Point(260, 75);
            this.txb_HOTEN.Name = "txb_HOTEN";
            this.txb_HOTEN.Size = new System.Drawing.Size(398, 30);
            this.txb_HOTEN.TabIndex = 2;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.ForeColor = System.Drawing.Color.Black;
            this.label3.Location = new System.Drawing.Point(136, 150);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(54, 23);
            this.label3.TabIndex = 3;
            this.label3.Text = "Ngay";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.ForeColor = System.Drawing.Color.Black;
            this.label4.Location = new System.Drawing.Point(608, 150);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(41, 23);
            this.label4.TabIndex = 4;
            this.label4.Text = "Gio";
            // 
            // DT_GIO
            // 
            this.DT_GIO.Format = System.Windows.Forms.DateTimePickerFormat.Time;
            this.DT_GIO.Location = new System.Drawing.Point(679, 150);
            this.DT_GIO.Name = "DT_GIO";
            this.DT_GIO.Size = new System.Drawing.Size(200, 30);
            this.DT_GIO.TabIndex = 6;
            // 
            // DT_NGAY
            // 
            this.DT_NGAY.Format = System.Windows.Forms.DateTimePickerFormat.Short;
            this.DT_NGAY.Location = new System.Drawing.Point(229, 150);
            this.DT_NGAY.Name = "DT_NGAY";
            this.DT_NGAY.Size = new System.Drawing.Size(200, 30);
            this.DT_NGAY.TabIndex = 5;
            this.DT_NGAY.ValueChanged += new System.EventHandler(this.dateTimePicker1_ValueChanged);
            // 
            // btn_4
            // 
            this.btn_4.Location = new System.Drawing.Point(482, 446);
            this.btn_4.Name = "btn_4";
            this.btn_4.Size = new System.Drawing.Size(75, 23);
            this.btn_4.TabIndex = 12;
            this.btn_4.Text = "<<";
            this.btn_4.UseVisualStyleBackColor = true;
            this.btn_4.Click += new System.EventHandler(this.btn_4_Click);
            // 
            // btn_3
            // 
            this.btn_3.Location = new System.Drawing.Point(482, 397);
            this.btn_3.Name = "btn_3";
            this.btn_3.Size = new System.Drawing.Size(75, 23);
            this.btn_3.TabIndex = 11;
            this.btn_3.Text = "<";
            this.btn_3.UseVisualStyleBackColor = true;
            this.btn_3.Click += new System.EventHandler(this.btn_3_Click);
            // 
            // btn_2
            // 
            this.btn_2.Location = new System.Drawing.Point(482, 345);
            this.btn_2.Name = "btn_2";
            this.btn_2.Size = new System.Drawing.Size(75, 23);
            this.btn_2.TabIndex = 10;
            this.btn_2.Text = ">>";
            this.btn_2.UseVisualStyleBackColor = true;
            this.btn_2.Click += new System.EventHandler(this.btn_2_Click);
            // 
            // btn_1
            // 
            this.btn_1.Location = new System.Drawing.Point(482, 294);
            this.btn_1.Name = "btn_1";
            this.btn_1.Size = new System.Drawing.Size(75, 23);
            this.btn_1.TabIndex = 9;
            this.btn_1.Text = ">";
            this.btn_1.UseVisualStyleBackColor = true;
            this.btn_1.Click += new System.EventHandler(this.btn_1_Click);
            // 
            // lib_MONHOC
            // 
            this.lib_MONHOC.FormattingEnabled = true;
            this.lib_MONHOC.ItemHeight = 23;
            this.lib_MONHOC.Location = new System.Drawing.Point(699, 275);
            this.lib_MONHOC.Name = "lib_MONHOC";
            this.lib_MONHOC.Size = new System.Drawing.Size(149, 211);
            this.lib_MONHOC.TabIndex = 8;
            // 
            // Lib_A
            // 
            this.Lib_A.FormattingEnabled = true;
            this.Lib_A.ItemHeight = 23;
            this.Lib_A.Items.AddRange(new object[] {
            "Tieng Anh",
            "Lap Trinh .Net",
            "Huong Doi Tuong",
            "Java",
            "Web"});
            this.Lib_A.Location = new System.Drawing.Point(204, 275);
            this.Lib_A.Name = "Lib_A";
            this.Lib_A.SelectionMode = System.Windows.Forms.SelectionMode.MultiExtended;
            this.Lib_A.Size = new System.Drawing.Size(149, 211);
            this.Lib_A.TabIndex = 7;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.ForeColor = System.Drawing.Color.Black;
            this.label5.Location = new System.Drawing.Point(200, 229);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(181, 23);
            this.label5.TabIndex = 13;
            this.label5.Text = "Danh Sach Mon Hoc";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.ForeColor = System.Drawing.Color.Black;
            this.label6.Location = new System.Drawing.Point(695, 229);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(177, 23);
            this.label6.TabIndex = 14;
            this.label6.Text = "Danh Sach Da Chon";
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.ForeColor = System.Drawing.Color.Black;
            this.label7.Location = new System.Drawing.Point(136, 531);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(96, 23);
            this.label7.TabIndex = 15;
            this.label7.Text = "Thong Tin";
            // 
            // TXB_THONGTIN
            // 
            this.TXB_THONGTIN.Location = new System.Drawing.Point(140, 567);
            this.TXB_THONGTIN.Multiline = true;
            this.TXB_THONGTIN.Name = "TXB_THONGTIN";
            this.TXB_THONGTIN.Size = new System.Drawing.Size(317, 158);
            this.TXB_THONGTIN.TabIndex = 16;
            // 
            // btn_Nhap
            // 
            this.btn_Nhap.Location = new System.Drawing.Point(612, 559);
            this.btn_Nhap.Name = "btn_Nhap";
            this.btn_Nhap.Size = new System.Drawing.Size(122, 44);
            this.btn_Nhap.TabIndex = 17;
            this.btn_Nhap.Text = "Nhap";
            this.btn_Nhap.UseVisualStyleBackColor = true;
            this.btn_Nhap.Click += new System.EventHandler(this.btn_Nhap_Click);
            // 
            // Btn_LamTrong
            // 
            this.Btn_LamTrong.Location = new System.Drawing.Point(612, 620);
            this.Btn_LamTrong.Name = "Btn_LamTrong";
            this.Btn_LamTrong.Size = new System.Drawing.Size(122, 44);
            this.Btn_LamTrong.TabIndex = 18;
            this.Btn_LamTrong.Text = "Lam Trong";
            this.Btn_LamTrong.UseVisualStyleBackColor = true;
            this.Btn_LamTrong.Click += new System.EventHandler(this.Btn_LamTrong_Click);
            // 
            // Btn_Thoat
            // 
            this.Btn_Thoat.Location = new System.Drawing.Point(612, 688);
            this.Btn_Thoat.Name = "Btn_Thoat";
            this.Btn_Thoat.Size = new System.Drawing.Size(122, 44);
            this.Btn_Thoat.TabIndex = 19;
            this.Btn_Thoat.Text = "Thoat";
            this.Btn_Thoat.UseVisualStyleBackColor = true;
            // 
            // frm_BaiTap3
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(12F, 23F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1200, 744);
            this.Controls.Add(this.Btn_Thoat);
            this.Controls.Add(this.Btn_LamTrong);
            this.Controls.Add(this.btn_Nhap);
            this.Controls.Add(this.TXB_THONGTIN);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.btn_4);
            this.Controls.Add(this.btn_3);
            this.Controls.Add(this.btn_2);
            this.Controls.Add(this.btn_1);
            this.Controls.Add(this.lib_MONHOC);
            this.Controls.Add(this.Lib_A);
            this.Controls.Add(this.DT_GIO);
            this.Controls.Add(this.DT_NGAY);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.txb_HOTEN);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Font = new System.Drawing.Font("Times New Roman", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.ForeColor = System.Drawing.Color.Red;
            this.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.Name = "frm_BaiTap3";
            this.Text = "frm_BaiTap3";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox txb_HOTEN;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.DateTimePicker DT_GIO;
        private System.Windows.Forms.DateTimePicker DT_NGAY;
        private System.Windows.Forms.Button btn_4;
        private System.Windows.Forms.Button btn_3;
        private System.Windows.Forms.Button btn_2;
        private System.Windows.Forms.Button btn_1;
        private System.Windows.Forms.ListBox lib_MONHOC;
        private System.Windows.Forms.ListBox Lib_A;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.TextBox TXB_THONGTIN;
        private System.Windows.Forms.Button btn_Nhap;
        private System.Windows.Forms.Button Btn_LamTrong;
        private System.Windows.Forms.Button Btn_Thoat;
    }
}