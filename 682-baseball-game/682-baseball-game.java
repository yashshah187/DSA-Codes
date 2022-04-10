class Solution {
    public int calPoints(String[] ops) {
        List<Integer> list=new ArrayList<>();
        for(String s:ops)
        {
            switch(s)
            {
                case "C":list.remove(list.size()-1);
                         break;
                case "D":list.add(list.get(list.size()-1)*2);
                         break;
                case "+":list.add(list.get(list.size()-1)+list.get(list.size()-2));
                         break;
                default: list.add(Integer.parseInt(s));
                         break;
            }
           
            
            
            
            }
    
    int ans=0;
    for(int x:list)
    {
        ans+=x;
    }
        
        return ans;
    }
}