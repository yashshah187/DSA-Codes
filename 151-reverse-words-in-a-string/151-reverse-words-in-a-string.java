class Solution {
    public String reverseWords(String s) {
        Stack<String> stack=new Stack<>();
        String temp="";
        for(char c:s.toCharArray())
        {
            if(c!=' ')
            {
              temp+=c;
            }

            if(c==' ')
            {
                if(temp!="")
                {
                    stack.push(temp);
                    temp="";
                }
                
            }
        }
        
      if(temp!="")
      {
           stack.push(temp);
           temp="";
        }
        
        while(!stack.isEmpty())
        {
            temp+=stack.pop();
            
            if(stack.size()!=0)
            temp+=" ";
        }
        
        return temp;
    }
}