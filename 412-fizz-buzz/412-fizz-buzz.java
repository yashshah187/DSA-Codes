class Solution {
    public List<String> fizzBuzz(int n) {
        int i=1;
        List<String> list=new ArrayList<>();
        
        while(i<n+1)
        {
            if(i%3==0 && i%5==0) list.add("FizzBuzz");
            else if(i%3==0) list.add("Fizz");
            else if(i%5==0) list.add("Buzz");
            else list.add(String.valueOf(i));
            i++;
        }
        
        return list;
    }
}