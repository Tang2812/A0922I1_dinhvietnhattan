class Point2D{
    float x;
    float y;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    public void setXY(float[] a)
    {
        this.x=a[0];
        this.y=a[1];
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
class Point3D extends Point2D{
    float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public Point3D(){

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    void setXYZ(float x,float y,float z){
        super.setXY(x,y);
        this.z=z;
    }
    void setXYZ(float[] a){
        super.setXY(a);
        this.z=a[2];
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
public class bai2 {
    public static void main(String[] args) {
        Point3D a=new Point3D(1,2,3);
        float[] arr= {7,8,9} ;
        a.setXYZ(arr);
        System.out.println(a);
    }
}
