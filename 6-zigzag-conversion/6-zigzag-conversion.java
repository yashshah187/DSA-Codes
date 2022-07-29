class Solution {
    public String convert(String s, int numRows) {
        
        if(numRows==1) return s;
        
        List<List<Character>> list=new ArrayList<>();
        
        int sRow=0,eRow=numRows-2;
        boolean first=false;
        
        for(char c:s.toCharArray())
        {
            
        if(sRow<numRows)
        {
                if(first==false)
                {
                List<Character> t=new ArrayList<>();
                t.add(c);
                list.add(new ArrayList<>(t));
                }
                else
                {
                    list.get(sRow).add(c);
                }
            
                sRow++;
                
                  if(sRow>=numRows)
                 {
                  first=true;
                  eRow=numRows-2;
                 
                  }
                
             }
            else if(eRow>=1)
            {
                list.get(eRow).add(c);
                eRow--;
            }
            else
            {
                list.get(0).add(c);
                sRow=1;
            }
                
        }
        
 
        s="";
        for(List<Character> y:list)
        {
            for(char x:y)
            {
                s+=x;
            }
        }
        
        return s;
    }
}