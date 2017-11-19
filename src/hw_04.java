
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class hw_04 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a= scn.nextInt();
        String str = "YES";

        if(a%2 == 0 && a != 2){
            str = ("NO");
        }
        if(a == 1) {
            str = ("NO");
        }

        for(int i=2; i<=a/2; i+=1){
            if(a%i==0){
                str = ("NO");
            }
        }
        System.out.println("YES");
    }
}




