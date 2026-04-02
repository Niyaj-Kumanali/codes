package HackerRank;
//https://www.hackerrank.com/challenges/java-loops

import java.util.Scanner;

public class LoopsII {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i=0; i<t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int sum = a;
            int mul = 1;
            for (int j=0; j<n; j++){
                sum += mul*b;
                System.out.print(sum+" ");
                mul = mul * 2;
            }
            System.out.println();
        }
    }
}
