import javax.rmi.CORBA.Stub;

class Student{
    private String name="John";
    private String classes="C02";

    public Student() {
    }

      public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

}
public class bai2 {
    public static void main(String[] args) {
        Student a= new Student();
        a.setClasses("A09");
        a.setName("Tan");
    }
}
