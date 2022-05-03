class Solution {
    public int findUnsortedSubarray(int[] nums) {
   
        boolean as=true;
        
        int max=nums[0],min=nums[nums.length-1];
        
        int high=-1,low=0;
        for(int i=0;i<nums.length;i++)
        {
            if(max>nums[i] )
            {
                high=i;
                as=false;
            }
            else
            {
                max=nums[i];
            }
            
        }
        
        for(int i=nums.length-2;i>=0;i--)
        {
            if(min<nums[i])
            {
                low=i;
                as=false;
            }
            else
            {
                min=nums[i];
            }
            
        }
        
        
        if(as==true) return 0;
        else
        return high-low+1;
        
    }
}