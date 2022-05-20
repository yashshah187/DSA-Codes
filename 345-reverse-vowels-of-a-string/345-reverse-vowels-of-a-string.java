class Solution {
    public String reverseVowels(String s) {
      int i = 0, j = s.length()-1;
        char[] string = s.toCharArray();
        while(i < j) {
            while(i < j && !isVowel(string[i])) {
                i++;
            }
            while(i < j && !isVowel(string[j])) {
                j--;
            }
            char swap = string[i];
            string[i] = string[j];
            string[j] = swap;
            i++;
            j--;
        }
        return new String(string);
    }
    
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}