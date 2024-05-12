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
        [Required(ErrorMessage ="Please enter empployee code")]
        public string EmloyeeCode { get => emloyeeCode; set => emloyeeCode = value; }
        [Required(ErrorMessage = "Please enter empployee first name")]
        [MaxLength(25,ErrorMessage ="Too long name")]
        public string FirstName { get => firstName; set => firstName = value; }
        [Required(ErrorMessage = "Please enter empployee mid name")]
        [MaxLength(25, ErrorMessage = "Too long name")]
        public string MidName { get => midName; set => midName = value; }
        [Required(ErrorMessage = "Please enter empployee last name")]
        [MaxLength(25, ErrorMessage = "Too long name")]
        public string LastName { get => lastName; set => lastName = value; }
        [Required(ErrorMessage = "Please enter employee social scurity number")]
        public string Ssn { get => ssn; set => ssn = value; }
        public int IdPayrate { get => idPayrate; set => idPayrate = value; }
        [Required(ErrorMessage = "Please enter employee vacation days")]
        public int VacationDays { get => vacationDays; set => vacationDays = value; }
        [Required(ErrorMessage = "Please enter employee Paid to date")]
        public int PaidToDate { get => paidToDate; set => paidToDate = value; }
        [Required(ErrorMessage = "Please enter employee Paid last year")]
        public int PaidLastYear { get => paidLastYear; set => paidLastYear = value; }
        public DateOnly BirthDate1 { get => BirthDate; set => BirthDate = value; }
        [Required(ErrorMessage = "Please enter employee DriverLicense")]
        public string DriverLicense { get => driverLicense; set => driverLicense = value; }
        [Required(ErrorMessage = "Please enter employee curent address 1")]
        public string CurentAddress1 { get => curentAddress1; set => curentAddress1 = value; }
        [Required(ErrorMessage = "Please enter employee curent address 2")]
        public string CurentAddress2 { get => curentAddress2; set => curentAddress2 = value; }
        [Required(ErrorMessage = "Please enter employee curent city ")]
        public string CurentCity { get => curentCity; set => curentCity = value; }
        [Required(ErrorMessage = "Please enter employee curent country")]
        public string CurentCountry { get => curentCountry; set => curentCountry = value; }
        [Required(ErrorMessage = "Please enter employee curent zip")]
        public string CurentZip { get => curentZip; set => curentZip = value; }
        public string CurentGender { get => curentGender; set => curentGender = value; }
        [Required(ErrorMessage = "Please enter employee curent phone")]
        public string CurentPhone { get => curentPhone; set => curentPhone = value; }
        [Required(ErrorMessage = "Please enter employee curent mail")]
        public string CurentEmail { get => curentEmail; set => curentEmail = value; }
        public string CurentMartialStatus { get => curentMartialStatus; set => curentMartialStatus = value; }
        [Required(ErrorMessage = "Please enter employee curent ethicity")]
        public string Ethnicity { get => ethnicity; set => ethnicity = value; }
        [Required(ErrorMessage = "Please enter employee curent share holder status")]
        public int ShareHolderStatus { get => shareHolderStatus; set => shareHolderStatus = value; }
        public int BenefitplanId { get => benefitplanId; set => benefitplanId = value; }
        [Required(ErrorMessage = "Please enter employee status")]
        public string EmploymentStatus { get => employmentStatus; set => employmentStatus = value; }
        public DateOnly HireDateForWorking { get => hireDateForWorking; set => hireDateForWorking = value; }
        [Required(ErrorMessage = "Please enter employee Worker comp code")]
        public string WorkersCompCode { get => workersCompCode; set => workersCompCode = value; }
        public DateOnly TerminationDatel { get => terminationDatel; set => terminationDatel = value; }
        public DateOnly RehireDateForWorking { get => rehireDateForWorking; set => rehireDateForWorking = value; }
        public DateOnly LastReviewDate { get => lastReviewDate; set => lastReviewDate = value; }
        [Required(ErrorMessage = "Please enter number day required for working per month")]
        public int NumberDaysRequierementOfWorkingPerMonth { get => numberDaysRequierementOfWorkingPerMonth; set => numberDaysRequierementOfWorkingPerMonth = value; }
    }
}
