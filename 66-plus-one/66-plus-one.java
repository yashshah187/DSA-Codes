class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--)
        {
           if(digits[i]+1==10)
           {
               digits[i]=0;
           }
            else
            {
                digits[i]+=1;
                return digits;
            }
        }
        int temp[]=new int[digits.length+1];
        temp[0]=1;
        return temp;
    }
}