package JspiderCodes.hackerrank.practice01;

import java.util.Scanner;

public class StringPalindrome1 {
    public static String reverse(String str){
        String temp = "";
        for(int i=str.length()-1; i>=0; i--){
            temp += str.charAt(i);
        }
        return temp;
    }

    public static boolean isPalindrome(String str){
        return str.equals(reverse(str));
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isPalindrome(str)?"palindrome":"not a palindrome");
    }
}
