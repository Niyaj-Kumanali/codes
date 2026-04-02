package JspiderCodes.Programming;

import java.util.Arrays;
import java.util.Scanner;

public class MakeMeBig {
    public static void sort(char[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j] < arr[j+1]){
                    char temp = arr[j] ;
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int n = 63856;
        char[] arr = (""+n).toCharArray();
        sort(arr);

        n = Integer.parseInt(new String(arr));
        System.out.println(n);

    }
}
