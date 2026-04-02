package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<List<Integer>> arr = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr.add(Collections.singletonList(sc.nextInt()));
            }
        }

        int result = diagonalDifference(arr);
        System.out.println(result);

    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int first = 0;
        int second = 0;
        for(int i = 0; i < arr.size(); i++){
            for(int j = 0; j < arr.get(i).size(); j++){
                if(i == j){
                    first += arr.get(i).get(j);
                }
                if((i + j) == (arr.size() - 1)){
                    second += arr.get(i).get(j);
                }
            }
        }
        return (first > second) ? first - second : second - first;
    }
}

