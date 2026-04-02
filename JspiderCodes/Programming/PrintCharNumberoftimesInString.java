package JspiderCodes.Programming;

public class PrintCharNumberoftimesInString {
    public static void main(String[] args) {
        String str = "a2b3a3b2c4";
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            for (int j = 0; j < str.charAt(i+1)-'0'; j++) {
                res += ch;
            }
            i++;
        }
        System.out.println(res);
    }
}
