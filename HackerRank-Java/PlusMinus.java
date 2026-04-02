package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++){
           arr.add(sc.nextInt());
        }

        plusMinus(arr);
    }

    public static void plusMinus(List<Integer> arr) {
        double pos = 0.0;
        double neg = 0.0;
        double zero = 0.0;
        double size = arr.size();

        for (int i = 0; i < size; i++) {
            if(arr.get(i) > 0)
                pos++;
            else if(arr.get(i) < 0)
                neg++;
            else
                zero++;
        }
        System.out.println(pos/size);
        System.out.println(neg/size);
        System.out.println(zero/size);

    }
}
