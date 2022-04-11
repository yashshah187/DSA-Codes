class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                list.add(grid[i][j]);
            }
        }
        
        Collections.rotate(list,k);
        int a=0;
        
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                grid[i][j]=list.get(a);
                a++;
            }
        }
        
        return (List)Arrays.asList(grid);
        
    }
}