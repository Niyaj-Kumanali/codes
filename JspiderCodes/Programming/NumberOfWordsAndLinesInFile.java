package JspiderCodes.Programming;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumberOfWordsAndLinesInFile {
    public static void main(String[] args) throws IOException {
        FileReader f = new FileReader("src/Jspiders/Programming/Hello.txt");
        BufferedReader br = new BufferedReader(f);
        int words = 0;
        int lines = 0;
        String s = "";
        while ((s=br.readLine()) != null) {
//            System.out.println(s);
            words += s.split(" ").length;
            lines++;
        }

        System.out.println("Lines: "+lines);
        System.out.println("Words: "+words);
    }
}
