package Pkg.OOP_Challenge.Challenge12_Recursion_Factorial;

public class Challenge12 {
    public static int factorial(int n){
        if (n==0||n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args){
        int result=factorial(5);
        System.out.println("Factorial is: "+result);
    }
}
