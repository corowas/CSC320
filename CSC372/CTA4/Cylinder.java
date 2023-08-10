package CTA4;
import java.lang.Math;

public class Cylinder extends Shape {
double radius;
double height;
double surfaceArea;
double volumeVal;

Cylinder(double x, double y) { //parameterized constructor
    radius = x;
    height = y;
}



@Override       // calls abstract method surface_Area
public void surface_Area() {
    surfaceArea = (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
    
}

@Override       // calls abstract method volume
public void volume() {
    volumeVal = (Math.PI * Math.pow(radius,2)) * height;
}
public String toString() {
    System.out.println("With the radius of " + radius + " and a height of " + height);
    System.out.printf("The surface area of the cylinder is %.2f",  surfaceArea);
    System.out.printf(" and the volume is %.2f\n", volumeVal);
    return surfaceArea + " " + volumeVal;
}
   
}