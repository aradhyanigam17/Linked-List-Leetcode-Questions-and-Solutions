class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0 ; 
        int max = Integer.MIN_VALUE ;
        
        for(int i : nums){
            sum = Math.max(i, sum + i);
            max = Math.max(sum , max);
        }
          return max ;
    }
}