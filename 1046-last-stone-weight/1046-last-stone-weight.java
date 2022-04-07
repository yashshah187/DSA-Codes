class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> p=new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int x:stones) p.add(x);
        while(p.size()>1)
        {
            int f=p.poll();
            int s=p.poll();
            System.out.println(f+" "+s);
            p.add(Math.abs(f-s));
        }
        
        return p.poll();
        
    }
}