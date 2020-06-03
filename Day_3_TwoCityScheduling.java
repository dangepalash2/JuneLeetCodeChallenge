class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int evenLength = costs.length/2;
        int[] temp = new int[evenLength * 2];
        int minimumCost = 0, j = 0;
        for(int[] cost : costs){
            temp[j++] = cost[1] - cost[0];
            minimumCost += cost[0];
        }
        Arrays.sort(temp);
        for(int i = 0; i < evenLength; i++){
            minimumCost += temp[i];
        }
        return minimumCost;
    }
}