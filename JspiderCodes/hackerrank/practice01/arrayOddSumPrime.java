package JspiderCodes.hackerrank.practice01;

import java.util.Scanner;

public class arrayOddSumPrime {
    public static boolean isPrime(int n){
        if(n <= 1)
            return false;
        for(int i=2; i<=n/2; i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }

    public static int oddSum(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 1)
                sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(isPrime(oddSum(arr))?"prime":"not prime");
    }
}
