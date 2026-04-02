package JspiderCodes.ProgMock020923;

// 6. write a java program to check whether the number is Palindrome Number or not

import java.util.Scanner;

public class PalindromeNumber {
    static int reverse(int n){
        int rev = 0;

        while(n != 0){
            int rem = n % 10;
            rev += rem;
            //rev = (rev * 10) + rem;
            n /= 10;
            if(n != 0)
                rev *= 10;
        }
        return rev;
    }

    static void isPalindrome(int n){
        if(n == reverse(n))
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPalindrome(n);
    }
}
