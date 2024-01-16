class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
         int[] losses = new int[100001];// constrints is 10^5

        for (int i = 0; i < matches.length; i++) {
            int win = matches[i][0];
            int loss = matches[i][1];

            if (losses[win] == 0) {
                losses[win] = -1;// using -1 to mark n losses 
            } 

            if (losses[loss] == -1) {
                losses[loss] = 1;//look how to use both win and losses to get to the answers
            } else {
                losses[loss]++;
            }
        }

        List<Integer> zeroLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < losses.length; i++) {
            if (losses[i] == -1) {
                zeroLoss.add(i);
            } else if (losses[i] == 1) {
                oneLoss.add(i);
            }
        }

        result.add(zeroLoss);
        result.add(oneLoss);

        return result;
    
    }
}