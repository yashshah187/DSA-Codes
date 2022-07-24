class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs.length==0) return Arrays.asList();
        
        Map<String,List<String>> map=new HashMap<>();
        
        for(String s:strs)
        {
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String temp=new String(c);
            
            if(!map.containsKey(temp))
            {
                map.put(temp,new ArrayList<>());
                map.get(temp).add(s);
            }
            else
            {
                map.get(temp).add(s);
            }
        }
        
        List<List<String>> list=new ArrayList<>();
        
        for(List<String> x:map.values())
        {
            list.add(x);
        }
        
        return list;
    }
}