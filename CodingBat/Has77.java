package CodingBat;

public class Has77 {
    public boolean has77(int[] nums) {
        for(int i=0; i<nums.length-2; i++){
            if((nums[nums.length-1] == 7 && nums[nums.length-2] == 7) || (nums[i] == 7 && nums[i+1] == 7) || (nums[i] == 7 && nums[i+2] == 7) ){
                return true;
            }
        }
        return false;
    }

}
