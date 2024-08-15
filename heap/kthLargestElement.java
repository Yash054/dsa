class KthLargest {
    int K;
    PriorityQueue<Integer> minheap = new PriorityQueue<>();

    public KthLargest(int k, int[] nums) {
        K=k;
        for(int i =0 ; i<nums.length; i++){
            minheap.add(nums[i]);
            if(minheap.size()>k){
                minheap.remove();
            }
        }
    }
    
    public int add(int val) {
        minheap.add(val);
        if(minheap.size()>K)
        minheap.remove();
        return minheap.peek();
    }
}