using System;
using System.Collections.Generic;
using BlazorApp1.Models;
using Microsoft.EntityFrameworkCore;
using Pomelo.EntityFrameworkCore.MySql.Scaffolding.Internal;

namespace BlazorApp1.Data;

public partial class MydbContext : DbContext
{
    public MydbContext()
    {
    }

    public MydbContext(DbContextOptions<MydbContext> options)
        : base(options)
    {
    }

    public virtual DbSet<Employee> Employees { get; set; }

    public virtual DbSet<PayRate> PayRates { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
#warning To protect potentially sensitive information in your connection string, you should move it out of source code. You can avoid scaffolding the connection string by using the Name= syntax to read it from configuration - see https://go.microsoft.com/fwlink/?linkid=2131148. For more guidance on storing connection strings, see https://go.microsoft.com/fwlink/?LinkId=723263.
        => optionsBuilder.UseMySql("server=localhost;database=mydb;uid=root;pwd=123456", Microsoft.EntityFrameworkCore.ServerVersion.Parse("8.0.32-mysql"));

    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
        modelBuilder
            .UseCollation("latin1_swedish_ci")
            .HasCharSet("latin1");

        modelBuilder.Entity<Employee>(entity =>
        {
            entity.HasKey(e => new { e.EmployeeNumber, e.PayRatesIdPayRates })
                .HasName("PRIMARY")
                .HasAnnotation("MySql:IndexPrefixLength", new[] { 0, 0 });

            entity.ToTable("employee");

            entity.HasIndex(e => e.EmployeeNumber, "Employee Number_UNIQUE").IsUnique();

            entity.HasIndex(e => e.PayRatesIdPayRates, "fk_Employee_Pay Rates_idx");

            entity.Property(e => e.EmployeeNumber).HasColumnName("Employee Number");
            entity.Property(e => e.PayRatesIdPayRates).HasColumnName("Pay Rates_idPay Rates");
            entity.Property(e => e.FirstName)
                .HasMaxLength(45)
                .HasColumnName("First Name");
            entity.Property(e => e.IdEmployee).HasColumnName("idEmployee");
            entity.Property(e => e.LastName)
                .HasMaxLength(45)
                .HasColumnName("Last Name");
            entity.Property(e => e.PaidLastYear)
                .HasPrecision(2)
                .HasColumnName("Paid Last Year");
            entity.Property(e => e.PaidToDate)
                .HasPrecision(2)
                .HasColumnName("Paid To Date");
            entity.Property(e => e.PayRate)
                .HasMaxLength(40)
                .HasColumnName("Pay Rate");
            entity.Property(e => e.Ssn)
                .HasPrecision(10)
                .HasColumnName("SSN");
            entity.Property(e => e.VacationDays).HasColumnName("Vacation Days");

            entity.HasOne(d => d.PayRatesIdPayRatesNavigation).WithMany(p => p.Employees)
                .HasForeignKey(d => d.PayRatesIdPayRates)
                .OnDelete(DeleteBehavior.ClientSetNull)
                .HasConstraintName("fk_Employee_Pay Rates");
        });

        modelBuilder.Entity<PayRate>(entity =>
        {
            entity.HasKey(e => e.IdPayRates).HasName("PRIMARY");

            entity.ToTable("pay rates");

            entity.Property(e => e.IdPayRates)
                .ValueGeneratedNever()
                .HasColumnName("idPayRates");
            entity.Property(e => e.PayAmount).HasPrecision(10);
            entity.Property(e => e.PayRateName).HasMaxLength(40);
            entity.Property(e => e.PtlevelC)
                .HasPrecision(10)
                .HasColumnName("PTLevel C");
            entity.Property(e => e.TaxPercentage).HasPrecision(10);
            entity.Property(e => e.Value).HasPrecision(10);
        });

        OnModelCreatingPartial(modelBuilder);
    }

    partial void OnModelCreatingPartial(ModelBuilder modelBuilder);
}
