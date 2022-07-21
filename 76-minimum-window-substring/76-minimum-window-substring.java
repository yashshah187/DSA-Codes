class Solution {
    public String minWindow(String s, String t) {
         int left=0,right=0;
        
         int[] freq1=new int[128];
         int[] freq2=new int[128];
        
        for(char c:t.toCharArray())
        {
            freq1[c]++;
        }
        
        int count=0;
        int length=s.length()+1;
        String result="";
        
        while(right<s.length())
        {
            freq2[s.charAt(right)]++;
            
            if(freq1[s.charAt(right)]!=0 && freq2[s.charAt(right)]<=freq1[s.charAt(right)])
                count++;
            
            if(count==t.length())
            {
                while(freq2[s.charAt(left)]>freq1[s.charAt(left)] || freq1[s.charAt(left)]==0)
                {
                    if(freq2[s.charAt(left)]>freq1[s.charAt(left)])
                    freq2[s.charAt(left)]--;
                    
                    left++;
                }
                
                if((right-left+1)<length)
                {
                    length=right-left+1;
                    result=s.substring(left,right+1);
                }
                
            }
            
            right++;
        }
        
        return result;
        
    }
}