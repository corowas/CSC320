package CTA4;
import java.lang.Math;

public class Cone extends Shape {
double radius = 3;
double height = 4;
double surfaceArea;
 double volumeVal;



@Override
public void surface_Area() {
    double l = Math.sqrt(Math.pow(radius,2) + Math.pow(height, 2));
    surfaceArea = (Math.PI * radius * 2) + (Math.PI * radius * l);
    // throw new UnsupportedOperationException("Unimplemented method 'surfaceArea'");
    
}

@Override
public void volume() {
    volumeVal = (Math.PI * Math.pow(radius,2) * height) / 3;
    // throw new UnsupportedOperationException("Unimplemented method 'volume'");
}
public String toString() {
    System.out.println("With the radius of " + radius + " and a height of " + height);
    System.out.printf("The surface area of the cone is %.2f",  surfaceArea);
    System.out.printf(" and the volume is %.2f\n", volumeVal);
    return surfaceArea + " " + volumeVal;
}
   
}