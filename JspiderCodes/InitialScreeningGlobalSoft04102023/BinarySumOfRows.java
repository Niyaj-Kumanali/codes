package JspiderCodes.InitialScreeningGlobalSoft04102023;

import java.util.Scanner;

public class BinarySumOfRows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();
        sc.nextLine();

        int[][] binaryArray = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String row = sc.nextLine();
            String[] elements = row.split(" ");

            for (int j = 0; j < cols; j++) {
                binaryArray[i][j] = Integer.parseInt(elements[j], 2);
            }
        }

        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += binaryArray[i][j];
            }
            System.out.println(rowSum);
        }
    }
}


//3
//3
//1101 011 111
//1011 1111 0101
//101 1110 0001

//op -->
//23
//31
//18