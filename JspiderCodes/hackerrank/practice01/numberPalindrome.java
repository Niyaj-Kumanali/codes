package JspiderCodes.hackerrank.practice01;

import java.util.Scanner;

public class numberPalindrome {
    public static int reverse(int n){
        int rev = 0;
        while(n != 0){
            int rem = n % 10;
            rev = (rev * 10)+rem;
            n /= 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n == reverse(n)?"palindrome":"not a palindrome");
        sc.close();
    }
}
