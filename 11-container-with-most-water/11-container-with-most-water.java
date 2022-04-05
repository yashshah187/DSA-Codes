class Solution {
    public int maxArea(int[] height) {
        int start=0,end=height.length-1,ans=0;
        while(start<end)
        {
            ans=Math.max(ans,Math.min(height[start],height[end])*(end-start));
            if(height[start]<height[end])
                start++;
            else
                end--;
         }
        
        return ans;
    }
}