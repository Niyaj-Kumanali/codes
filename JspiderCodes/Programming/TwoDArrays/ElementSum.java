package JspiderCodes.Programming.TwoDArrays;

import java.util.Scanner;

public class ElementSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
                sum = sum + arr[i][j];

            }
        }
        System.out.println(sum);
    }
}
