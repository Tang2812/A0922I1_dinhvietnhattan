namespace TanProject
{
    partial class frm_nguoiDoc
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
            this.label7 = new System.Windows.Forms.Label();
            this.dt_NguoiDoc = new System.Windows.Forms.DataGridView();
            this.btn_Dem = new System.Windows.Forms.Button();
            this.btn_Sua = new System.Windows.Forms.Button();
            this.btn_Xoa = new System.Windows.Forms.Button();
            this.btn_Them = new System.Windows.Forms.Button();
            this.txt_SoNguoiDoc = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.txb_SODIENTHOAI = new System.Windows.Forms.TextBox();
            this.Txb_TENNGUOIDOC = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.txb_manguoidoc = new System.Windows.Forms.TextBox();
            this.label6 = new System.Windows.Forms.Label();
            ((System.ComponentModel.ISupportInitialize)(this.dt_NguoiDoc)).BeginInit();
            this.SuspendLayout();
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Font = new System.Drawing.Font("Times New Roman", 22.2F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label7.Location = new System.Drawing.Point(268, -127);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(249, 43);
            this.label7.TabIndex = 72;
            this.label7.Text = "Quan Ly Sach";
            // 
            // dt_NguoiDoc
            // 
            this.dt_NguoiDoc.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dt_NguoiDoc.Location = new System.Drawing.Point(200, 499);
            this.dt_NguoiDoc.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.dt_NguoiDoc.Name = "dt_NguoiDoc";
            this.dt_NguoiDoc.RowTemplate.Height = 28;
            this.dt_NguoiDoc.Size = new System.Drawing.Size(769, 165);
            this.dt_NguoiDoc.TabIndex = 67;
            this.dt_NguoiDoc.CellClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dt_NguoiDoc_CellClick);
            // 
            // btn_Dem
            // 
            this.btn_Dem.Font = new System.Drawing.Font("Times New Roman", 13.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_Dem.Location = new System.Drawing.Point(843, 193);
            this.btn_Dem.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.btn_Dem.Name = "btn_Dem";
            this.btn_Dem.Size = new System.Drawing.Size(114, 46);
            this.btn_Dem.TabIndex = 66;
            this.btn_Dem.Text = "Dem";
            this.btn_Dem.UseVisualStyleBackColor = true;
            this.btn_Dem.Click += new System.EventHandler(this.btn_Dem_Click);
            // 
            // btn_Sua
            // 
            this.btn_Sua.Font = new System.Drawing.Font("Times New Roman", 13.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_Sua.Location = new System.Drawing.Point(667, 361);
            this.btn_Sua.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.btn_Sua.Name = "btn_Sua";
            this.btn_Sua.Size = new System.Drawing.Size(114, 46);
            this.btn_Sua.TabIndex = 65;
            this.btn_Sua.Text = "Sua";
            this.btn_Sua.UseVisualStyleBackColor = true;
            this.btn_Sua.Click += new System.EventHandler(this.btn_Sua_Click);
            // 
            // btn_Xoa
            // 
            this.btn_Xoa.Font = new System.Drawing.Font("Times New Roman", 13.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_Xoa.Location = new System.Drawing.Point(509, 361);
            this.btn_Xoa.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.btn_Xoa.Name = "btn_Xoa";
            this.btn_Xoa.Size = new System.Drawing.Size(114, 46);
            this.btn_Xoa.TabIndex = 64;
            this.btn_Xoa.Text = "Xoa";
            this.btn_Xoa.UseVisualStyleBackColor = true;
            this.btn_Xoa.Click += new System.EventHandler(this.btn_Xoa_Click);
            // 
            // btn_Them
            // 
            this.btn_Them.Font = new System.Drawing.Font("Times New Roman", 13.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_Them.Location = new System.Drawing.Point(349, 361);
            this.btn_Them.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.btn_Them.Name = "btn_Them";
            this.btn_Them.Size = new System.Drawing.Size(114, 46);
            this.btn_Them.TabIndex = 63;
            this.btn_Them.Text = "Them";
            this.btn_Them.UseVisualStyleBackColor = true;
            this.btn_Them.Click += new System.EventHandler(this.btn_Them_Click);
            // 
            // txt_SoNguoiDoc
            // 
            this.txt_SoNguoiDoc.Font = new System.Drawing.Font("Times New Roman", 13.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_SoNguoiDoc.Location = new System.Drawing.Point(818, 130);
            this.txt_SoNguoiDoc.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.txt_SoNguoiDoc.Name = "txt_SoNguoiDoc";
            this.txt_SoNguoiDoc.Size = new System.Drawing.Size(151, 34);
            this.txt_SoNguoiDoc.TabIndex = 62;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Times New Roman", 13.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.Location = new System.Drawing.Point(549, 133);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(222, 26);
            this.label4.TabIndex = 61;
            this.label4.Text = "So Luong Nguoi Doc";
            // 
            // txb_SODIENTHOAI
            // 
            this.txb_SODIENTHOAI.Font = new System.Drawing.Font("Times New Roman", 22F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txb_SODIENTHOAI.Location = new System.Drawing.Point(274, 281);
            this.txb_SODIENTHOAI.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.txb_SODIENTHOAI.Multiline = true;
            this.txb_SODIENTHOAI.Name = "txb_SODIENTHOAI";
            this.txb_SODIENTHOAI.Size = new System.Drawing.Size(274, 37);
            this.txb_SODIENTHOAI.TabIndex = 60;
            // 
            // Txb_TENNGUOIDOC
            // 
            this.Txb_TENNGUOIDOC.Font = new System.Drawing.Font("Times New Roman", 22F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Txb_TENNGUOIDOC.Location = new System.Drawing.Point(274, 192);
            this.Txb_TENNGUOIDOC.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Txb_TENNGUOIDOC.Multiline = true;
            this.Txb_TENNGUOIDOC.Name = "Txb_TENNGUOIDOC";
            this.Txb_TENNGUOIDOC.Size = new System.Drawing.Size(163, 37);
            this.Txb_TENNGUOIDOC.TabIndex = 58;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Times New Roman", 13.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(85, 283);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(156, 26);
            this.label3.TabIndex = 57;
            this.label3.Text = "So Dien Thoai";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Times New Roman", 13.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(79, 203);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(162, 26);
            this.label2.TabIndex = 56;
            this.label2.Text = "Ten Nguoi Doc";
            this.label2.Click += new System.EventHandler(this.label2_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Times New Roman", 19.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(-100, -53);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(140, 37);
            this.label1.TabIndex = 55;
            this.label1.Text = "Ma Sach";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Font = new System.Drawing.Font("Times New Roman", 13.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label5.Location = new System.Drawing.Point(422, 21);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(299, 26);
            this.label5.TabIndex = 73;
            this.label5.Text = "DANH SACH NGUOI DOC";
            // 
            // txb_manguoidoc
            // 
            this.txb_manguoidoc.Font = new System.Drawing.Font("Times New Roman", 22F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txb_manguoidoc.Location = new System.Drawing.Point(274, 122);
            this.txb_manguoidoc.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.txb_manguoidoc.Multiline = true;
            this.txb_manguoidoc.Name = "txb_manguoidoc";
            this.txb_manguoidoc.Size = new System.Drawing.Size(163, 37);
            this.txb_manguoidoc.TabIndex = 75;
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Font = new System.Drawing.Font("Times New Roman", 13.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label6.Location = new System.Drawing.Point(79, 133);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(152, 26);
            this.label6.TabIndex = 74;
            this.label6.Text = "Ma nguoi doc";
            // 
            // frm_nguoiDoc
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1066, 760);
            this.Controls.Add(this.txb_manguoidoc);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.dt_NguoiDoc);
            this.Controls.Add(this.btn_Dem);
            this.Controls.Add(this.btn_Sua);
            this.Controls.Add(this.btn_Xoa);
            this.Controls.Add(this.btn_Them);
            this.Controls.Add(this.txt_SoNguoiDoc);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.txb_SODIENTHOAI);
            this.Controls.Add(this.Txb_TENNGUOIDOC);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Name = "frm_nguoiDoc";
            this.Text = "Nguoi doc";
            this.Load += new System.EventHandler(this.frm_nguoiDoc_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dt_NguoiDoc)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.DataGridView dt_NguoiDoc;
        private System.Windows.Forms.Button btn_Dem;
        private System.Windows.Forms.Button btn_Sua;
        private System.Windows.Forms.Button btn_Xoa;
        private System.Windows.Forms.Button btn_Them;
        private System.Windows.Forms.TextBox txt_SoNguoiDoc;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox txb_SODIENTHOAI;
        private System.Windows.Forms.TextBox Txb_TENNGUOIDOC;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.TextBox txb_manguoidoc;
        private System.Windows.Forms.Label label6;
    }
}