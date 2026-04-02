package JspiderCodes.Programming;
//Asked in many companies and it is very very important

public class IPAddressValidation {
    public static boolean isValidIP(String str) {
        String[] arr = str.split("[.]");
        if (arr.length != 4)
            return false;
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            if (num < 0 || num > 255)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "122.123.67.4";
        System.out.println(isValidIP(str) ? "Valid IP Address" : "Invalid IP Address");
    }
}
