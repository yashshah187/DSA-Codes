class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                list.add(grid[i][j]);
            }
        }
        
        Collections.rotate(list,k);
        int a=0;
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                grid[i][j]=list.get(a);
                a++;
            }
        }
        
        return (List)Arrays.asList(grid);
        
    }
}