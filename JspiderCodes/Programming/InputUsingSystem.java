package JspiderCodes.Programming;

import java.io.IOException;

public class InputUsingSystem {
    public static void main(String[] args) throws IOException {
        int n = System.in.read(); // taking 1st char and converting into ASCII
        System.out.println(n);
    }
}
