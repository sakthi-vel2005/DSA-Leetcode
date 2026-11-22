class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        int count=0;
        
        for(int i=0; i<words.length; i++){
            if(checkFound(words[i], allowed)){
                count++;
            }
        }
        return count;
    }

    public static boolean checkFound(String word, String key){

      boolean[] arr = new boolean[26];

      for(char ch : key.toCharArray()){
        arr[ch-'a'] = true;
      }
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(!arr[ch-'a']){
                return false;
            }
        }
        return true;
    }
}