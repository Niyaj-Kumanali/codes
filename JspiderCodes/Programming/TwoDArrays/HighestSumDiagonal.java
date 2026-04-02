package JspiderCodes.Programming.TwoDArrays;

import java.util.Scanner;

public class HighestSumDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        int left = 0;
        int right = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
                if (i == j) {
                    left += arr[i][j];
                }
                if(i + j == arr.length - 1){
                    right += arr[i][j];
                }
            }
        }
        System.out.println(left > right? "left":"right");
    }
}
