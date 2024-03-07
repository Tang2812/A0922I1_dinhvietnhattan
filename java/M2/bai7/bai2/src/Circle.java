
public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double areaCircle() {
        return this.radius * this.radius * 3.14;
    }

    @Override
    public String toString() {
        return "Circle" +
                "\t|| Radius: " + this.getRadius() + "\t|| Area: " + areaCircle();
    }
}