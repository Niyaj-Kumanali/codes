package JspiderCodes.Programming.TwoDArrays;

public class OccuranceOfEachWord {
    public static void main(String[] args) {
        String str = "hello hi bye welcome hi hello bye";
        String[] arr1 = str.split(" ");
        String[] arr2 = str.split(" ");

        for (int i = 0; i < arr1.length; i++) {
            int count = 0;
            for (int j = i; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {
                    count++;
                    arr2[j] = "";
                }
            }
            if (count > 0)
                System.out.println(arr1[i] + " : " + count);
        }
    }
}
