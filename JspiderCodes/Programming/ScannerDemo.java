package JspiderCodes.Programming;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the n1 :");
//        int n1 = sc.nextInt();
//        System.out.println("Enter the n2 :");
//        int n2 = sc.nextInt();
//        System.out.println("sum : "+n1+n2);
//        System.out.println("sum : "+(n1+n2));


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n1:-");
        int n1 = sc.nextInt();
        sc.next();
        String s = sc.next();
        System.out.print("Enter the n2:-");
        int n2 = sc.nextInt();
        System.out.println("The sum is "+(n1+n2));
        System.out.println("string : "+s);

    }
}
