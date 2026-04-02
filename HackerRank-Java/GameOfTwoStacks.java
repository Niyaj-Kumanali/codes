package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameOfTwoStacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0; i<t; i++){
            int fsize = sc.nextInt();
            int ssize = sc.nextInt();
            int maxSum = sc.nextInt();
            List<Integer> a = new ArrayList<>();
            List<Integer> b = new ArrayList<>();
            for (int j = 0; j < fsize; j++) {
                a.add(sc.nextInt());
            }
            for (int j = 0; j < ssize; j++) {
                b.add(sc.nextInt());
            }
            System.out.println(twoStacks(maxSum, a, b));
        }


    }

    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        return twoStacks(maxSum, a, b, 0, 0) - 1;
    }

    private static int twoStacks(int maxSum, List<Integer> a, List<Integer> b, int sum, int count){
        if (sum > maxSum)
            return count;

        if (a.size() == 0 || b.size() == 0)
            return count;

        int left = twoStacks(maxSum, a.subList( 1, a.size()), b, sum + a.get(0), count + 1 );
        int right = twoStacks(maxSum, a, b.subList( 1, b.size()), sum + b.get(0), count + 1 );

        return Math.max(left, right);
    }
}
