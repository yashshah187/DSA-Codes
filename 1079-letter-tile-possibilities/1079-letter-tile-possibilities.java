class Solution {
    private int count=0;
    
    public void func(Map<Character,Integer> map)
    {
       count++;
        for(Map.Entry<Character,Integer> val:map.entrySet())
        {
            if(val.getValue()>0)
            {
                char c=val.getKey();
                int v=val.getValue();
                
                map.put(c,v-1);
                func(map);
                map.put(c,v);
            }
        }

    }
    public int numTilePossibilities(String tiles) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:tiles.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        func(map);
        return count-1;
    }
}