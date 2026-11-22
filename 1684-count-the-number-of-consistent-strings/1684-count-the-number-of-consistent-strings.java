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

        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(!key.contains(String.valueOf(ch))){
                return false;
            }
        }
        return true;
    }
}