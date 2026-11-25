class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        StringBuilder s1 = new StringBuilder(s);
        StringBuilder t1 = new StringBuilder(t);

        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)=='#'){
               if(i>0){
                 s1.deleteCharAt(i);
                s1.deleteCharAt(i-1);
                i -=2;
               }else{
                 s1.deleteCharAt(i);
                 i--;
               }
            }
        }
        for(int i=0; i<t1.length(); i++){
            if(t1.charAt(i)=='#'){
               if(i>0){
                 t1.deleteCharAt(i);
                t1.deleteCharAt(i-1);
                i -=2;
               }else{
                 t1.deleteCharAt(i);
                 i--;
               }
            }
        }
        String ans1 = s1.toString();
        String ans2 = t1.toString();

        return ans1.equals(ans2);
    }
}