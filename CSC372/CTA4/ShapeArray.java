package CTA4;

public class ShapeArray {
    public static void main(String[] args) {
        Sphere s1 = new Sphere(3);
        Cone c1 = new Cone(4.5,12);
        Cylinder cy1 = new Cylinder(2,3.5);
        Shape shapeArray[] = new Shape[3]; 

        shapeArray[0] = s1;
        shapeArray[1] = c1;
        shapeArray[2] = cy1;


        for (int i = 0; i <= shapeArray.length - 1; i++) { //loops through the array and gets Surface Area and Volume then prints
            
            System.out.println("\n");

            shapeArray[i].surface_Area();
            shapeArray[i].volume();
            shapeArray[i].toString();
        }  
    }
}
