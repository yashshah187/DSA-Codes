class Solution {

    final String[] key={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    
    public List<String> fun(String digits,List<String> list,int index,StringBuilder temp)
    {
        if(index==digits.length())
        {
            list.add(temp.toString());
        }
        else
        {
          for(char c:key[(digits.charAt(index))-'0'].toCharArray())
          {

              temp.append(c);
              fun(digits,list,index+1,temp);
              temp.deleteCharAt(temp.length()-1);

           }
        }
        
        return list;

    }
    public List<String> letterCombinations(String digits) {
        
        if(digits.length()==0) 
        return Arrays.asList();
        
        List<String> list=new LinkedList<>();
        
        return fun(digits,list,0,new StringBuilder()); 
        
    }
}