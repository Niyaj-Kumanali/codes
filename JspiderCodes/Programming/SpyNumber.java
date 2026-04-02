package JspiderCodes.Programming;

import java.sql.SQLOutput;

public class SpyNumber {
    public static void isSpy(int n){
        int sum = 0;
        int product = 1;
        while(n != 0){
            int rem = n % 10;
            sum += rem;
            product *= rem;
            n /= 10;
        }
        System.out.println(sum==product?"Spy Number":"Not a spy number");
    }

    public static void main(String[] args) {
        int n = 22;
        isSpy(n);
    }
}
