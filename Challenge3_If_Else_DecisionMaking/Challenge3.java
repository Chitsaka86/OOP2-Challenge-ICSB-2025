// using if else statement to make a decision of if you are an adult or minor and your level of education according to your age
package Pkg.OOP_Challenge.Challenge3_If_Else_DecisionMaking;
public class Challenge3 {
    void status(){
     int age =23;
     System.out.println("Your age is: "+age);

     if(age >= 0 && age <=13){
         System.out.println("You are a minor in primary level of Education");
     }
     else if(age >= 14 && age<= 17){
        System.out.println("You are a minor in secondary level of Education");
     }
     else if (age >= 18 && age <= 24){
         System.out.println("You are an adult in University level of education");
     }
     else if (age >= 25 && age <= 60) {
         System.out.println("You are an adult who is working");
     }
     else if (age >= 61){
         System.out.println("You are an adult at retirement");
     }
     else {
         System.out.println("Enter a correct age");
     }
    }
    public static void main(String[] args){
        (new Challenge3()).status();
    }

}
