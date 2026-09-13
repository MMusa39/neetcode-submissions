class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right) {
            boolean proceed = true;
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if(!Character.isLetterOrDigit(leftChar)) {
                left++;
                proceed = false;
            }
            if(!Character.isLetterOrDigit(rightChar)) {
                right--;
                proceed = false;
            }
            if(!proceed) {
                continue;
            }
            if(Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
