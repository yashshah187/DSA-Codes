class Solution {
    public void solve(String s,List<List<String>> ans, int index,List<String> ds)
    {
        if(index==s.length())
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i=index;i<s.length();i++)
        {
          if(isP(s,index,i))
          {
              ds.add(s.substring(index,i+1));
              solve(s,ans,i+1,ds);
              ds.remove(ds.size()-1);
          }
        }
    }
    
    public boolean isP(String s,int start,int end)
    {
        while(start<=end)
        {
            if(s.charAt(start)!=s.charAt(end)) return false;
            
            start++;
            end--;
        }
        
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> ds=new ArrayList<>();
        
        solve(s,ans,0,ds);
        
        return ans;
    }
}