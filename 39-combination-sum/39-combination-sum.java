class Solution {
    
      public List<List<Integer>> fun(int index,int[] candidates, int target,List<List<Integer>> list,List<Integer> temp) 
      {
          if(index==candidates.length)
          {
              if(target==0)
              {
                  list.add(new ArrayList<>(temp));
              }
          }
          else
          {     
              if(candidates[index]<=target)
              {
                 temp.add(candidates[index]);
                 fun(index,candidates,target-candidates[index],list,temp);
                  temp.remove(temp.size()-1);
              }

             fun(index+1,candidates,target,list,temp);

          }
         
          
          return list;

      }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        return fun(0,candidates,target,new ArrayList<>(),new ArrayList<>());
    }
}