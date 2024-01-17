  //The easiest way to think about this problem is to ask are the elements with a 0 value avoidable? this is the algorithm that I constructed to answer this question.Starting from the second to last element in the array we continue to decrement towards the start of the array. Only stopping if we hit an element with a value of 0; in this case we evaluate if there exist an element somewhere at the start of the array which has a jump value large enough to jump over this 0 value element.

public class Solution {
    public boolean canJump(int[] nums) {
       if(nums.length < 2) return true;
       
       for(int curr = nums.length-2; curr>=0;curr--){
           if(nums[curr] == 0){
               int neededJumps = 1;
               while(neededJumps > nums[curr]){
                   neededJumps++;
                   curr--;
                   if(curr < 0) return false;
               }
           }
       }
       return true;
    }
}










// 1st - 3ms solution ,  2nd is 2ms solution

// class Solution {
//     public boolean canJump(int[] nums) {
//      int reachable = 0;
//     for (int i=0; i<nums.length; ++i) {
//         if (i > reachable) return false;
//         reachable = reachable>i+nums[i]?reachable:i + nums[i];
//     }
//     return true;
//     }
// }



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