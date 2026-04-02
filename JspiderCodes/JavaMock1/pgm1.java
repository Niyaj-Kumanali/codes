package JspiderCodes.JavaMock1;

import java.util.Scanner;

public class pgm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double accBal = 10000.00;
        int actualPin = 1234;

        System.out.println("Enter the Pin :");
        int enterdPin = sc.nextInt();



        if(actualPin == enterdPin){
            System.out.println("Valid Pin");
            System.out.println("Enter the amount to withdraw : ");
            double withAmt = sc.nextDouble();
            if(accBal > withAmt){
                accBal -= withAmt;
                System.out.println("Withdraw Success");
            }
            else{
                System.out.println("Insufficient Balance");
            }
            System.out.println("Account balance is "+accBal);
        }
        else{
            System.out.println("Invalid Pin");
        }

        sc.close();
    }
}
