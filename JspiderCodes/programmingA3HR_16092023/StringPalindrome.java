package JspiderCodes.programmingA3HR_16092023;

import java.util.Scanner;

public class StringPalindrome {
    public static String reverse(String str){
        String rev = "";
        for (int i = str.length()-1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }
    public static boolean isPalindrome(String str){
        str = str.toLowerCase();
        for(int i=0;i<=str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            }
        }
//        Darshan sir's logic
//        int i=0, j=str.length()-1;
//        while(i<j){
//            if(str.charAt(i) != str.charAt(j))
//                return false;
//            i++;
//            j--;
//        }
        return true;
    }

//    public static boolean isPalindrome(String str){
//        return str.equalsIgnoreCase(reverse(str));
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPalindrome(str)?"palindrome":"not a palindrome");
//        System.out.println(isPalindrome(str)?"palindrome":"not a palindrome");
    }
}
