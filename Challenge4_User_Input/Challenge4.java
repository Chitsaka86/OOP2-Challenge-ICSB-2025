// asking for user input
package Pkg.OOP_Challenge.Challenge4_User_Input;

import java.util.Scanner;

public class Challenge4 {
    Scanner scanner= new Scanner(System.in);
    public void BMi() {
        double weight, height, BMi;

        System.out.println("Enter your weight: ");
        weight = scanner.nextDouble();

        System.out.println("Enter your height: ");
        height = scanner.nextDouble();

        BMi= weight/(height*height);
        System.out.println("You are "+weight+" kg "+height+" meters and you BMI is "+BMi);
    }
    public static void main(String[] args){
        (new Challenge4()).BMi();
    }
}
