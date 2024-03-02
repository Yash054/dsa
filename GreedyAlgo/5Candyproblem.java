public class 5Candyproblem {


    //initialise the array with initial 1 candy to each , as per the condition 
    // aproach follows the algo in which we first traverse from the left to right 
    //during the traversal we checks for the ascending oreder in the array (this time we use the max function to not disturb the values initially set up by the 1st traversal)
    // return result;
        public int candy(int[] ratings) {
            int n = ratings.length;
            int[] candies = new int[n];
            Arrays.fill(candies, 1);
    
            for (int i = 1; i < n; i++) {
                if (ratings[i] > ratings[i - 1]) {
                    candies[i] = candies[i - 1] + 1;
                }
            }
    
            for (int i = n - 2; i >= 0; i--) {
                if (ratings[i] > ratings[i + 1]) {
                    candies[i] = Math.max(candies[i], candies[i + 1] + 1);
                }
            }
    
            int totalCandies = 0;
            for (int candy : candies) {
                totalCandies += candy;
            }
    
            return totalCandies;
        }
    }

