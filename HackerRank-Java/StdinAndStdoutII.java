package HackerRank;

import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-stdin-stdout

public class StdinAndStdoutII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double db = sc.nextDouble();
        sc.nextLine();
        String str = sc.nextLine();
        sc.close();

        System.out.println("String: "+str);
        System.out.println("Double: "+db);
        System.out.println("Int: "+num);
    }
}
