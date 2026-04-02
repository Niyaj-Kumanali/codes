package HackerRank;

import java.util.Scanner;

public class SubstringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int k = sc.nextInt();
        System.out.println(getSmallestAndLargest(s, k));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        smallest = s.substring(0,k);
        largest = s.substring(0,k);
        if(s.length() > k) {
            for (int i = 0; i < s.length(); i++) {
                String temp = "";
                if (i + k <= s.length()) {
                    temp = s.substring(i, i + k);
                    if (temp.compareTo(largest) > 0) {
                        largest = temp;
                    }
                    if (temp.compareTo(smallest) < 0)
                        smallest = temp;
                }
            }
        }

        return smallest + "\n" + largest;
    }
}
