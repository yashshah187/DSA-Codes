class Solution {
    public int countValidWords(String sentence) {
         String [] s = sentence.trim().split("\\s+");
        int count=0;
        for(String str: s){
            if(str.matches("[a-z]*([a-z]-[a-z])?[a-z]*[!.,]?")) count++;
        }
        return count;
    }
}