class Solution {
    public int maxProduct(int[] nums) {
        
       int v = Integer.MIN_VALUE;
       int vp = Integer.MIN_VALUE;

       for(int i=0; i<nums.length; i++){
        if(nums[i] > v ){
            vp= v;
            v = nums[i];
        }
        else if(nums[i] >= vp){
            vp = nums[i];
        }
       }

       return (vp-1)* (v-1);
    }
}