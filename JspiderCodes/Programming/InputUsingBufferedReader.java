package JspiderCodes.Programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputUsingBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
//        System.out.println(str);
        byte b = Byte.parseByte(str);
        short s = Short.parseShort(str);
        int n = Integer.parseInt(str);
        long l = Long.parseLong(str);
        float f = Float.parseFloat(str);
        double d = Double.parseDouble(str);
        char c = str.charAt(0);
        boolean bool = Boolean.parseBoolean(str);

    }
}
