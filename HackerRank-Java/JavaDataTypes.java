package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaDataTypes {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        ArrayList<Long> list = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            list.add(sc.nextLong());
        }

        for (int i = 0; i < T; i++) {
            if(list.get(i) <= Byte.MAX_VALUE){
                System.out.println(list.get(i)+" can be fitted in:");
                System.out.println("* byte");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            }
            else if(list.get(i) <= Short.MAX_VALUE){
                System.out.println(list.get(i)+" can be fitted in:");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");

            }
            else if(list.get(i) <= Integer.MAX_VALUE){
                System.out.println(list.get(i)+" can be fitted in:");
                System.out.println("* int");
                System.out.println("* long");
            }
            else if(list.get(i) <= Long.MAX_VALUE){
                System.out.println(list.get(i)+" can be fitted in:");
                System.out.println("* long");
            }
            else
                System.out.println(list.get(i)+" can't be fitted anywhere");
        }

    }
}
