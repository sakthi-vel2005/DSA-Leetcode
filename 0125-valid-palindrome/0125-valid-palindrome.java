class Solution {
    public boolean isPalindrome(String s) {
        String t="";

        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9')){
                t += ch;
            }
        }

      
        t = t.toLowerCase();

        if(t.length()==0){
            return true;
        }
        
       
       int i=0, j= t.length()-1;
       while(i<j){
        if(t.charAt(i) == t.charAt(j)){
            i++;
            j--;
        }
        
            else{
            return false;
        }
       }
       return true;
   
    }
}