// creating a class, declaring a method then calling the method
package Pkg.OOP_Challenge.Class_CallingMethod;
// creating a class
public class Challenge1{
    // declaring a method
    void saySomething(){
        System.out.println("I am Doing Challenge 1");
    }

    // calling the method
  public static void main(String[] args){
      (new Challenge1()).saySomething();
  }
}