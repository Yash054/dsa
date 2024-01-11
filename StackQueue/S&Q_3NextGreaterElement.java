class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    //    Map <Integer,Integer> Mp= new HashMap<>();
    //    Stack<Integer> st = new Stack<Integer>();
    //    for(int num = nums2.length-1;num>-1; num--){
    //         while (st.isEmpty() == false && st.peek() <= nums2[num]) {
    //             st.pop();
    //         }
    //        if(st.isEmpty() == false && st.peek()>nums2[num] )
    //        {
    //            Mp.put(nums2[num],st.peek());
    //        }
    //        st.push(nums2[num]);

    //    }
    //    int[] res =new int[nums1.length];    
    //    for(int i = 0;i<nums1.length;i++ )
    //    {
    //        res[i]=Mp.getOrDefault(nums1[i],-1);
    //    }
    //    return res;
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                nextGreaterMap.put(stack.pop(), num);
            }
            stack.push(num);
        }

        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreaterMap.getOrDefault(nums1[i], -1);
        }

        return result;
    }
}