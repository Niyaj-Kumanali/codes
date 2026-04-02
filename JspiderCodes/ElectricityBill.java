package JspiderCodes;

import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int custID = getCustID(sc);
        String custName = getName(sc);
        int units = getUnits(sc);

        double bill = calcElectricityBill(units);
        double subchargeAmt = calSubchargeAmt(bill);
        double chargePerUnit = bill / units;

        printDetails(custID, custName, units, bill, subchargeAmt, chargePerUnit);
        sc.close();
    }

    public static double calcElectricityBill(int units) {
        if (units <= 199)
            return units * 1.20;
        else if (units <= 400)
            return units * 1.50;
        else if (units <= 600)
            return units * 1.80;
        else
            return units * 2.00;
    }

    public static double calSubchargeAmt(double bill) {
        if (bill > 400)
            return bill * 0.15;
        return 0;
    }

    public static void printDetails(int custID, String custName, int units, double bill, double subchargeAmt, double chargePerUnit) {
        System.out.println("Customer IDNO : " + custID);
        System.out.println("Customer Name : " + custName);
        System.out.println("unit Consumed : " + units);
        System.out.println("Amount Charges @Rs." + chargePerUnit + " per unit : " + bill);
        System.out.println("Subcharge Amount : " + subchargeAmt);
        System.out.println("Net Amount Paid By the Customer : " + (bill + subchargeAmt));

    }

    public static String getName(Scanner sc) {
        return sc.next();
    }

    public static int getCustID(Scanner sc) {
        return sc.nextInt();
    }

    public static int getUnits(Scanner sc) {
        return sc.nextInt();
    }
}