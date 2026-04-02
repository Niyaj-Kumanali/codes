package HackerRank;

import java.util.Scanner;

public class StringIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        System.out.println(A.length() + B.length());
        if(A.compareTo(B) > 0)
            System.out.println("Yes");
        else
            System.out.println("No");

        A = Character.toString(A.charAt(0)).toUpperCase() + A.substring(1);
        B = Character.toString(B.charAt(0)).toUpperCase() + B.substring(1);
        System.out.println(A+" "+B);
    }
}
