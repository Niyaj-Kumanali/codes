package JspiderCodes.Programming;

import java.util.Scanner;

public class RotateArray {
    static void rotateRight(int[] arr, int k){
        for(int i=0; i<k; i++){
            int temp = arr[arr.length-1];
            for(int j=arr.length-1; j>0; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
    }
    static void rotateleft(int[] arr, int k){
        for(int i=0; i<k; i++){
            int temp = arr[0];
            for(int j=0; j<arr.length-1; j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 1;
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int[] arr = new int[size];
//        for(int i=0; i<size; i++){
//            arr[i] = sc.nextInt();
//        }
//        int k = sc.nextInt();
        rotateRight(arr, k);
        for(int ele: arr){
            System.out.print(ele +" ");
        }
        System.out.println();
        rotateleft(arr, k);
        for(int ele: arr){
            System.out.print(ele +" ");
        }
    }
}
