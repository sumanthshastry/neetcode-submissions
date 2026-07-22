class Solution {
    public boolean isPalindrome(String s) {
        
        if (s == null || s.length() == 0) {
            return false;
        }

        int len=s.length(), i=0, j=len-1;
        s = s.toLowerCase();
        while (i<=j) {
            // System.out.println(s.charAt(i) + ","+ Character.isLetterOrDigit(s.charAt(i)));
            // System.out.println(s.charAt(j) + ","+ Character.isLetterOrDigit(s.charAt(j)));
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            } 
            else if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            else if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }

        return true;
    }
}
