class Solution {
    public boolean isPowerOfTwo(int n) {
        int k=0;
        while(Math.pow(2,k)<=n)
        {
            if(Math.pow(2,k)==n)
                return true;
            k++;
        }
        return false;
    }
}