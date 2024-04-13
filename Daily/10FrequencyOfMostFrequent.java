//concept used sliding window , two pointer
// Input: nums = [1,2,4], k = 5
// Output: 3
// Explanation: Increment the first element three times and the second element two times to make nums = [4,4,4].
// 4 has a frequency of 3.

class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        //use sliding window approach using two pointer 
        int rit = 0; // rit pointer
        int lft = 0; // left pointer 
        long total=0; // to sum the net elements 
        //long res=0;

        while(rit<nums.length)
        {
            total +=nums[rit];
            if(nums[rit]*(rit-lft+1L)>total+k)/// suop condition   #######
            {
                total-=nums[lft];             // decrease total if aukat ke bahar
                lft++;                  //inc left
            }
           // res=Math.max(res,rit-lft+1L);
            rit++;
        }
        return nums.length-lft;
    }
}