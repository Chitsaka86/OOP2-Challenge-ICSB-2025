package Pkg.OOP_Challenge.Challenge8_Filter_Array_By_Prefix;

public class Challenge8 {
    public static void main(String[] args){
        String[] OrderIds= {"B123","C234","A345","C15","B117","G3003","C235","B179"};
        for (String item:OrderIds){
            if (item.startsWith("B")){
                System.out.println(item);
            }
        }

    }
}
