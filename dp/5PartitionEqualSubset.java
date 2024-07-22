class Solution {
    int dp[][];
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum =0;
        for(int num : nums){
            sum+=num;
        }
        if(sum%2==1) return false ;
        sum/=2;
        dp = new int[n][sum+1];

        for(int row[] : dp )
        {
            Arrays.fill(row,-1);
        }

        return calc(n-1,sum , nums);
    }

    boolean calc(int i , int target , int[] nums){

        if(target==0) return  true;
        if(i==0 ) return target==nums[0];

        if(dp[i][target]!=-1) return dp[i][target]==1;

        boolean nottake = calc(i-1,target,nums);
        boolean take = false;

        if(target>=nums[i]){
            take = calc(i-1,target-nums[i],nums);
        } 
        dp[i][target] = take || nottake?1:0;
        return take || nottake;

    }
}