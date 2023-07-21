package CSC320;
import java.util.Scanner;

public class CSC320_CTA2_Option1{
    public static void main(String args[]){
        String carImage = """
             ______
            /|_||_\\`.__
           (   _    _ _\\
           =`-(_)--(_)-'
                """;

        Scanner sc = new Scanner(System.in);
        //brand
        System.out.println("What make is your car: ");
        String carMake = sc.next();
        //Model
        System.out.println("What model is your car: ");
        String carModel = sc.next();
        //Year
        System.out.println("What year is your car: ");
        int carYear = sc.nextInt();
        //1st ODO reading
        System.out.println("Before you start your trip, what does your odometer say: ");
        int odoReading1 = sc.nextInt();
        //Going on trip
        System.out.println("\nYou are embarking on your trip! Safe travels.\n");
        System.out.println(carImage);
        //2nd odo reading
        System.out.println("What does your Odometer say now: ");
        int odoReading2 = sc.nextInt();
        //gas used
        System.out.println("How many gallons of gas did you use: ");
        double gasUsed = sc.nextDouble();

        double mpg = (odoReading2 - odoReading1) / gasUsed;

        System.out.println("Car year: " + carYear + "\nCar brand: " + carMake + "\nCar model: " + carModel + 
        "\nOdometer reading 1:  " + odoReading1 + "\nOdometer reading 2: " + odoReading2 + "\nGallons of fuel used: "
        + gasUsed + "\n MPG: " + mpg);

        sc.close();

    }

}