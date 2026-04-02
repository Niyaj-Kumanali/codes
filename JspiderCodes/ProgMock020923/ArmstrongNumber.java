package JspiderCodes.ProgMock020923;

// 5. write a java program to check whether the number is Armstrong Number or not

import java.util.Scanner;

public class ArmstrongNumber {
    public static int count(int n){
        int count = 0;
        while(n != 0){
            count++;
            n /= 10;
        }
        return count;
    }

    public static int power(int n, int exp){
        int pow = 1;
        for (int i = 0; i < exp; i++) {
            pow *= n;
        }
        return pow;
    }

    public static void isArmStrong(int n){
        int exp = count(n);
        int sum = 0;
        int m = n;
        while(m != 0){
            int rem = m % 10;
            sum += power(rem, exp);
            m /= 10;
        }
        if(n == sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not a Armstrong Number");
//        System.out.println(n==sum?"Armstrong Number":"Not a Armstrong Number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isArmStrong(n);
    }
}
