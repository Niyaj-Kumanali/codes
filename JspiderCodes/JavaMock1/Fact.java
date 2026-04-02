package JspiderCodes.JavaMock1;

import java.util.Scanner;

public class Fact {
    public static int calculateFactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        return fact;
    }

    public static int findPower(int base, int exponent) {
        int res = 1;
        for (int i = 0; i < exponent; i++) {
            res *= base;
        }

        return res;
    }


    public static double calculateTex(double income) {
        if (income <= 250000) {
            return 0;
        } else if (income <= 500000) {
            return (income - 250000) * 0.05;
        } else if (income <= 1000000) {
            return (income - 500000) * 0.2 + 12500;
        } else {
            return (income - 1000000) * 0.3 + 112500;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double income = sc.nextDouble();
        System.out.println((int) calculateTex(income));
        sc.close();
    }
}
