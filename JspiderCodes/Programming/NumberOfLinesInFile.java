package JspiderCodes.Programming;

import java.io.*;

public class NumberOfLinesInFile {
    public static void main(String[] args) throws IOException {
        FileReader f = new FileReader("src/Jspiders/Programming/Hello.txt");
        BufferedReader br = new BufferedReader(f);
        int count = 0;
        while (br.readLine() != null) {
            count++;
        }
        System.out.println(count);


    }
}
