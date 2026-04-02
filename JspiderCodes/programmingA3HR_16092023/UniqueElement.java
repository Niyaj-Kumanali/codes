package JspiderCodes.programmingA3HR_16092023;

import java.util.Scanner;

public class UniqueElement {

    public static boolean isPrime(int n){
        if(n <= 1)
            return false;
        for(int i=2; i<=n/2; i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static boolean isUnique(String str, char ch){
        for(int i=0; i<str.length(); i++){
            if(ch == str.charAt(i)){
                return isPrime(i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        System.out.println(isUnique(str, ch)?"unique element":"not a unique element");

    }
}
