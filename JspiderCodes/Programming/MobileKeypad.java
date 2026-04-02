package JspiderCodes.Programming;

import java.util.Scanner;

public class MobileKeypad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            switch (ch) {
                case 'a':
                case 'b':
                case 'c':
                    sum += 2;
                    break;
                case 'd':
                case 'e':
                case 'f':
                    sum += 3;
                    break;
                case 'g':
                case 'h':
                case 'i':
                    sum += 4;
                    break;
                case 'j':
                case 'k':
                case 'l':
                    sum += 5;
                    break;
                case 'm':
                case 'n':
                case 'o':
                    sum += 6;
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    sum += 7;
                    break;
                case 't':
                case 'u':
                case 'v':
                    sum += 8;
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    sum += 9;
                    break;
            }
        }
        System.out.println(sum);
    }
}
