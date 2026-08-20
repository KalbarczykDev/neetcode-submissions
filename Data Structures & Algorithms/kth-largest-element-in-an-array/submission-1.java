class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int smallest = 1000;
        for (int num : nums) {
            maxHeap.offer(num);
        }

        for (int i = 0; i < k; i++) {
            smallest = maxHeap.poll();
        }

        return smallest;
    }
}
