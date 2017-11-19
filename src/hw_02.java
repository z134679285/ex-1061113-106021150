import java.util.Scanner;

public class hw_02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int a = scn.nextInt();
        for (int i = 0; i < str.length(); i++) {
            char ch = (char) (str.charAt(i) + a);
            System.out.print(ch);
        }
        System.out.println();
    }
}