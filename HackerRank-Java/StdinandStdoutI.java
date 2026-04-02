package HackerRank;

import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/

public class StdinandStdoutI {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        sc.close();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
