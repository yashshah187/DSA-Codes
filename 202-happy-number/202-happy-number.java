class Solution {
    public boolean isHappy(int n) {
        while(true)
        {
           int ans=0;
           
            while(n>0)
            {
                ans+=(int)Math.pow(n%10,2);
                n/=10;
            }
            n=ans;
            
            if((n==1 || n==7) && n<10) return true;
            else if((n!=1 || n!=7) && n<10) return false;
            
        }
        
        
    }
}