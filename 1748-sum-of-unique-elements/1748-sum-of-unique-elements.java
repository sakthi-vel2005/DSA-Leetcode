import java.util.Set;
import java.util.Map.Entry;

class Solution {
    public int sumOfUnique(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        Set<Entry<Integer, Integer>> entries = map.entrySet();
        int sum =0;

        for(Entry<Integer, Integer> entry : entries){
            if(entry.getValue()==1){
                sum += entry.getKey(); 
            }
        }

        return sum;
    }
}