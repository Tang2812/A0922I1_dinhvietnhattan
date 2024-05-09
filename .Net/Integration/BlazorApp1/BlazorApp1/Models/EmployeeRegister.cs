using System.ComponentModel.DataAnnotations;
namespace BlazorApp1.Models
{
	public class EmployeeRegister
	{
#pragma warning disable CS8618 // Non-nullable field must contain a non-null value when exiting constructor. Consider declaring as nullable.
		public EmployeeRegister() { }


#pragma warning restore CS8618 // Non-nullable field must contain a non-null value when exiting constructor. Consider declaring as nullable.


        private string emloyeeCode;
        private string firstName;
        private string midName;
        private string lastName;
        private string ssn;
        int idPayrate;
		int vacationDays;
		int paidToDate;
		int paidLastYear;
		DateOnly BirthDate;
        private string driverLicense;
        private string curentAddress1;
        private string curentAddress2;
        private string curentCity;
        private string curentCountry;
        private string curentZip;
        private string curentGender;
        private string curentPhone;
        private string curentEmail;
        private string curentMartialStatus;
        private string ethnicity;
        int shareHolderStatus;		
		int benefitplanId;
        private string employmentStatus;
        DateOnly hireDateForWorking;
        private string workersCompCode;
        private DateOnly terminationDatel;
        DateOnly rehireDateForWorking;
		DateOnly lastReviewDate;
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
        public DateOnly BirthDate1 { get => BirthDate; set => BirthDate = value; }
        public string DriverLicense { get => driverLicense; set => driverLicense = value; }
        public string CurentAddress1 { get => curentAddress1; set => curentAddress1 = value; }
        public string CurentAddress2 { get => curentAddress2; set => curentAddress2 = value; }
        public string CurentCity { get => curentCity; set => curentCity = value; }
        public string CurentCountry { get => curentCountry; set => curentCountry = value; }
        public string CurentZip { get => curentZip; set => curentZip = value; }
        public string CurentGender { get => curentGender; set => curentGender = value; }
        public string CurentPhone { get => curentPhone; set => curentPhone = value; }
        public string CurentEmail { get => curentEmail; set => curentEmail = value; }
        public string CurentMartialStatus { get => curentMartialStatus; set => curentMartialStatus = value; }
        public string Ethnicity { get => ethnicity; set => ethnicity = value; }
        public int ShareHolderStatus { get => shareHolderStatus; set => shareHolderStatus = value; }
        public int BenefitplanId { get => benefitplanId; set => benefitplanId = value; }
        public string EmploymentStatus { get => employmentStatus; set => employmentStatus = value; }
        public DateOnly HireDateForWorking { get => hireDateForWorking; set => hireDateForWorking = value; }
        public string WorkersCompCode { get => workersCompCode; set => workersCompCode = value; }
        public DateOnly TerminationDatel { get => terminationDatel; set => terminationDatel = value; }
        public DateOnly RehireDateForWorking { get => rehireDateForWorking; set => rehireDateForWorking = value; }
        public DateOnly LastReviewDate { get => lastReviewDate; set => lastReviewDate = value; }
        public int NumberDaysRequierementOfWorkingPerMonth { get => numberDaysRequierementOfWorkingPerMonth; set => numberDaysRequierementOfWorkingPerMonth = value; }
    }
}
