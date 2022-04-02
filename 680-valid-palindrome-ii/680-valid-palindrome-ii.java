class Solution {
    
    public boolean isPalindrome(String s,int left,int right)
    {
        int len = s.length();
        if (left >= len || right < 0 || left > right) {
            return false;
        }

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
    public boolean validPalindrome(String s) {
        int len = s.length();
        if (len <= 2) {
            return true;
        }

        int left = 0,right = len - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            } else {
                left++;
                right--;
            }
        }

        return true;
    }
}