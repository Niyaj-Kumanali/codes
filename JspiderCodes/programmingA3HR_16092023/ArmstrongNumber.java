package JspiderCodes.programmingA3HR_16092023;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isArmStrong(n);
    }

    public static void isArmStrong(int n){
        int exp = countDigits(n);
        int sum = 0;
        int temp = n;
        while(temp != 0){
            int rem = temp % 10;
            sum += power(rem, exp);
            temp /= 10;
        }
        System.out.println(n==sum?"Armstrong Number":"Not a Armstrong Number");
    }

    public static int countDigits(int n){
        int count = 0;
        while(n != 0){
            count++;
            n /= 10;
        }
        return count;
    }

    public static int power(int base, int exp){
        int pow = 1;
        for (int i = 0; i < exp; i++) {
            pow *= base;
        }
        return pow;
    }
}
