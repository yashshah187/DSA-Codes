class Solution {
    public int mirrorReflection(int p, int q) {
        int h=q;
        boolean left=false;
        
        while(h%p!=0)
        {
            h+=q;
            left=!left;
        }
        
        if(left==true)
            return 2;
    
        
        return (h/p)%2;
        
    }
}