import java.util.Scanner;

public class ex_3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m =scn.nextInt();
        int count =0;
        while (n>0){
           if(n%10 ==m){
               count++;
           }n=n/10;
       }
        System.out.println(count);


    }
}

