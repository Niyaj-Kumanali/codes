package JspiderCodes.hackerrank.practice01;

import java.util.Scanner;

public class greatest3No {
    public static int greatestNo(int a, int b, int c){
        // if(a > b){
        //     if(a > c)
        //         return a;
        //     return c;
        // }
        // else{
        //     if(b > c)
        //         return b;
        //     return c;
        // }

        return a>b?a>c?a:c:b>c?b:c;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(greatestNo(a, b, c));
    }
}
