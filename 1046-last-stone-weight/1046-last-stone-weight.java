class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> p=new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int x:stones) p.add(x);
        while(p.size()>1)
        {
            p.add(Math.abs(p.poll()-p.poll()));
        }
        
        return p.poll();
        
    }
}