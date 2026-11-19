class Solution {
    public String truncateSentence(String s, int k) {
        
        int count=0;
        int start =0;

        StringBuilder t = new StringBuilder(s);

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                count++;
                if(count==k){
                    t.delete(i,s.length());
                }
            }
        }
        return t.toString();

    }
}