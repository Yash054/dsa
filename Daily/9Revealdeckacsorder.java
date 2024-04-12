public class 9Revealdeckacsorder {

//     public int[] deckRevealedIncreasing(int[] deck) {
//         int n=deck.length;
//         if(n==1) return deck;
//         Deque<Integer> ans = new ArrayDeque<>();
//         Arrays.sort(deck);
//         ans.addFirst(deck[n-1]);
//         ans.addFirst(deck[n-2]);
//         for(int i=n-3;i>=0;i--){
//             ans.addFirst(ans.removeLast());
//             ans.addFirst(deck[i]);
//         }
//          int[] array = ans.stream().mapToInt(Integer::intValue).toArray();
//         return array;


//     }

}
