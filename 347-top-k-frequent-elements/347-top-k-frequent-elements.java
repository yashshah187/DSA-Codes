class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int x:nums)
        {
            if(map.containsKey(x)) map.put(x,map.get(x)+1);
            else map.put(x,1);
        }
       
    LinkedHashMap<Integer, Integer> reverseSortedMap = new LinkedHashMap<>();
 
map.entrySet()
  .stream()
  .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) 
  .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
        
        
        int[] ans=new int[k];
        int i=0;
        for(int x:reverseSortedMap.keySet())
        {
            ans[i++]=x;
            
            if(i==k) break;
        }
        return ans;
    }
}