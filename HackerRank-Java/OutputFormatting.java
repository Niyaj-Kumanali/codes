package HackerRank;
//https://www.hackerrank.com/challenges/java-output-formatting/

import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        int num1 = sc.nextInt();
        String str2 = sc.next();
        int num2 = sc.nextInt();
        String str3 = sc.next();
        int num3 = sc.nextInt();
        sc.close();

        System.out.println("================================");
        print(str1, num1);
        print(str2, num2);
        print(str3, num3);
        System.out.println("================================");


    }

    public static void print(String str, int num){
        int len = (int)(Math.log10(num) + 1);
        System.out.print(str+"");
        for (int i=0; i<15-str.length(); i++)
            System.out.print(" ");
        if (num == 0)
            System.out.println("000");
        else if (len == 1)
            System.out.println("00"+num);
        else if(len == 2)
            System.out.println("0"+num);
        else
            System.out.println(num);
    }
}
