package HackerRank;

import java.util.Collections;
import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(timeConversion(s));
    }

    public static String timeConversion(String s) {
        String hh = s.substring(0,2);
        String mm = s.substring(3,5);
        String ss = s.substring(6,8);
        String f = s.substring(8);
        if(f.equals("PM") && !(hh.equals("12"))) {
            int temp = Integer.parseInt(hh);
            hh = Integer.toString((temp + 12));
        }
        if(f.equals("AM") && (hh.equals("12"))) {
            hh = "00";
        }
        return hh+":"+mm+":"+ss;

    }
}
//12:05:45AM