class Solution {
    public int maxProduct(int[] nums) {
        
        int max = Integer.MIN_VALUE;
       

        for(int i=1; i<nums.length; i++){
            int sum=0;
            for(int j=0; j<i; j++){
                sum =  (nums[i]-1) * (nums[j]-1);
            
                if(sum >  max){
                    max = sum;
                }
            }
        }

        return max;
    }
}