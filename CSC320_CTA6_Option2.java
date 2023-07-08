import java.util.Arrays;
import java.util.Scanner;

public class CSC320_CTA6_Option2 {
     public static boolean isLetters(String name) {
        return name.matches("[a-zA-Z]+");
        }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[3];
        String val = null;
        int n = 1;
       
        for (int i = 0; i <= 2; i++) {
            try{
            System.out.println("please input three words: word #" + n);
            val = sc.next();
            n++;
            if (isLetters(val) == true) {
            arr[i] = val;
            }else {
                System.out.println("Sorry use letters only please");
                i--;
                n--;
            }
            }catch(ArrayIndexOutOfBoundsException e) {
                System.out.println(("something went wrong"));
                n--; 
                i--;
                System.out.println("");
            }
        }
            System.out.println("Success");
            System.out.println();
            System.out.println(Arrays.toString(arr));
            sc.close();
    }
}


