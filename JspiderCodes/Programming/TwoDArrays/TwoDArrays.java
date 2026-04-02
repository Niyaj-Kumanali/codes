package JspiderCodes.Programming.TwoDArrays;

import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        // Program to take input from the user with help of row and columns
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int[] arr1 : arr) {
            for (int ele : arr1) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
