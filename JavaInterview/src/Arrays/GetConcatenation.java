package Arrays;

public class GetConcatenation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int[] ans = new GetConcatenation().getConcatenation(nums);
        for(int i : ans) {
            System.out.println(i);
        }
    }


    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for(int i=0; i<ans.length; i++) {
            if(i<nums.length) {
                ans[i] = nums[i];
            } else {
                ans[i] = nums[i -nums.length];
            }
        }
        return ans;
    }

}
