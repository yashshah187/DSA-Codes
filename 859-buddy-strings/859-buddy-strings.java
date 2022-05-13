class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        
        int prev=-1,curr=-1,count=0;
        
        if(s.equals(goal))
        {
            Set<Character> set=new HashSet<>();
            for(char c:s.toCharArray())set.add(c);
            for(char c:goal.toCharArray())set.add(c);
            
            if(set.size()<s.length()) return true;
            else return false;
        }
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=goal.charAt(i))
            {
                count++;
                if(count>2) return false;
                
                
                prev=curr;
                curr=i;
            }
        }
        
 return (count==2 && s.charAt(prev)==goal.charAt(curr) && goal.charAt(prev)==s.charAt(curr));
    }
}