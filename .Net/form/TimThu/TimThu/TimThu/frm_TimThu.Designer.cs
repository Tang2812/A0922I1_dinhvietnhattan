namespace TimThu
{
    partial class frm_TimThu
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
            this.txt_thu = new System.Windows.Forms.TextBox();
            this.lb_thu = new System.Windows.Forms.Label();
            this.btn_tim = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // txt_thu
            // 
            this.txt_thu.Location = new System.Drawing.Point(316, 124);
            this.txt_thu.Multiline = true;
            this.txt_thu.Name = "txt_thu";
            this.txt_thu.Size = new System.Drawing.Size(100, 22);
            this.txt_thu.TabIndex = 0;
            this.txt_thu.TextChanged += new System.EventHandler(this.textBox1_TextChanged);
            // 
            // lb_thu
            // 
            this.lb_thu.AutoSize = true;
            this.lb_thu.Location = new System.Drawing.Point(226, 124);
            this.lb_thu.Name = "lb_thu";
            this.lb_thu.Size = new System.Drawing.Size(33, 17);
            this.lb_thu.TabIndex = 1;
            this.lb_thu.Text = "Thu";
            // 
            // btn_tim
            // 
            this.btn_tim.Location = new System.Drawing.Point(302, 198);
            this.btn_tim.Name = "btn_tim";
            this.btn_tim.Size = new System.Drawing.Size(125, 26);
            this.btn_tim.TabIndex = 2;
            this.btn_tim.Text = "tim";
            this.btn_tim.UseVisualStyleBackColor = true;
            // 
            // frm_TimThu
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(759, 450);
            this.Controls.Add(this.btn_tim);
            this.Controls.Add(this.lb_thu);
            this.Controls.Add(this.txt_thu);
            this.Name = "frm_TimThu";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox txt_thu;
        private System.Windows.Forms.Label lb_thu;
        private System.Windows.Forms.Button btn_tim;
    }
}

