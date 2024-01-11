class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int[] leftsml = new int[n]; 
        int[] rightsml = new int[n];
        for(int i=n-1; i>-1; i--)
        {
            while(!st.isEmpty() && heights[st.peek()]>=heights[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            rightsml[i]=n-1;
            else{
                rightsml[i]=st.peek()-1;
            }
            st.push(i);
        }

        while(!st.isEmpty()) st.pop();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if (st.isEmpty()) leftsml[i] = 0;
            else leftsml[i] = st.peek() + 1;
            st.push(i);
        }

        int res = 0;
        for(int i = 0;i<n;i++)
        {
            res=Math.max(res,heights[i] * (rightsml[i] - leftsml[i] + 1));
        }
        return res;
     


    }
}