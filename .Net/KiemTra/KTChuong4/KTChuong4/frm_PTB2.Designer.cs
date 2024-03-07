namespace KTChuong4
{
    partial class frm_PTB2
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
            this.TXB_HSA = new System.Windows.Forms.TextBox();
            this.TXB_HSB = new System.Windows.Forms.TextBox();
            this.TXB_HSC = new System.Windows.Forms.TextBox();
            this.label5 = new System.Windows.Forms.Label();
            this.TXB_KQ = new System.Windows.Forms.TextBox();
            this.BTN_GIAI = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Times New Roman", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.ForeColor = System.Drawing.Color.Red;
            this.label1.Location = new System.Drawing.Point(250, 32);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(252, 23);
            this.label1.TabIndex = 0;
            this.label1.Text = "PHUONG TRINH BAC HAI";
            this.label1.Click += new System.EventHandler(this.label1_Click);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(149, 88);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(59, 17);
            this.label2.TabIndex = 1;
            this.label2.Text = "He So a";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(149, 136);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(59, 17);
            this.label3.TabIndex = 2;
            this.label3.Text = "He So b";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(149, 183);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(58, 17);
            this.label4.TabIndex = 3;
            this.label4.Text = "He So c";
            // 
            // TXB_HSA
            // 
            this.TXB_HSA.Location = new System.Drawing.Point(294, 83);
            this.TXB_HSA.Name = "TXB_HSA";
            this.TXB_HSA.Size = new System.Drawing.Size(114, 22);
            this.TXB_HSA.TabIndex = 4;
            // 
            // TXB_HSB
            // 
            this.TXB_HSB.Location = new System.Drawing.Point(294, 131);
            this.TXB_HSB.Name = "TXB_HSB";
            this.TXB_HSB.Size = new System.Drawing.Size(114, 22);
            this.TXB_HSB.TabIndex = 5;
            // 
            // TXB_HSC
            // 
            this.TXB_HSC.Location = new System.Drawing.Point(294, 178);
            this.TXB_HSC.Name = "TXB_HSC";
            this.TXB_HSC.Size = new System.Drawing.Size(114, 22);
            this.TXB_HSC.TabIndex = 6;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(149, 233);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(60, 17);
            this.label5.TabIndex = 7;
            this.label5.Text = "Ket Qua";
            // 
            // TXB_KQ
            // 
            this.TXB_KQ.Location = new System.Drawing.Point(267, 233);
            this.TXB_KQ.Name = "TXB_KQ";
            this.TXB_KQ.Size = new System.Drawing.Size(199, 22);
            this.TXB_KQ.TabIndex = 8;
            // 
            // BTN_GIAI
            // 
            this.BTN_GIAI.Location = new System.Drawing.Point(181, 288);
            this.BTN_GIAI.Name = "BTN_GIAI";
            this.BTN_GIAI.Size = new System.Drawing.Size(101, 52);
            this.BTN_GIAI.TabIndex = 9;
            this.BTN_GIAI.Text = "Giai";
            this.BTN_GIAI.UseVisualStyleBackColor = true;
            this.BTN_GIAI.Click += new System.EventHandler(this.BTN_GIAI_Click);
            // 
            // button2
            // 
            this.button2.Location = new System.Drawing.Point(390, 288);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(101, 52);
            this.button2.TabIndex = 10;
            this.button2.Text = "Thoat";
            this.button2.UseVisualStyleBackColor = true;
            // 
            // frm_PTB2
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.BTN_GIAI);
            this.Controls.Add(this.TXB_KQ);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.TXB_HSC);
            this.Controls.Add(this.TXB_HSB);
            this.Controls.Add(this.TXB_HSA);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Name = "frm_PTB2";
            this.Text = "frm_PTB2";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox TXB_HSA;
        private System.Windows.Forms.TextBox TXB_HSB;
        private System.Windows.Forms.TextBox TXB_HSC;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.TextBox TXB_KQ;
        private System.Windows.Forms.Button BTN_GIAI;
        private System.Windows.Forms.Button button2;
    }
}