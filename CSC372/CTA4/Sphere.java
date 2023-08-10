package CTA4;
import java.lang.Math;

public class Sphere extends Shape {
double radius = 3;
double surfaceArea;
 double volumeVal;



@Override
public void surface_Area() {
    surfaceArea = (4 * Math.PI) * radius * 2;
    // throw new UnsupportedOperationException("Unimplemented method 'surfaceArea'");
    
}

@Override
public void volume() {
    volumeVal = (4/3) * (Math.PI * Math.pow(radius, 3));
    // throw new UnsupportedOperationException("Unimplemented method 'volume'");
}
public String toString() {
    System.out.println("With the radius of " + radius);
    System.out.printf("The surface area of the sphere is %.2f",  surfaceArea);
    System.out.printf(" and the volume is %.2f\n", volumeVal);
    return surfaceArea + " " + volumeVal;
}
   
}
