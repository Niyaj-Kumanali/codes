package JspiderCodes.Programming;

public class SeperateAlphaNumSpecial {
    public static void main(String[] args) {
        String s = "h12e3ll%%56@o##";
        String alpha="";
        String num="";
        String sc="";
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                alpha += ch;
            }
            else if (ch>= '0' && ch<='9'){
                num += ch;
            }
            else {
                sc += ch;
            }
        }
        System.out.println(alpha+num+sc);
    }
}
