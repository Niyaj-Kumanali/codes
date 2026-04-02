package HackerRank;

import java.util.Scanner;

class UsernameValidator {
    public static final String regularExpression = "^[A-Za-z][a-zA-Z0-9_]{7,29}$";
}
public class ValidUsernameRegularExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while (n-- != 0) {
            String userName = sc.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
