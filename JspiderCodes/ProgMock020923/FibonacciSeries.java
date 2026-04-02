package JspiderCodes.ProgMock020923;

import java.util.Scanner;
// 3. WAP to print fibonacci series
// n -> 5
// op -> 0,1, 1, 2, 3
public class FibonacciSeries {
    static void fib(int n){
        int a = 0;
        int b = 1;
        while(n>0){
            System.out.print(a+" ");
            int sum = a + b;
            a = b;
            b = sum;
            n--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fib(n);
    }
}
