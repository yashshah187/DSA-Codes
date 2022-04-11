class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int p = 0;
        
        while (p < s.length() && s.charAt(p) == ' ') {
            p++;
        }
        
        int sign = 1;
        
        if (p < s.length()) {
            if (s.charAt(p) == '+') {
                p++;
            } else if (s.charAt(p) == '-') {
                sign = -1;
                p++;
            }
        }
        
        int num = 0;
        
        while (p < s.length() && Character.isDigit(s.charAt(p))) {
            int temp = s.charAt(p) - '0';
            
            if (num > Integer.MAX_VALUE / 10 || num == Integer.MAX_VALUE / 10 &&  temp > Integer.MAX_VALUE % 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            num = num * 10 + temp;
            p++;
        }
        
        return sign * num;
    }
}