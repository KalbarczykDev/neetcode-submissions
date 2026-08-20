class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            maxHeap.add(stone);
        }

        while(maxHeap.size() > 1){
            int x = maxHeap.poll();
            int y = maxHeap.poll();

            if(x == y){
                continue;
            }

            if(x > y){
                maxHeap.add(x - y);
            } else {
                maxHeap.add(y - x);
            }
        }

        if(maxHeap.size() == 0){
            return 0;
        }

        return maxHeap.peek();
    }
}
