namespace FormTN
{
    partial class frm_ptb2
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
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.txt_HeSoA = new System.Windows.Forms.TextBox();
            this.txt_HeSoB = new System.Windows.Forms.TextBox();
            this.Txt_HeSoC = new System.Windows.Forms.TextBox();
            this.txt_KetQua = new System.Windows.Forms.TextBox();
            this.btn_giai = new System.Windows.Forms.Button();
            this.btn_thoat = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(180, 63);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(57, 17);
            this.label1.TabIndex = 0;
            this.label1.Text = "He so a";
            this.label1.Click += new System.EventHandler(this.label1_Click);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(180, 127);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(57, 17);
            this.label2.TabIndex = 1;
            this.label2.Text = "He so b";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(180, 200);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(56, 17);
            this.label3.TabIndex = 2;
            this.label3.Text = "He so c";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(180, 263);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(57, 17);
            this.label4.TabIndex = 3;
            this.label4.Text = "Ket qua";
            // 
            // txt_HeSoA
            // 
            this.txt_HeSoA.Location = new System.Drawing.Point(292, 63);
            this.txt_HeSoA.Name = "txt_HeSoA";
            this.txt_HeSoA.Size = new System.Drawing.Size(143, 22);
            this.txt_HeSoA.TabIndex = 4;
            // 
            // txt_HeSoB
            // 
            this.txt_HeSoB.Location = new System.Drawing.Point(292, 122);
            this.txt_HeSoB.Name = "txt_HeSoB";
            this.txt_HeSoB.Size = new System.Drawing.Size(143, 22);
            this.txt_HeSoB.TabIndex = 5;
            // 
            // Txt_HeSoC
            // 
            this.Txt_HeSoC.Location = new System.Drawing.Point(292, 195);
            this.Txt_HeSoC.Name = "Txt_HeSoC";
            this.Txt_HeSoC.Size = new System.Drawing.Size(143, 22);
            this.Txt_HeSoC.TabIndex = 6;
            // 
            // txt_KetQua
            // 
            this.txt_KetQua.BackColor = System.Drawing.Color.WhiteSmoke;
            this.txt_KetQua.Enabled = false;
            this.txt_KetQua.Location = new System.Drawing.Point(292, 263);
            this.txt_KetQua.Name = "txt_KetQua";
            this.txt_KetQua.Size = new System.Drawing.Size(143, 22);
            this.txt_KetQua.TabIndex = 7;
            // 
            // btn_giai
            // 
            this.btn_giai.Location = new System.Drawing.Point(205, 332);
            this.btn_giai.Name = "btn_giai";
            this.btn_giai.Size = new System.Drawing.Size(101, 39);
            this.btn_giai.TabIndex = 8;
            this.btn_giai.Text = "Giai";
            this.btn_giai.UseVisualStyleBackColor = true;
            this.btn_giai.Click += new System.EventHandler(this.btn_giai_Click);
            // 
            // btn_thoat
            // 
            this.btn_thoat.Location = new System.Drawing.Point(384, 332);
            this.btn_thoat.Name = "btn_thoat";
            this.btn_thoat.Size = new System.Drawing.Size(85, 39);
            this.btn_thoat.TabIndex = 9;
            this.btn_thoat.Text = "Thoat";
            this.btn_thoat.UseVisualStyleBackColor = true;
            this.btn_thoat.Click += new System.EventHandler(this.btn_thoat_Click);
            // 
            // frm_ptb2
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.btn_thoat);
            this.Controls.Add(this.btn_giai);
            this.Controls.Add(this.txt_KetQua);
            this.Controls.Add(this.Txt_HeSoC);
            this.Controls.Add(this.txt_HeSoB);
            this.Controls.Add(this.txt_HeSoA);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Name = "frm_ptb2";
            this.Text = "frm_ptb2";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox txt_HeSoA;
        private System.Windows.Forms.TextBox txt_HeSoB;
        private System.Windows.Forms.TextBox Txt_HeSoC;
        private System.Windows.Forms.TextBox txt_KetQua;
        private System.Windows.Forms.Button btn_giai;
        private System.Windows.Forms.Button btn_thoat;
    }
}