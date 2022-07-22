class Solution {
    public boolean isSubsequence(String s, String t) {
        int index=0;
        for(char c:t.toCharArray())
        {
            if(index<s.length() && c==s.charAt(index))
                index++;
        }
        
        return index==s.length();
    }
}