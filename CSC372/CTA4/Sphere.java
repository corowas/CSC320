package CTA4;
import java.lang.Math;

public class Sphere extends Shape {
double radius;
double surfaceArea;
double volumeVal;

Sphere(double x) {  //parameterized constructor
    radius = x;
}

@Override       // calls abstract method surface_Area
public void surface_Area() {
    surfaceArea = (4 * Math.PI) * radius * 2;
    
}

@Override       // calls abstract method volume
public void volume() {
    volumeVal = (4/3) * (Math.PI * Math.pow(radius, 3));
}

public String toString() {
    System.out.println("With the radius of " + radius);
    System.out.printf("The surface area of the sphere is %.2f",  surfaceArea);
    System.out.printf(" and the volume is %.2f\n", volumeVal);
    return surfaceArea + " " + volumeVal;
}
   
}
