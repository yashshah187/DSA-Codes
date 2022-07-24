class Solution {
   
        
    public List<List<Integer>> threeSum(int[] nums) { 
        
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        
        if(nums.length<3 || nums[0]>0 ||nums[nums.length-1]<0) return list;
        
        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue; // imp to skip repeated result
            
            int left=i+1,right=nums.length-1;
            
            
            while(left<right)
            {
                int sum=nums[left]+nums[right]+nums[i];
                if(sum==0)
                {
                    list.add(Arrays.asList(nums[left],nums[right],nums[i]));
                
                
                while(left<right && nums[left]==nums[left+1]) left++;  // imp to skip repeated result
                while(left<right && nums[right]==nums[right-1])right--; // imp to skip repeated result
                
                left++;
                right--;
               }
                else if(sum>0) right--;
                else left++;
            
                
            }
        }
        
        return list;
    }
}