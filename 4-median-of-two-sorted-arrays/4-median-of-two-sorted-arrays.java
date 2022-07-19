class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] temp=new int[nums1.length+nums2.length];
        int i=0;
        for(int x:nums1) temp[i++]=x;
        for(int x:nums2) temp[i++]=x;
        Arrays.sort(temp);
        
        if(temp.length%2!=0)
        return temp[temp.length/2];
        else 
        {
            return (temp[temp.length/2]+temp[(temp.length/2)-1])/2.0;
        }
    }
}