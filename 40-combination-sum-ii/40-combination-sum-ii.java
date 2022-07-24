class Solution {
    
    public List<List<Integer>> fun(int index,int[] candidates,int target,List<List<Integer>> list,List<Integer> temp) 
      {
         
            if(target==0)
            {
                list.add(new ArrayList<>(temp));
            }

            
            for(int i=index;i<candidates.length;i++)
              {
                  if(i>index && candidates[i]==candidates[i-1]) continue;
                
                   if(candidates[i]>target) break;
                
                    temp.add(candidates[i]);
                    fun(i+1,candidates,target-candidates[i],list,temp);
                    temp.remove(temp.size()-1);
            
              }
         
          return list;

      }
    
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        return fun(0,candidates,target,new ArrayList<>(),new ArrayList<>());
    }
}