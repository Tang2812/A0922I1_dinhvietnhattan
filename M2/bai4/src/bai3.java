class Fan_X{
    private final int Slow = 1;
    private final int Medium = 2;
    private final int Fast = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public Fan_X(){
        this.speed = Slow;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }
    public Fan_X(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    public int getSLOW() {
        return Slow;
    }
    public int getMEDIUM() {
        return Medium;
    }
    public int getFAST() {
        return Fast;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean isOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        if (on == true) {
            return "Speed: " + this.getSpeed() + ", Radius: " + this.getRadius() + ", Color: " + this.getColor() + ", Fan is on";
        } else {
            return "Radius: " + this.getRadius() + ", Color: " + this.getColor() + ", Fan is off";
        }
    }
}

public class bai3 {
    public static void main(String[] args) {
        Fan_X fan1 = new Fan_X(3, true, 10, "Yellow");
        Fan_X fan2 = new Fan_X(2, false, 5, "Blue");
        System.out.println(fan1);
        System.out.println(fan2);
    }
}
