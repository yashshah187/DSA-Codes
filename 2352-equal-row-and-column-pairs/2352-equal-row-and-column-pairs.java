class Solution {
    public int equalPairs(int[][] grid) {
        Long temp=0l;
        int count=0;
        Map<Long,Integer> map=new HashMap<>();
        for(int[] y:grid)
        {
            for(int x:y)
            {
                temp=temp*10+x;
            }
            map.put(temp,map.getOrDefault(temp,0)+1);
            temp=0l;
            
        }
        
        System.out.println(map);
        
        for(int c=0;c<grid.length;c++)
        {
            for(int r=0;r<grid.length;r++)
            {
                temp=temp*10+grid[r][c];
                
            }
            
            if(map.containsKey(temp))
            {
                count+=map.get(temp);
            }
            
            temp=0l;
        }
        
        return count;
    }
}