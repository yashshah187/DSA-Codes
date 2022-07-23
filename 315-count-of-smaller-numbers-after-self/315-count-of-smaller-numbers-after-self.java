class Solution {
    public int binarySearch(List<Integer> temp,int num)
    {
        int start=0,end=temp.size()-1,mid=0;
        while(start<=end)
        {
            mid=start+((end-start)/2);
            
            if(num>temp.get(mid)) start=mid+1;
            else end=mid-1;
        }
        
        if(temp.get(start)==num) return start;
        
        return mid;
        
    }
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> list=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        
        for(int x:nums) temp.add(x);

        Collections.sort(temp);
        
        for(int i=0;i<nums.length;i++)
        {
            int index=binarySearch(temp,nums[i]);
            
            list.add(index);
            temp.remove(index);
        }
        
    
        return list;
    }
}