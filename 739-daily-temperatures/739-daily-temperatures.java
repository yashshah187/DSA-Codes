class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int ans[]=new int[temperatures.length];
        boolean find=false;
        for(int i=0;i<temperatures.length;i++)
        {
            for(int j=i+1;j<temperatures.length;j++)
            {
                if(temperatures[i]<temperatures[j])
                {
                    ans[i]=j-i;
                    find=true;
                    break;
                }
                
                
            }
            
            if(find==false) 
            ans[i]=0;
                
            find=false;
        }
        
        return ans;
    }
}