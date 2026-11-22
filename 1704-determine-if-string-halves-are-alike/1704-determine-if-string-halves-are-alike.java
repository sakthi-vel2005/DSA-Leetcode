class Solution {
    public boolean halvesAreAlike(String s) {
        
    int left = checkVowels(s,0,s.length()/2);
    int right = checkVowels(s,s.length()/2, s.length());

    return left==right ? true : false;
    }

    public static int checkVowels(String s, int start, int end){

    int count =0;
    for(int i=start; i<end; i++){
        char ch = s.charAt(i);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
            ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                count ++;
            }
    }
    return count;
    }
}