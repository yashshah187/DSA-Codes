/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
  
        return binary(0,n);
    
      
    }
    
    public int binary(int l,int r)
    {
      int mid= l+(r-l)/2;
      if(guess(mid)==-1)
      {
          if(l<=mid-1)
          return binary(l,mid-1);
        else
            return -1;
      }
        else if(guess(mid)==1)
        {
            if(mid+1<=r)
            return binary(mid+1,r);
            else
            return -1;
        }
       else
           return mid;
    }
}