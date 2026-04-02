package JspiderCodes.Programming;

public class LongestPrefixInTwoArrayList {
    public static void main(String[] args) {
        String str1 = "xyz";
        String str2 = "xyzabc" +
                "";

        String res = "";
        int size = str1.length()<str2.length()? str1.length():str2.length();
        for(int i=0; i<size; i++){
            if(str1.charAt(i) == str2.charAt(i)){
                res += str1.charAt(i);
            }
            else{
                break;
            }
        }
        System.out.println(res);
    }
}
