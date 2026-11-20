import java.util.Set;
import java.util.Map.Entry;

class Solution {
    public int findLucky(int[] arr) {
        

        TreeMap<Integer,  Integer> map = new TreeMap<Integer, Integer>();

        for(int i : arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        Set<Entry<Integer, Integer>> entries = map.entrySet();
        int max = -1;

        for(Entry<Integer, Integer> entry : entries){
            int key =entry.getKey();
            if(key == entry.getValue()){
              
                max= key;;
               
            }
        }
        return max;
    }
}