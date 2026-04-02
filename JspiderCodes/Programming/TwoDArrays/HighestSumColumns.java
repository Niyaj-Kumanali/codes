package JspiderCodes.Programming.TwoDArrays;

import java.util.Scanner;

public class HighestSumColumns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        int[][] transpose = new int[col][row];
        
//      Program to calculate sum of each row and print the row number which has highest sum
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
                //tranpose of the matrix
                transpose[j][i] = arr[i][j];
            }
        }
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

        
        int max = transpose[0][0];
        int colIndex = 0;
        for (int i = 0; i < transpose.length; i++) {
            int sum = 0;
            for (int j = 0; j < transpose[i].length; j++) {
                sum += transpose[i][j];
            }
            if(max < sum){
                max = sum;
                colIndex = i;
            }
        }
        System.out.println("Column "+(colIndex+1)+" : "+max);
    }
}
