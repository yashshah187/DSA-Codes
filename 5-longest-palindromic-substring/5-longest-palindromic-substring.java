class Solution {
    int start;
        int end;
    public String longestPalindrome(String s) {
         start = 0;
         end = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((s.length() - i) * 2 < end - start) break;
            getLongestPalindrome(s,i, i);
            getLongestPalindrome(s,i, i+1);
        }
        return s.substring(start, end);
    }
    public void getLongestPalindrome(String s,int left, int right) {
        while (left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        left++;
        if (right - left > end - start) {
            end = right;
            start = left;
        }
    }
}