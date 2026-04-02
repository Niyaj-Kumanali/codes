package JspiderCodes.Programming;

import java.util.Scanner;

public class RotateMatrixByDegree {
    public static void rotate(int[][] arr, int rotate) {
        int loop = rotate / 90;
        while (loop != 0) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length / 2; j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[i][arr.length - 1];
                    arr[i][arr.length - 1] = temp;
                }
            }
            loop--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int rotate = sc.nextInt();
        rotate(arr, rotate);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
//1 2 3
//4 5 6
//7 8 9

//7 4 1
//8 5 2
//9 6 3 --> 90

//9 8 7
//6 5 4
//3 2 1 --> 180

//3 6 9
//2 5 8
//1 4 7 --> 270

//1 2 3
//4 5 6
//7 8 9 --> 360