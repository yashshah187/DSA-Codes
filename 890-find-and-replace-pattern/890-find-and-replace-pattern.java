class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
         List<String> ans=new ArrayList<>();
        
         Set<Character> set=new HashSet<>();
         for(char c:pattern.toCharArray())
         {
             set.add(c);
         }
        
         int n=pattern.length();
         boolean check=false;
         for(String x:words)
         {
           
            HashMap<Character,Character> map=new HashMap<>();
            for(int i=0;i<n;i++)
            {
                if(map.containsKey(x.charAt(i)) && map.get(x.charAt(i))!=pattern.charAt(i))
                {
                     check=true;
                     break;
                }
                else
                map.put(x.charAt(i),pattern.charAt(i));
                
            }
            
            if(check==false && map.size()==set.size())
            {
                ans.add(x);
            }
            else
            check=false;
         }
        
        
         return ans;
        
        
    }
}