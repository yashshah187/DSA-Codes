class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int total=0,sum=0,addIndex=0,deleteIndex=0;
       
        while(addIndex < nums.length)
        {
            int curr=nums[addIndex];
            
            while(set.contains(curr))
            {
                set.remove(nums[deleteIndex]);
                sum-=nums[deleteIndex];
                deleteIndex++;
            }
            
            sum+=curr;
            set.add(curr);
            total=Math.max(total,sum);
            addIndex++;
        }
       
        return total;
    }
}