package JspiderCodes.JavaMock1;

import java.util.Scanner;

public class pgm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of products :");
        int products = sc.nextInt();
        double[] prices = new double[products];


        for (int i = 0; i < prices.length; i++) {
            System.out.println("Enter the price of product "+(i+1)+" : ");
            prices[i] = sc.nextDouble();
        }
        calcGST(prices);

        sc.close();
    }

    public static void calcGST(double[] prices){
        double totalAmt = 0;
        for (int i = 0; i < prices.length; i++) {
            totalAmt += prices[i];
        }
        totalAmt += totalAmt * 0.18;
        System.out.println("The Amount including GST of 18% is "+totalAmt);
    }
}
