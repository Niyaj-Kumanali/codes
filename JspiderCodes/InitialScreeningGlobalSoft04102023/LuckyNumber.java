package JspiderCodes.InitialScreeningGlobalSoft04102023;

import java.util.Scanner;
import java.math.BigInteger;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTestCases = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int t = 0; t < numTestCases; t++) {
            int X = scanner.nextInt();
            String result = findSmallestLuckyNumber(X);
            System.out.println(result);
        }
    }

    public static String findSmallestLuckyNumber(int X) {
        BigInteger number = BigInteger.ONE;
        int maxLength = 200;

        for (int length = 1; length <= maxLength; length++) {
            BigInteger eightMultiple = new BigInteger("8").multiply(number);
            BigInteger sixMultiple = new BigInteger("6").multiply(number);

            if (eightMultiple.mod(BigInteger.valueOf(X)).equals(BigInteger.ZERO)) {
                return eightMultiple.toString();
            } else if (sixMultiple.mod(BigInteger.valueOf(X)).equals(BigInteger.ZERO)) {
                return sixMultiple.toString();
            }

            number = number.multiply(BigInteger.TEN);
        }

        return "-1";
    }
}

//public class SmallestLuckyNumber {
//    public static void main(String[] args) {
//        int n = Integer.parseInt(System.console().readLine());
//        for (int i = 0; i < n; i++) {
//            int x = Integer.parseInt(System.console().readLine());
//            int s = findSmallestLuckyNumber(x);
//            if (s == -1) {
//                System.out.println(-1);
//            } else {
//                System.out.println(s);
//            }
//        }
//    }
//
//    private static int findSmallestLuckyNumber(int x) {
//        int s = 0;
//        while (x > 1) {
//            if (x % 6 == 0) {
//                s = s * 10 + 6;
//                x /= 6;
//            } else if (x % 8 == 0) {
//                s = s * 10 + 8;
//                x /= 8;
//            }
//        }
//
//        while (s > 0 && s % 10 == 0) {
//            s /= 10;
//            s = s * 10 + 6;
//        }
//
//        if (String.valueOf(s).length() > 200) {
//            return -1;
//        }
//
//        return s;
//    }
//}


    //4
    //6
    //8
    //43


    //5
    //Output
    //6
    //8
    //86
    //-1


