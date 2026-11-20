class Solution {
    public int[] sortedSquares(int[] nums) {
        

        for(int i=0; i<nums.length; i++){
            nums[i] = Square(nums[i]);
        }

        Arrays.sort(nums);
        return nums;
    }

    public static int Square(int n){

        int res = n*n;

        return res;
    }
}