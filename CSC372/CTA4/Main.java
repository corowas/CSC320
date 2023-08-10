package CTA4;

public class Main {
    public static void main(String[] args) {
        Sphere s1 = new Sphere();
        Cone c1 = new Cone();
        Cylinder cy1 = new Cylinder();

        

        s1.surface_Area();
        s1.volume();
        s1.toString();
        c1.surface_Area();
        c1.volume();
        c1.toString();
        cy1.surface_Area();
        cy1.volume();
        cy1.toString();
    }
    
}
