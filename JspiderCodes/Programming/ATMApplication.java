package JspiderCodes.Programming;

import java.util.Scanner;

class Account {
    private double balance = 10000;

    public double getBalance() {
        return balance;
    }

    public void deposit(double depositAmount) {
        balance += depositAmount;
    }

    public void withdraw(double withAmount) {
        if (withAmount < balance) {
            balance -= withAmount;
        } else {
            System.out.println("!!!.....Insufficient balance.....!!!");
            System.out.println("Your Account Balance is Rs " + getBalance());
        }
    }
}

public class ATMApplication {
    private final int pin;
    private int chances;

    public ATMApplication() {
        pin = 1234;
        chances = 3;
    }

    public int getChances() {
        return chances;
    }

    public void setChances(int chances) {
        this.chances = chances;
    }

    public void reduceChances() {
        chances--;
    }

    public int getPin() {
        return pin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account account = new Account();
        ATMApplication app = new ATMApplication();

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            if (choice == 4) {
                System.out.println("Thank you for visiting our ATM. Please visit again");
                break;
            }
            System.out.print("Enter your pin : ");
            int enteredPin = sc.nextInt();
            if (enteredPin == app.getPin()) {
                app.setChances(3);
                switch (choice) {
                    case 1:
                        System.out.println("Your Account Balance is Rs " + account.getBalance());
                        break;
                    case 2:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = sc.nextDouble();
                        account.deposit(depositAmount);
                        System.out.println("Deposit successful.");
                        break;
                    case 3:
                        System.out.print("Enter withdrawal amount: ");
                        double withAmount = sc.nextDouble();
                        account.withdraw(withAmount);
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid option from below.");
                }
            } else {
                System.out.println("\nInvalid Pin....\n\n");
                app.reduceChances();
                System.out.println("You have " + app.getChances() + " chances left");
                if (app.getChances() == 0) {
                    System.out.println("You have entered incorrect pin 3 times. Your atm is blocked, try contacting nearest branch");
                    break;
                }
            }

        }
    }
}

