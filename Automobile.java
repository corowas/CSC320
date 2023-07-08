import java.util.Scanner;
public class Automobile {  
   Scanner sc = new Scanner(System.in);
   private String make;
   private String model;
   private String color;
   private int year;
   private int miles;
   private double price;
   private String car;
   private String[] carInv = new String[1];   

      public String setCarInfo() {  // Mutator
         System.out.println("input car year");
         year = sc.nextInt();   
         System.out.println("input car make");
         make = sc.next();
         System.out.println("input car model");
         model = sc.next();
         System.out.println("input car color");
         color = sc.next();
         System.out.println("input car miles");
         miles = sc.nextInt();
         System.out.println("input car price");
         price = sc.nextInt();
         return concat();
      }
      public void removeCar(int index) {
         String[] arr = new String[carInv.length - 1];
         for (int i = 0, k = 0; i < carInv.length; i++) {
              if (i == index) {
                continue;
            }
             arr[k++] = carInv[i];
        }
         carInv = arr;
         System.out.println("\n ***Successfully Deleted***\n");
      }
      public void addCar(String car) {  // Mutator
         String[] arr = new String[carInv.length + 1];
         int x = arr.length -1;
         for (int i = 0, k = 0; i < carInv.length; i++) {
               arr[k++] = carInv[i];
         }
         arr[x] = car;
         carInv = arr;
         carInv[0] = "Year---Make----Model---Color---Miles---Price";
         System.out.println();
      }
      public void viewInv() { // Accessor
         for(int i = 0; i <= carInv.length -1; i++) {
            System.out.println("\n" + i + ")" + carInv[i] + "\n");
         }
      }
      public String concat() { // Mutator
         car = year + " - " +  make + " - " + model + " - " + color + " - "
         + miles + " miles - $" + price;
         return car;
      }
      public void setCar(int i) {
           car = setCarInfo();
           carInv[i] = car;

      }
      
   }

      
   
