class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int temp=arr[0],index=0;
        for(int i=1;i<arr.length;i++)
        {
            if(temp<arr[i])
            {
                temp=arr[i];
                index=i;
                
            }
        }
        
        return index;
    }
}