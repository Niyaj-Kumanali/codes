package CodingBat;

public class CenteredAverage {
    public static int centeredAverage(int[] nums) {
        // Arrays.sort(nums);
        // int min = nums[0];
        // int max = nums[nums.length - 1];

        // int sum = 0;

        // for(int i=1; i<nums.length-1; i++){
        //     sum += nums[i];
        // }

        // return (sum/(nums.length-2));

        int min = findMin(nums);
        int max = findMax(nums);

        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        sum = sum - min - max;
        return sum/(nums.length - 2);
    }

    public static int findMin(int[] nums){
        int min = nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        return min;
    }

    public static int findMax(int[] nums){
        int max = nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1,4,3,2,4};
        System.out.println(centeredAverage(nums));
    }


}
