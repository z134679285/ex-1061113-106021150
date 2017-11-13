import java.util.Scanner;

public class ex_4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
         String str =scn.nextLine();
         int o =0 ;
         for (int i=0;i<str.length();i++){
             char a=str.charAt(i);
             o=o+Character.getNumericValue(a);
         }
        System.out.println(o);






    }
}

