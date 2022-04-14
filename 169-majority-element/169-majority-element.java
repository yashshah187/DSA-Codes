class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new LinkedHashMap<>();
        for(int x:nums)
        {
            if(map.containsKey(x)) map.put(x,map.get(x)+1);
            else map.put(x,1);
        }
        
      Map<Integer, Integer> finalMap = new LinkedHashMap<>();
 
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(entry -> finalMap.put(entry.getKey(), entry.getValue()));
        
        System.out.println(finalMap);
        for(int x:finalMap.keySet()) return x;
        
        return -1;
    }
}