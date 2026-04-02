package JspiderCodes.Programming;

public class StringLength {
    public static void main(String[] args) {
        String str = "hello";
        int[] arr = {1,2,3,4,5};
        int length = 0;
//        try {
//            while(str.charAt(length) != '\0'){
//                length++;
//            }
//        }
//        catch (Exception e){
//            System.out.println(length);
//        }

        try {
            while(arr[length]!= '\0'){
                length++;
            }
        }
        catch (Exception e){
            System.out.println(length);
        }



    }
}
