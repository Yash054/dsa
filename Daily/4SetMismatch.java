// Example 1:

// Input: nums = [1,2,2,4]
// Output: [2,3]
// Example 2:

// Input: nums = [1,1]
// Output: [1,2]


public int[] findErrorNums(int[] nums) {
    int n = nums.length;
    int xorAll = 0;
    int xorArray = 0;

    for (int i = 1; i <= n; i++) {
        xorAll ^= i;
    }

    for (int num : nums) {
        xorArray ^= num;
    }
    
    //take xor of all n numbers and array ex numbers are 3(twice) and 7(notpresent)so it will store 4 xor of both the numbers  


    int xorResult = xorArray ^ xorAll;

    int rightmostSetBit = xorResult & -xorResult;  //gives right most set bit of xor of both ... remember xor gives the difference so here it gives the right most diff between the number ,it does by operation & between number and its 2's compliment , here in this case it remains 4 

    int xorSet = 0;
    int xorNotSet = 0;

    // now we can separate numbers in two groups where each of the number is in one of the two new arrays , because of the right most diff which we found
    // perform xor again to get the two numbers

    //dont reverse the order of below two for loops 
    for (int i = 1; i <= n; i++) {
        if ((i & rightmostSetBit) != 0) {
            xorSet ^= i;
        } else {
            xorNotSet ^= i;
        }
    }

    for (int num : nums) {
        if ((num & rightmostSetBit) != 0) {
            xorSet ^= num;
        } else {
            xorNotSet ^= num;
        }
    }


    // this loop is to return the ans in form [no.duplicate, no.missing]    
    for (int num : nums) {
        if (num == xorSet) {
            return new int[]{xorSet, xorNotSet};
        }
    }

    return new int[]{xorNotSet, xorSet};
}