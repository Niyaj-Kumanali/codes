package HackerRank;

import java.util.Collections;
import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String s = Integer.toString(n);
        if(s.getClass().getSimpleName().equals("String"))
            System.out.println("Good job");
        else
            System.out.println("Wrong Answer");


    }
}
