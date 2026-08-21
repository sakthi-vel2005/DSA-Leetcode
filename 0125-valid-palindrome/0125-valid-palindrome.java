class Solution {
    public boolean isPalindrome(String s) {


        s = s.toLowerCase();
        int i = 0, j = s.length() - 1;
        while (i < j) {

            if (Character.isLetterOrDigit(s.charAt(i)) == false) {
                i++;
            }
            else if (Character.isLetterOrDigit(s.charAt(j)) == false) {
                j--;
            } else if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }

        }
        return true;
    }
}