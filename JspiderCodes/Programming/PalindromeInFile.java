package JspiderCodes.Programming;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PalindromeInFile {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        for (int i = 0; i <= str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        FileReader f = new FileReader("src/Jspiders/Programming/Hello.txt");
        BufferedReader br = new BufferedReader(f);
        String s = "";
        while ((s = br.readLine()) != null) {
            String[] arr = s.split(" ");
            for (String str : arr) {
                if (isPalindrome(str)) {
                    System.out.println(str);
                }
            }
        }
    }
}
