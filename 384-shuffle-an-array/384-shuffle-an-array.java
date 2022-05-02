class Solution {
    int[] temp;
    public Solution(int[] nums) {
        temp=nums;
        
    }
    
    public int[] reset() {
        return temp;
    }
    
    public int[] shuffle() {
        int[] arr=new int[temp.length];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=temp[i];
        }
        
       Random rand = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			int randomIndexToSwap = rand.nextInt(arr.length);
			int temp = arr[randomIndexToSwap];
			arr[randomIndexToSwap] = arr[i];
			arr[i] = temp;
		}
        
        return arr;
        
     }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */