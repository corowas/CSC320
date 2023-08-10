package CTA4;
import java.lang.Math;

public class Cone extends Shape {
double radius;
double height;
double surfaceArea;
double volumeVal;

 Cone(double x, double y) { //parameterized constructor
    radius = x;
    height = y;
}

@Override       // calls abstract method surface_Area
public void surface_Area() {
    double l = Math.sqrt(Math.pow(radius,2) + Math.pow(height, 2)); //needed to get the curved height in order to get the surface area
    surfaceArea = (Math.PI * radius * 2) + (Math.PI * radius * l);
    
}

@Override       // calls abstract method volume
public void volume() {
    volumeVal = (Math.PI * Math.pow(radius,2) * height) / 3;
}
public String toString() {
    System.out.println("With the radius of " + radius + " and a height of " + height);
    System.out.printf("The surface area of the cone is %.2f",  surfaceArea);
    System.out.printf(" and the volume is %.2f\n", volumeVal);
    return surfaceArea + " " + volumeVal;
}
   
}