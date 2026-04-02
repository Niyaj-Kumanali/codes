package JspiderCodes.Programming.TwoDArrays;

public class CharOccurance {
    public static void main(String[] args) {
        String str = "AAAAAABBBBBBLBBCCCAAAFFFEEEKKKK";
        char[] arr = str.toCharArray();
        String ans = "";
        int count = 0;

        str = str + " ";
        for (int i=0; i < arr.length-1; i++) {
            if (arr[i] != arr[i+1]) {
                ans = ans + arr[i] + ++count;
                count = 0;
            }
            else {
                count++;
            }

        }
        System.out.println(ans);
    }
}
