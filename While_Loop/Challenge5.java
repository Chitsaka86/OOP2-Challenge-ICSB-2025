// using while loop to test for odd and even numbers
package Pkg.OOP_Challenge.While_Loop;
import java.util.Scanner;
public class Challenge5 {
  Scanner scanner= new Scanner(System.in);
   void OddEvenChecker(){
       int num;

       while (true){
           System.out.println("Enter a number or 'end' to stop: ");
           if (scanner.hasNextInt()){
               num = scanner.nextInt();
               if (num % 2 ==0){
                   System.out.println("You entered an even number");
               }
               else{
                   System.out.println("You entered an odd number");
               }
           } else{
               String l = scanner.next();
               if (l.equalsIgnoreCase("End")){
                   break;
               }else {
                   System.out.println("you did not enter an integer");
               }
           }
       }
   }
  public static void main(String[] args){
      (new Challenge5()).OddEvenChecker();
  }
}
