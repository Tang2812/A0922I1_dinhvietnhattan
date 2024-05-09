namespace BlazorApp1.Models
{
    public class ModelCT
    {
        string id;
        string firstName;
        string lastName;
        string midName;
        int idPayrate;

        public string Id { get => id; set => id = value; }
        public string FirstName { get => firstName; set => firstName = value; }
        public string LastName { get => lastName; set => lastName = value; }
        public string MidName { get => midName; set => midName = value; }
        public int IdPayrate { get => idPayrate; set => idPayrate = value; }
    }
}
