class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       int existingGas = 0, requiredGas = 0;
        for(int i:gas)
            existingGas+=i;
         for(int i:cost)
            requiredGas+=i;
        if(existingGas<requiredGas)
            return -1;
        
        int start = 0;
        int current =0;
        for(int i =0;i<gas.length;i++){
            current+=(gas[i]-cost[i]);
            if(current<0){
                current =0;
                start =i+1;
            }
        }
        
        return start;
    }
}