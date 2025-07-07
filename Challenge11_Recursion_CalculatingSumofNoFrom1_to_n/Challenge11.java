package Pkg.OOP_Challenge.Challenge11_Recursion_CalculatingSumofNoFrom1_to_n;

public class Challenge11 {
    public static int sum(int n){

        if (n==1){
            return 1;
        }

        else {
            return n+sum(n-1);
        }

    }
    public static void main(String[] args){
        int result=sum(10);
        System.out.println("Sum: "+result);
    }

}
