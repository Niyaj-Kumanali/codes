package JspiderCodes.ProgMock020923;

// 6. write a java program to check whether the number is Strong Number or not
// ex : 145 --> 1! + 4! + 5! == 145

import java.util.Scanner;

public class StrongNumber {
    static int fact(int n){
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact *= i;
        }
        return fact;
    }

    static void isStrong(int n){
        int sum = 0;
        int m = n;

        while (m != 0){
            int rem = m % 10;
            sum += fact(rem);
            m /= 10;
        }

        if(n == sum)
            System.out.println("Strong Number");
        else
            System.out.println("Not a Strong Number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isStrong(n);
    }
}
