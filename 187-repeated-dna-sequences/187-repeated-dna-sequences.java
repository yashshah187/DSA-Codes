class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
     HashMap<String,Integer> map=new HashMap<>();
     if(s.length()<10) return new ArrayList<>();
        
      List<String> list=new ArrayList<>();
        
        
     
        StringBuilder sb=new StringBuilder();
        sb.append(s.substring(0,10));
        map.put(sb.toString(),map.getOrDefault(sb.toString(),0)+1);
        
     for(int i=10;i<s.length();i++)
     {    
            sb.deleteCharAt(0);
            sb.append(String.valueOf(s.charAt(i))); 
         
            map.put(sb.toString(),map.getOrDefault(sb.toString(),0)+1);
            if(map.get(sb.toString())==2) list.add(sb.toString());
     }
        
         
        return list;
        
    }
}