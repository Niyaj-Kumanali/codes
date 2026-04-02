package JspiderCodes.ProgMock020923;

// 4. write a java program to check whether sum of last four digit is prime or not

import java.util.Scanner;

public class SumLastFourDigitPrimeNumber {

    static int sumLastFourDigit(int n){
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
        return sum;
    }

    static boolean isPrime(int n){
        if(n <= 1)
            return false;
        for(int i=2; i<= n/2; i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sumLastFourDigit(n);

        if(isPrime(sum)){
            System.out.println("Prime Number");
        }
        else
            System.out.println("Not a Prime Number");
    }
}
