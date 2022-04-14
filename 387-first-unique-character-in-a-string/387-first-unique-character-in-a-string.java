class Solution {
    public int firstUniqChar(String s) { 
        Set<Character> set=new HashSet<>();
        char c='0';
        for(int i=0;i<s.length();i++)
        {
            if(i==s.lastIndexOf(s.charAt(i)) &&  !set.contains(s.charAt(i)))
            {
                return i;   
            }
                set.add(s.charAt(i));
             
        }
            
        
        return -1;
    }
}