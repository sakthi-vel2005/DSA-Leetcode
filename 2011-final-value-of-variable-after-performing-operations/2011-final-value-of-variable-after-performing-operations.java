class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        int X =0;

        for(String n : operations){
            if(n.equals("--X") || n.equals("X--")){
                X = X-1;
            }else if(n.equals("++X") || n.equals("X++")){
                X = X+1;
            }
        }
        return X;
    }
}