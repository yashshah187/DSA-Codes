class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String temp="";
        for(char c:s.toCharArray())
        {
            if((c>=97 && c<=122) ||  (c>=48 && c<=57 )) temp+=c;
        }
        int low=0,high=temp.length()-1;
        System.out.println(temp);
          while(low<=high)
          {
              if(temp.charAt(low)!=temp.charAt(high)) return false;
              low++;
              high--;
              
          }
        
        return true;
    }
}