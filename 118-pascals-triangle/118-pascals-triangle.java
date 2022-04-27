class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> list=new ArrayList<>();
        if(numRows==0) return list;
    
         
       int i=0;
        if(1<=numRows)
        {
        list.add(new ArrayList<Integer>());
        list.get(i).add(1);
        }
        i++;
        if(2<=numRows)
        {
        list.add(new ArrayList<Integer>());
        list.get(i).add(1);
        list.get(i).add(1);
        }
        else
        {
            return list;
        }
        i++;
        while(i<numRows)
        {
            list.add(new ArrayList<Integer>());
            int j=0;
            list.get(i).add(list.get(i-1).get(j));
            for(j=1;j<list.get(i-1).size();j++)
            {
                list.get(i).add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
            }
            list.get(i).add(list.get(i-1).get(list.get(i-1).size()-1));
            i++;
            
        }
        
        return list;
    }
}