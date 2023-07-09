    //Sam Seifzadeh Project 3: Not Huffman Coding
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class DDS {

        public static void main (String[] args) throws FileNotFoundException{ 
   readFile();
   }  
//**********************************************************************************     
   public static void readFile() throws FileNotFoundException
   {
      File file = new File("/Users/samanseifzadeh/Documents/482/sample.txt");
      Scanner scan = new Scanner(file);
      //readFile(file);
      int arrlength = scan.nextInt();
      //System.out.println(arrlength);
      int i = 0;
      int[] matrix = new int[arrlength*arrlength];
      while(scan.hasNextInt()){
         matrix[i] = scan.nextInt();
         i++;
      }
      System.out.println(matrix[i]);
      scan.close();
      dimensionalArray(arrlength,matrix);
   }
//**********************************************************************************
//**********************************************************************************
   public static void dimensionalArray (int arrlength, int[] matrix){
      int[][] newArray = new int[arrlength][arrlength];
      int k=0;
      for(int i=0;i<arrlength;i++)//i=1
      {
         for(int j=0;j<arrlength;j++)//j=0
         {
            newArray[i][j]=matrix[k++]; //k=4
         }         
      }
      
      for(int i=0;i<arrlength;i++)
      {
         for(int j=0;j<arrlength;j++)
         {
            System.out.print(newArray[i][j]+" ");
         }
         System.out.println();
      }
            }
//****************************
        

//code for last bits in an array and how they can be interpuretted as letters.
//we go back and start over again with a new list.
// this would be the fib fuction, which we make an array for to save the saved outputs.
public static int[] dynamicProgramming(int n){
int [] ans = new int[n+1];
ans[0] = 0;
ans[1] = 1;
   for(int i = 2; i <= n; i++){
      ans[i] = ans[i] + ans[i-1];
} return ans;
}
}