// use of variables.
package Pkg.OOP_Challenge;
public class Challenge2 {
    void Variables(){
        double weight, height, Bmi;
        String health;

        weight = 56;
        System.out.println("Weight in Kg is: " + weight);

        height = 1.6562;
        System.out.println("Height in meters is: " +height);

        Bmi = weight/(height* height);
        System.out.println("Your Bmi is: " +Bmi);

        health = "Perfect";
        System.out.println("Health is: " +health);
    }
   public static void main(String[] args){
       (new Challenge2()).Variables();
   }
}
