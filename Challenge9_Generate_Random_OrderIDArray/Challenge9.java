package Pkg.OOP_Challenge.Challenge9_Generate_Random_OrderIDArray;
// Challenge for randomly generating 10 OrderIDs, storing then in an array, then printing the OrderIDs.
// imports the built-in Random class
import java.util.Random;

public class Challenge9 {
    public static void main (String []Args){
        Random random =new Random();
        String []orderIDs=new String[10]; // declares an array that holds ten OrderIDs
        // loop that runs 5 times, once for each index in the array
        for (int i=0; i<orderIDs.length;i++){
            char prefix=(char)(random.nextInt(5)+'A');// generates a prefix for A-E

            int number = random.nextInt(999)+1; // generates numbers between 1-999
            String suffix=String.format("%03d",number); // formats the number generated to a 3-digit number

            orderIDs[i]=prefix+suffix;
        }
        // prints the generated OrderID that the loop has gone through in the array
        for (String orderID : orderIDs){
            System.out.println(orderID);
        }
    }

}
