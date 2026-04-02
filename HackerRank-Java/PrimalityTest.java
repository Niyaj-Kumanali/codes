package HackerRank;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger n=new BigInteger(sc.nextLine());
        boolean isPrime=n.isProbablePrime(1);
        System.out.println(isPrime ? "prime": "not prime");
        sc.close();
    }
}
