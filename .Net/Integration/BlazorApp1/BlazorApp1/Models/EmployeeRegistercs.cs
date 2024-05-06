using System.ComponentModel.DataAnnotations;
namespace BlazorApp1.Models
{
	public class EmployeeRegistercs
	{
		public EmployeeRegistercs() { }
		public EmployeeRegistercs(string emloyeeCode, string firstName, string midName, string lastName, string ssn, int idPayrate, int vacationDays, int paidToDate, int paidLastYear, DateOnly? birthDate, string driverLicense, string curentAddress1, string curentAddress2, string curentCity, string curentCountry, string curentZip, string curentGender, string curentPhone, string curentEmail, string curentMartialStatus, string ethnicity, int shareHolderStatus, int benefitplanId, string employmentStatus, DateOnly? hireDateForWorking, string workersCompCode, string terminationDatel, DateOnly? rehireDateForWorking, DateOnly? lastReviewDate, int numberDaysRequierementOfWorkingPerMonth)
		{
			this.emloyeeCode = emloyeeCode;
			this.firstName = firstName;
			this.midName = midName;
			this.lastName = lastName;
			this.ssn = ssn;
			this.idPayrate = idPayrate;
			this.vacationDays = vacationDays;
			this.paidToDate = paidToDate;
			this.paidLastYear = paidLastYear;
			BirthDate = birthDate;
			this.driverLicense = driverLicense;
			this.curentAddress1 = curentAddress1;
			this.curentAddress2 = curentAddress2;
			this.curentCity = curentCity;
			this.curentCountry = curentCountry;
			this.curentZip = curentZip;
			this.curentGender = curentGender;
			this.curentPhone = curentPhone;
			this.curentEmail = curentEmail;
			this.curentMartialStatus = curentMartialStatus;
			this.ethnicity = ethnicity;
			this.shareHolderStatus = shareHolderStatus;
			this.benefitplanId = benefitplanId;
			this.employmentStatus = employmentStatus;
			this.hireDateForWorking = hireDateForWorking;
			this.workersCompCode = workersCompCode;
			this.terminationDatel = terminationDatel;
			this.rehireDateForWorking = rehireDateForWorking;
			this.lastReviewDate = lastReviewDate;
			this.numberDaysRequierementOfWorkingPerMonth = numberDaysRequierementOfWorkingPerMonth;
		}

		public string emloyeeCode;
		public string firstName;
		public string midName;
		public string lastName;
		public string ssn;
		int idPayrate;
		int vacationDays;
		int paidToDate;
		int paidLastYear;
		DateOnly? BirthDate;
		public string driverLicense;
				public string curentAddress1;
		public string curentAddress2;
		public string curentCity;
		public string curentCountry;
		public string curentZip;
		public string curentGender;
		public string curentPhone;
		[Required]
		public string curentEmail;
		public string curentMartialStatus;
		public string ethnicity;
		int shareHolderStatus;		
		int benefitplanId;
		public string employmentStatus;
		DateOnly? hireDateForWorking;
						public string workersCompCode;
		public	string terminationDatel;
		DateOnly? rehireDateForWorking;
		DateOnly? lastReviewDate;
		int numberDaysRequierementOfWorkingPerMonth;

		public string EmloyeeCode { get => emloyeeCode; set => emloyeeCode = value; }
		public string FirstName { get => firstName; set => firstName = value; }
		public string MidName { get => midName; set => midName = value; }
		public string LastName { get => lastName; set => lastName = value; }
		public string Ssn { get => ssn; set => ssn = value; }
		public int IdPayrate { get => idPayrate; set => idPayrate = value; }
		public int VacationDays { get => vacationDays; set => vacationDays = value; }
		public int PaidToDate { get => paidToDate; set => paidToDate = value; }
		public int PaidLastYear { get => paidLastYear; set => paidLastYear = value; }
		public DateOnly? BirthDate1 { get => BirthDate; set => BirthDate = value; }
		public string DriverLicense { get => driverLicense; set => driverLicense = value; }
		public string CurentAddress1 { get => curentAddress1; set => curentAddress1 = value; }
		public string CurentAddress2 { get => curentAddress2; set => curentAddress2 = value; }
		public string CurentCity { get => curentCity; set => curentCity = value; }
		public string CurentCountry { get => curentCountry; set => curentCountry = value; }
		public string CurentZip { get => curentZip; set => curentZip = value; }
		public string CurentGender { get => curentGender; set => curentGender = value; }
		public string CurentPhone { get => curentPhone; set => curentPhone = value; }
		[Required]
		public string CurentEmail { get => curentEmail; set => curentEmail = value; }
		public string CurentMartialStatus { get => curentMartialStatus; set => curentMartialStatus = value; }
		public string Ethnicity { get => ethnicity; set => ethnicity = value; }
		public int ShareHolderStatus { get => shareHolderStatus; set => shareHolderStatus = value; }
		public int BenefitplanId { get => benefitplanId; set => benefitplanId = value; }
		public string EmploymentStatus { get => employmentStatus; set => employmentStatus = value; }
		public DateOnly? HireDateForWorking { get => hireDateForWorking; set => hireDateForWorking = value; }
		public string WorkersCompCode { get => workersCompCode; set => workersCompCode = value; }
		public string TerminationDatel { get => terminationDatel; set => terminationDatel = value; }
		public DateOnly? RehireDateForWorking { get => rehireDateForWorking; set => rehireDateForWorking = value; }
		public DateOnly? LastReviewDate { get => lastReviewDate; set => lastReviewDate = value; }
		public int NumberDaysRequierementOfWorkingPerMonth { get => numberDaysRequierementOfWorkingPerMonth; set => numberDaysRequierementOfWorkingPerMonth = value; }
	}
}
