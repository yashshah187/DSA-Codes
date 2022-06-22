class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = s.length();
        String st = "";
    
        for (int i = n - 2; i >= 0; i--) {
            shifts[i] = (shifts[i] + shifts[i + 1])%26;
        }

        for(int i=0;i<n;i++)
        {
            st += (char) (((int) s.charAt(i) + shifts[i] - 97) % 26 + 97);

        }

       return st;
    }
}