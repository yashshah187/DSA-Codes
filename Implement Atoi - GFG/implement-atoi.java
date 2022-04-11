// { Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			System.out.println(obj.atoi(str));
		t--;
		}
	}
}// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String str) {
	 int num=0;
        boolean numStart=false,sig=false;
        for(char c:str.toCharArray())
        {
            if(c=='-' && numStart==false)
            {
                sig=true;
                numStart=true;
                continue;
            }
            
            if(c>=48 && c<=57)
            {
                num=num*10+(c-'0');
            }
            else if(sig==true && c=='-' && c<48 || c>57)
            {
                return -1;
            }
            else if(c!='-' && c<48 || c>57)
            {
                return -1;
            }
    
        }
        
        if(sig==true && -num < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        else if(sig==true && -num > Integer.MIN_VALUE) return -num;
        else if(sig==false && num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
         else return num;
    }
}
