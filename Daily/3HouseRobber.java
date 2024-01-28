// //Intuition
// The problem can be solved by dynamic programming, considering the two scenarios at each house: whether to rob it or not. The goal is to maximize the total amount of money robbed without alerting the police.

// Approach
// Use two variables, rob and norob, to keep track of the maximum amount of money robbed with or without robbing the current house.
// Iterate through each house, and at each step, calculate the maximum amount of money if the current house is robbed (newRob) and if it is not robbed (newNoRob).
// Update rob and norob for the next iteration.
// The final result is the maximum amount between the two scenarios: robbing the last house or not robbing it.
// Complexity
// Time Complexity: O(N), where N is the number of houses.
// Space Complexity: O(1), as we use constant space for variables rob and norob.

class Solution {
    public int rob(int[] nums) {
        int rob = 0;
        int norob = 0;
        for (int i = 0; i < nums.length; i ++) {
            int newRob = norob + nums[i];
            int newNoRob = Math.max(norob, rob);
            rob = newRob;
            norob = newNoRob;
        }
        return Math.max(rob, norob);
    }
}