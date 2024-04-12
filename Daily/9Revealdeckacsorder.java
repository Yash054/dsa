// Input: deck = [17,13,11,2,3,5,7]
// Output: [2,13,3,11,5,17,7]
// Explanation: 
// We get the deck in the order [17,13,11,2,3,5,7] (this order does not matter), and reorder it.
// After reordering, the deck starts as [2,13,3,11,5,17,7], where 2 is the top of the deck.
// We reveal 2, and move 13 to the bottom.  The deck is now [3,11,5,17,7,13].
// We reveal 3, and move 11 to the bottom.  The deck is now [5,17,7,13,11].
// We reveal 5, and move 17 to the bottom.  The deck is now [7,13,11,17].
// We reveal 7, and move 13 to the bottom.  The deck is now [11,17,13].
// We reveal 11, and move 17 to the bottom.  The deck is now [13,17].
// We reveal 13, and move 17 to the bottom.  The deck is now [17].
// We reveal 17.
// Since all the cards revealed are in increasing order, the answer is correct.




public class 9Revealdeckacsorder {

     public int[] deckRevealedIncreasing(int[] deck) {
//         int n=deck.length;
//         if(n==1) return deck;
//         Deque<Integer> ans = new ArrayDeque<>();
//         Arrays.sort(deck);                                   //
//         ans.addFirst(deck[n-1]);
//         ans.addFirst(deck[n-2]);
//         for(int i=n-3;i>=0;i--){
//             ans.addFirst(ans.removeLast());
//             ans.addFirst(deck[i]);
//         }
//          int[] array = ans.stream().mapToInt(Integer::intValue).toArray();
//         return array;

Arrays.sort(deck); // Sort the deck in increasing order
        
int n = deck.length;
int[] result = new int[n];
Deque<Integer> indices = new LinkedList<>();

for (int i = 0; i < n; i++) {
    indices.add(i); // Initialize deque with indices 0, 1, 2, ..., n-1
}

for (int card : deck) {
    int idx = indices.poll(); // Get the next available index
    result[idx] = card; // Place the card in the result array
    if (!indices.isEmpty()) {
        indices.add(indices.poll()); // Move the used index to the end of deque
    }
}

return result;
}

}
