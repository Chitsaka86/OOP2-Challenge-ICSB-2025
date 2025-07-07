package Pkg.OOP_Challenge.Challenge10_Sort_ReverseArray;
// Challenge for sorting an array in an alphabetical-order then reversing the order

// imported classes
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Challenge10 {
    public static void main(String[]args){
        String []pallets={"B14","A11","B12","A13"}; // declaration of a list of arrays

        System.out.println("Sorted..."); // prints out the sorted arrays
        Arrays.sort(pallets); //sorts the arrays alphabetically
        for (String pallet: pallets){
            System.out.println("--"+pallet);
        }

        System.out.println("\n Reversed ...."); //prints the reversed arrays
        List<String> palletList=Arrays.asList(pallets); // converts the array into a list so that it can be reversed
        Collections.reverse(palletList); // reverses the sorted list
        for (String pallet: palletList){
            System.out.println("--"+pallet);
        }

    }
}
