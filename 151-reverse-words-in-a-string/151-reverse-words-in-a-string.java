class Solution {
    public String reverseWords(String s) {
        Stack<String> stack=new Stack<>();
        String[] temp=s.split(" ");
        
        for(String c:temp)
        {
            if(!c.equals(""))
            {
                stack.push(c);
                System.out.println(stack);
            }
        }
        
        
        
        String ans="";
        
        while(!stack.isEmpty())
        {
            ans+=stack.pop();
            
            if(stack.size()!=0)
            ans+=" ";
        }
        
        return ans;
        
    }
}