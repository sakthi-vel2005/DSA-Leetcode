class Solution {
    public boolean checkIfPangram(String sentence) {
        
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch = 'a'; ch<='z'; ch++){
            map.put(ch,0);
        }

        for(int i=0; i<sentence.length(); i++){
            char ch = sentence.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(int n : map.values()){
            if(n==0){
                return false;
            }
        }

        return true;
    }
}