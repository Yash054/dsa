class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length, k = 1, zi = -1;
        if (n == 1)
            return true;
        boolean ans = false;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] == 0) {
                zi = i;
                break;
            }
        }
        if (zi == -1)
            return true;
        else {
            k = 1;
            for (int i = zi - 1; i >= 0; i--, k++) {
                if (k < nums[i])
                    ans = true;
                if (ans == true && nums[i] == 0) {
                    zi = i;
                    ans = false;
                    k = 0;
                }
            }
        }
        return ans;
    }
}