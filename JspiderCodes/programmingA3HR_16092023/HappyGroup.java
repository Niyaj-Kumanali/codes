package JspiderCodes.programmingA3HR_16092023;

import java.util.Scanner;

public class HappyGroup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int max = arr[0], sum = 0;
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
            if(max < arr[i])
                max = arr[i];
            sum += arr[i];
        }
        System.out.println(max == (sum - max)?"happy group":"not a happy group");
    }
}
