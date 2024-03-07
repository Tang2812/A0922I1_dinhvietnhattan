class Circle{
    float radius;
    String colour;

    public Circle(float radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public Circle() {
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", colour='" + colour + '\'' +
                '}';
    }
    public void area(){
        double s;
        s=this.radius*this.radius*3.14;
        System.out.println("Area= "+s);
    }
}
class Cylinder extends Circle{
    float height;

    public Cylinder(float radius, String colour, float height) {
        super(radius, colour);
        this.height = height;
    }
    public Cylinder(){

    };

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                ", colour='" + colour + '\'' +
                '}';
    }
    void volume(){
        double v;
        v=super.getRadius()*super.getRadius()*3.14*this.height;
        System.out.println("Volume= "+v);
    }
}
public class Bai1 {
    public static void main(String[] args) {
        Cylinder a=new Cylinder(3,"Red",6);
        System.out.println(a);
        a.area();
        a.volume();
    }
}
