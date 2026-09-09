class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        LinkedHashSet<Integer> result = new LinkedHashSet<Integer>();
       
        int[] smaller = nums1;
        int[] larger = nums2;

        if(nums1.length > nums2.length){
            larger = nums1;
            smaller = nums2;
        }

        for(int i=0; i<larger.length; i++){
            set.add(larger[i]);
        }

        for(int i=0; i<smaller.length; i++){
            if(set.contains(smaller[i])){
              result.add(smaller[i]);
            }
        }
      int[] ans = new  int[result.size()];

      int i=0;
      for(int num : result){
            ans[i] = num;
            i++;
      }
      return ans;
    }
}