package Task2;

import GeterSeter.Main;

public class Circle {
    public double radius;
    public String color;

    public Circle() {
    }
    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Area of circle: "+getArea();
    }
}
