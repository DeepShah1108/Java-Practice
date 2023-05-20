package Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] ans = new ShuffleTheArray().shuffle(nums, n);
        for(int i : ans) {
            System.out.println(i);
        }
    }
    
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int j = 0;
        for(int i=0; i<nums.length; i+=2) {
            ans[i] = nums[j++];
            ans[i+1] = nums[n++];
        }

        return ans;
    }
}
