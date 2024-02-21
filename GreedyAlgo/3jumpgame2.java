public class 3jumpgame {
    public int jump(int[] nums) {
        //     int max = 0;
        //     int n=nums.length;
        //     int fuel=nums[0];
        //     int leftfuel=0;
        //     if(n==1) return 0;
        //     if(n<=2 && fuel!=0) {if(n==1)return 0; return 1 ;}
        //     int jumps=0;
            
        //     for(int i=0;i<n;i++){
        //         //if(i==n-1)break;
        //         //if(i+nums[i]>=n-1) break;
                
        //         if(nums[i]>fuel)
        //         {
        //             if(leftfuel>0)
        //              jumps--;
                    
        //             jumps++;
        //             if(leftfuel==0)
        //             leftfuel=fuel;
                    
        //             fuel=nums[i];
        //         }
                
        //         System.out.println(fuel+" "+jumps+" "+i);
        //         if(i+nums[i]>=n-1){ jumps++; break;}
        //         fuel--;
        //         leftfuel--;
    
                
        //     }
        //     return jumps;
        // }
    
        int jump = 0;
        int end = 0;
        int fuel = 0;
        for (int i = 0; i < nums.length - 1; ++i) {
          fuel = Math.max(fuel, i + nums[i]);
          if (fuel >= nums.length - 1) {
            ++jump;
            break;
          }
          if (i == end) {   
            ++jump;          
            end = fuel;
          }
        }
    
        return jump;
      }
}
