

// This can be solved using maxheap but , this is the optimal approach and we use sliding window and binary search appraoch


class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int low = 0;
        int high = nums[n-1]-nums[0];
        // int ans=0;    

        
    
        
        while(low<high){
            int mid = low + (high-low)/2;
            int count=0;
            int i =0;
            
            int j=1;
            while(j<n){
                
              //  if(nums[j]-nums[i]>mid) {
                while(nums[j]-nums[i]>mid)
                    i++;
                 //   if(i==j)
                   // j++;
               // }
               // else if(nums[j]-nums[i]<mid){
                    count+=(j-i);
                    j++;
              //  }
            }
                
                
            
            // ans = mid;

            if(count<k)
                low=mid+1;
            else 
                high=mid;
            }

        

        
        
        
        return low;
        
        
        
        
        
        //  1 4 5 5 5 9 

    }
}