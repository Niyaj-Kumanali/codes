package CodingBat;

public class More14 {
    public boolean more14(int[] nums) {
        int ones = 0, fours = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1)
                ones++;
            if(nums[i] == 4)
                fours++;
        }
        return ones > fours;
    }

}
