package Task2;

public class Cylinder extends Circle{
    public double height;

    public Cylinder() {
    }

    public Cylinder(double radius) {
        this.radius = radius;
    }

    public Cylinder(double radius, double height) {
        this.radius=radius;
        this.height = height;
    }

    @Override
    public double getArea() {
        return super.getArea();
    }
    public double getVolume(){
        return getArea()*height;
    }
}
