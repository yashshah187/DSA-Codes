class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list=new ArrayList<>();
        
        if(0==rowIndex)
        {
            list.add(1);
            return list;
        }
        else if(1==rowIndex)
        {
            list.add(1);
            list.add(1);
            return list;
        }
       
        list.add(1);
        list.add(rowIndex);
        
        for(int i=2;i<rowIndex/2+1;i++)
        {
            double value=(double)(rowIndex-i+1)/(double)(i);
            
            list.add((int)Math.round(((double)list.get(i-1)*value)));

        }
        
        if(rowIndex%2==0)
        {
            int right=list.size()-2;
            while(right>=0)
            {
                list.add(list.get(right));
                right--;
            }
        }
        else
        {
            int right=list.size()-1;
            while(right>=0)
            {
                list.add(list.get(right));
                right--;
            }
        }
        
        
        return list;
        
    }
}