class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=1;
        Set<Integer> set=new HashSet<>();
        boolean val=true;
        for(int x:nums) set.add(x);
        while(val==true)
        {
            if(!set.contains(i)) return i;
            else
            {
                i++;
            }
        }
        
        return 0;
    }
}