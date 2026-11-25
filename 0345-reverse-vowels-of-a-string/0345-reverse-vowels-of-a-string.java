class Solution {
    public String reverseVowels(String s) {
        
       char[] word = s.toCharArray();
        int i=0, j=s.length()-1;
        

       
       while(i<j){

        if(!(word[i] =='a' || word[i]=='e' || word[i] == 'i' || word[i] =='o' || word[i]=='u' ||
            word[i]=='A' || word[i]=='E' || word[i] =='I' || word[i] =='O' || word[i]=='U')){
                i++;
            }
        else if(!(word[j] =='a' || word[j]=='e' || word[j] == 'i' || word[j] =='o' || word[j]=='u' ||
            word[j]=='A' || word[j]=='E' || word[j] =='I' || word[j] =='O' || word[j]=='U')){
                j--;
            }
        else if(word[i] =='a' || word[i]=='e' || word[i] == 'i' || word[i] =='o' || word[i]=='u' ||
            word[i]=='A' || word[i]=='E' || word[i] =='I' || word[i] =='O' || word[i]=='U' &&
           word[j] =='a' || word[j]=='e' || word[j] == 'i' || word[j] =='o' || word[j]=='u' ||
            word[j]=='A' || word[j]=='E' || word[j] =='I' || word[j] =='O' || word[j]=='U'  ){
                char temp = word[i];
                word[i] = word[j];
                word[j] = temp;
                i++;
                j--;
            }

       }

       String ans = new String(word);
       return ans;
    }
}