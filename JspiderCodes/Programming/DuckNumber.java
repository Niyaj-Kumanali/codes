package JspiderCodes.Programming;

import java.util.Scanner;

public class DuckNumber {
    public static void duckNo(int n)
    {
        boolean flag = false;
        while(n>0){
            int rem = n % 10;
            if(rem == 0){
                flag = true;
                break;
            }
            n /= 10;
        }
        System.out.println(flag?"Duck Number":"Not a Duck Number");
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int n = 2000;
        duckNo(n);
    }
}
