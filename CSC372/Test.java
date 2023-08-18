

public class Test {
    
    public static int getFruit(int amountWanted, int value, int numFruit) {
        int newValue;

        newValue = value;

        if (newValue == amountWanted) {   //base method sees if the amount had is equal to the amount wanted if it is, then ends the method
            System.out.println("you wanted " + amountWanted + " apples. ");
            System.out.print("and you now have " + value + " in your cart\n");
            return newValue;
        } else if (newValue < amountWanted) {       //recursive method will add 1 to value then call getFruit() again
            value++;
            numFruit = 10 - value;
            System.out.println("Grabbing apple... We have " + value + " apples in the cart. There are " + numFruit + " left in the store");
            getFruit(amountWanted, value, numFruit);
            return newValue;

        }
        return newValue;
    }
    
public static void main(String[]args)
{
    int value = 0;
    int amountWanted = 5;
    int numFruit = 10;
  getFruit(amountWanted,value,numFruit);
}
}

