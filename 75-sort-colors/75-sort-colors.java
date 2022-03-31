class Solution {
    public void sortColors(int[] nums) {
    Map<Integer,Integer> map=new HashMap<>();
    for(int x:nums)
    {
        if(map.containsKey(x)) map.put(x,map.get(x)+1);
        else map.put(x,1);
     }
 
        int i=0,indx=0;
        for(Map.Entry<Integer,Integer> val:map.entrySet())
        {
            while(i<val.getValue())
            {
                nums[indx++]=val.getKey();
                i++;
            }
            i=0;
        }
    
        
    }
}