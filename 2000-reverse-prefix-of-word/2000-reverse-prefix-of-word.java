class Solution {
    public String reversePrefix(String word, char ch) {
      
      
      int end =0;
     for(int i=0; i<word.length(); i++){
        char x = word.charAt(i);
        if(ch==x){
        end =i;
        break;
        }
     }

    String reverse=  word.substring(0,end+1);
    String remain = word.substring(end+1, word.length());
    StringBuilder t = new StringBuilder(reverse);
    t.reverse();
    t.append(remain);

    return t.toString();


    }
}