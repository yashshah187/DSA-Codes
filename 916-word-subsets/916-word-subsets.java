class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        
        List<String> list=new ArrayList<>();
        Map<Character,Integer> map=new HashMap<>();
        
        
       for(int i=0;i<words2.length;i++)
    {
        HashMap<Character,Integer> map1= new HashMap<>();
        
        for(int j=0;j<words2[i].length();j++)
        {
            char c= words2[i].charAt(j);
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for(Character c: map1.keySet())
        {
            if(map.containsKey(c))
            {
                int x= Math.max(map1.get(c),map.get(c));
                map.put(c,x);
            }
            else
                map.put(c,map1.get(c));
        }
    }
        
        
        for(String s:words1)
        {
             Map<Character,Integer> temp=new HashMap<>(map);
             
            for(char c:s.toCharArray()) 
            {
                if(temp.containsKey(c)) 
                {
                    if(temp.get(c)>0)
                        temp.put(c,temp.getOrDefault(c,0)-1);
                    
                    if(temp.get(c)==0)
                        temp.remove(c);
                }
            }
            
            if(temp.size()==0) list.add(s);
            
        }
        
        return list;
        
    }
}