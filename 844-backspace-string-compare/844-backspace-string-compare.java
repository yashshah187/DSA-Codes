class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        int size=0;
       for(int i=0;i<s.length();i++)
       {
        
           if(s.charAt(i)=='#' && size!=0)
           {
               sb1.delete(size-1,size);
               size-=2;
           }
           else if(s.charAt(i)=='#' && size==0) continue;
           else
           sb1.insert(size,s.charAt(i)); 
           size++;
       }
        
        size=0;
        
        for(int i=0;i<t.length();i++)
       {
            if(t.charAt(i)=='#' && size!=0)
           {
               sb2.delete(size-1,size);
               size-=2;
           }
           else if(t.charAt(i)=='#' && size==0) continue;
           else
           sb2.insert(size,t.charAt(i)); 
           size++;
        }
        
        System.out.println(sb1.toString() +" "+sb2.toString());
        
        return (sb1.toString()).equals(sb2.toString());
        
    }
}