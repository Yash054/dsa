// Frequency Counting:

// Two vectors (freq1 and freq2) are used to count the frequency of each letter in word1 and word2.
// freq1[i] stores the count of the i-th letter in the English alphabet in word1, and similarly for freq2.
// Checking Presence of Characters:

// Iterate over each character in the alphabet.
// If a character is present in one word and not in the other (or vice versa), return false.
// This ensures that both words contain the same set of characters.
// Sorting Frequencies:

// Sort the frequency vectors (freq1 and freq2).
// This step is necessary because the order of frequencies doesn't matter, only their values.
// Comparing Sorted Frequencies:

// Iterate through the sorted frequency vectors and compare corresponding elements.
// If any corresponding elements are not equal, return false.
// Final Result:

// If all the checks pass, return true, indicating that the two words are "close" as per the problem definition.

class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        int[] fr1 = new int[26];
        int[] fr2 = new int[26];

        for(char ch : word1.toCharArray())
        {
            fr1 [ch-'a']++;
        }
        for(char ch : word2.toCharArray())
        {
            fr2 [ch-'a']++;
        }

        for(int i =0; i<26 ; i++)
        {
            if( (fr1[i]==0 && fr2[i]!=0) || (fr1[i]!=0 && fr2[i]==0) )
             return false;

        }
        Arrays.sort(fr1);
        Arrays.sort(fr2);

        for(int i =0; i<26 ; i++)
        {
            if(fr1[i]!=fr2[i])
             return false;
        }

        return true;

    }
}