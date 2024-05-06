using System;
using System.Collections.Generic;

namespace BlazorApp1.Models;

public partial class Employee
 {
	public Employee(int idEmployee, uint employeeNumber, string lastName, string firstName, decimal ssn, string? payRate, int payRatesIdPayRates, int? vacationDays, decimal? paidToDate, decimal? paidLastYear)
	{
		IdEmployee = idEmployee;
		EmployeeNumber = employeeNumber;
		LastName = lastName;
		FirstName = firstName;
		Ssn = ssn;
		PayRate = payRate;
		PayRatesIdPayRates = payRatesIdPayRates;
		VacationDays = vacationDays;
		PaidToDate = paidToDate;
		PaidLastYear = paidLastYear;
	}

	public int IdEmployee { get; set; }

    public uint EmployeeNumber { get; set; }

    public string LastName { get; set; } = null!;

    public string FirstName { get; set; } = null!;

    public decimal Ssn { get; set; }

    public string? PayRate { get; set; }

    public int PayRatesIdPayRates { get; set; }

    public int? VacationDays { get; set; }

    public decimal? PaidToDate { get; set; }

    public decimal? PaidLastYear { get; set; }

    public virtual PayRate PayRatesIdPayRatesNavigation { get; set; } = null!;
}
