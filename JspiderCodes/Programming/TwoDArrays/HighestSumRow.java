package JspiderCodes.Programming.TwoDArrays;

import java.util.Scanner;

public class HighestSumRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
//      Program to calculate sum of each row and print the row number which has highest sum
        int max = arr[0][0];
        int rowIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
            if(max < sum){
                max = sum;
                rowIndex = i;
            }
        }
        System.out.println("Row "+(rowIndex+1)+" : "+max);
    }
}
