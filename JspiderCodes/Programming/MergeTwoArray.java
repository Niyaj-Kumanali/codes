package JspiderCodes.Programming;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7};
        int[] res = new int[arr1.length + arr2.length];
//        int i=0;
//        for(i=0; i<arr1.length; i++){
//            res[i] = arr1[i];
//        }
//        for(int j=0; j<arr2.length; j++){
//            res[i] = arr2[j];
//            i++;
//        }

//        for(int i=0, j=0; i<res.length; i++){
//            if(i < arr1.length){
//                res[i] = arr1[i];
//            }
//            else {
//                res[i] = arr2[j];
//                j++;
//            }
//        }

        for (int a : res) {
            System.out.print(a + " ");
        }

    }
}
