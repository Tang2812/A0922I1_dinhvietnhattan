namespace BlazorApp1.Models
{
	public class ModelTest
	{
		decimal id;
		string firstName;
		string midName;
		string lastName;
		string payRate;
		public ModelTest(decimal id, string firstName, string midName, string lastName, string payRate)
		{
			this.id = id;
			this.firstName = firstName;
			this.midName = midName;
			this.lastName = lastName;
			this.payRate = payRate;

		}

		public decimal Id { get => id; set => id = value; }
		public string FirstName { get => firstName; set => firstName = value; }
		public string MidName { get => midName; set => midName = value; }
		public string LastName { get => lastName; set => lastName = value; }
		public string PayRate { get => payRate; set => payRate = value; }
	}
}
