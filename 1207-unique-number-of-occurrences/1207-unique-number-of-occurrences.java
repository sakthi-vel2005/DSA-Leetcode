import java.util.Set;
import java.util.Map.Entry;



class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        HashSet set = new HashSet();


        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        Set<Entry<Integer, Integer>> entries = map.entrySet();

        for(Entry<Integer, Integer> entry : entries){
            if(set.contains(entry.getValue())){
                return false;
            }else{
                set.add(entry.getValue());
            }
        }

        return true;
    }
}