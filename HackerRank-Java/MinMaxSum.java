package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++){
            arr.add(sc.nextInt());
        }

        miniMaxSum(arr);
    }

    public static void miniMaxSum(List<Integer> arr) {
        List<Long> results = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            long sum = 0;
            for (int j = 0; j < arr.size(); j++) {
                if(i != j)
                    sum += arr.get(j);
            }
            results.add(sum);
        }
        long min = Collections.min(results);
        long max = Collections.max(results);

        System.out.println(min+" "+max);

    }
}
