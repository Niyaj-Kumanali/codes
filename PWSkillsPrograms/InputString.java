import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        System.out.println("You have entered : "+str);
    }
}
