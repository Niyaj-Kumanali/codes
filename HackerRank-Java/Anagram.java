package HackerRank;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.println(isAnagram(a,b));
    }
    static boolean isAnagram(String a, String b) {
        char[] A = a.toLowerCase().toCharArray();
        char[] B = b.toLowerCase().toCharArray();

        boolean isAnagram = true;
        if(A.length == B.length) {
            A = bubbleSort(A);
            B = bubbleSort(B);
            for (int i = 0; i < A.length; i++) {
                if (A[i] != B[i])
                    isAnagram = false;
            }
        }
        else
            isAnagram = false;

        return isAnagram;
    }

    public static char[] bubbleSort(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
        {
            boolean sorted = false;
            for (int j = 1; j <= arr.length - i -1; j++)
                if (arr[j] < arr[j-1])
                {
                    swap(arr, j, j-1);
                    sorted = true;
                }
            if (!sorted)
                break;
        }
        return arr;
    }

    public static void swap(char[] arr, int a, int b)
    {
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
