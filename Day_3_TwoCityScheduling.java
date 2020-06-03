class Solution {
    public int twoCitySchedCost(int[][] costs) {
        //Creating new index with number N number of person
        int evenLength = costs.length/2;
        int[] temp = new int[evenLength * 2];
        int minimumCost = 0, j = 0;
        //Iterating to calculate the difference
        for(int[] cost : costs){
            temp[j++] = cost[1] - cost[0];
            minimumCost += cost[0];
        }
        //Sorting the calculated array -> temp
        Arrays.sort(temp);
        for(int i = 0; i < evenLength; i++){
            //Add total cost minimumn
            minimumCost += temp[i];
        }
        //return minimum cost
        return minimumCost;
    }
}