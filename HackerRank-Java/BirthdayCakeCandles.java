package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++){
            arr.add(sc.nextInt());
        }

        System.out.println(birthdayCakeCandles(arr));
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        long max = Collections.max(candles);
        int count = 0;
        for (int i = 0; i < candles.size(); i++) {
            if(candles.get(i) == max)
                count++;
        }

        return count;
    }
}
