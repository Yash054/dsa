class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque <Integer>  dq = new ArrayDeque<>();
        int[] res = new int[n-k+1];
        int cn = 0;

        for(int i=0;i<n;i++)
        {
            if(dq.isEmpty()==false && dq.peek()==i-k)
              dq.poll();
             
            while(dq.isEmpty()==false && nums[dq.peekLast()]<nums[i] )
              dq.pollLast();
            dq.offer(i);
            if( i>=k-1)
             res[cn++]=nums[dq.peek()];
            
        }  
        return res;

    }
}