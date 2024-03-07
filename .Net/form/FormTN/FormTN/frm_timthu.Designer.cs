namespace FormTN
{
    partial class frm_timthu
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
            this.txt_thu = new System.Windows.Forms.TextBox();
            this.btn_tim = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(301, 124);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(33, 17);
            this.label1.TabIndex = 0;
            this.label1.Text = "Thu";
            // 
            // txt_thu
            // 
            this.txt_thu.Location = new System.Drawing.Point(369, 124);
            this.txt_thu.Multiline = true;
            this.txt_thu.Name = "txt_thu";
            this.txt_thu.Size = new System.Drawing.Size(100, 22);
            this.txt_thu.TabIndex = 1;
            // 
            // btn_tim
            // 
            this.btn_tim.Location = new System.Drawing.Point(369, 185);
            this.btn_tim.Name = "btn_tim";
            this.btn_tim.Size = new System.Drawing.Size(100, 23);
            this.btn_tim.TabIndex = 2;
            this.btn_tim.Text = "Tim";
            this.btn_tim.UseVisualStyleBackColor = true;
            this.btn_tim.Click += new System.EventHandler(this.btn_tim_Click);
            // 
            // frm_timthu
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.btn_tim);
            this.Controls.Add(this.txt_thu);
            this.Controls.Add(this.label1);
            this.Name = "frm_timthu";
            this.Text = "frm_timthu";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox txt_thu;
        private System.Windows.Forms.Button btn_tim;
    }
}