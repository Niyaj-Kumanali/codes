package CodingBat;

public class FizzArray {
    public int[] fizzArray(int n) {
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = i;
        }
        return arr;
    }

}
