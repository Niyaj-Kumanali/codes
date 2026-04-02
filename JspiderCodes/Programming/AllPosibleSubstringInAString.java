package JspiderCodes.Programming;

public class AllPosibleSubstringInAString {
    public static void main(String[] args) {
        String str = "abcaed";
        for(int i=0; i<str.length()-1; i++){
            String temp  = ""+str.charAt(i);
            for(int j=i+1; j<str.length(); j++){
                temp += str.charAt(j);
                System.out.println(temp);
            }
        }
    }
}
