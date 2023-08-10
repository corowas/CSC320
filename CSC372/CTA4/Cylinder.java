package CTA4;
import java.lang.Math;

public class Cylinder extends Shape {
double radius = 3;
double height = 4;
double surfaceArea;
double volumeVal;



@Override
public void surface_Area() {
    surfaceArea = (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
    // throw new UnsupportedOperationException("Unimplemented method 'surfaceArea'");
    
}

@Override
public void volume() {
    volumeVal = (Math.PI * Math.pow(radius,2)) * height;
    // throw new UnsupportedOperationException("Unimplemented method 'volume'");
}
public String toString() {
    System.out.println("With the radius of " + radius + " and a height of " + height);
    System.out.printf("The surface area of the cylinder is %.2f",  surfaceArea);
    System.out.printf(" and the volume is %.2f\n", volumeVal);
    return surfaceArea + " " + volumeVal;
}
   
}