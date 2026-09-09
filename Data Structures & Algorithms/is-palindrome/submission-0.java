class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder helper = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                helper.append(Character.toLowerCase(c));
            }
        }
        int left = 0;
        int right = helper.length() - 1;
        while(left < right) {
            if(helper.charAt(left) != helper.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
