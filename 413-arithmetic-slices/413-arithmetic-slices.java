class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int diff = 0, curCount = 0, result = 0;
        for (int i=1; i<nums.length; i++) {
            if (nums[i] - nums[i-1] == diff) { // Update the curCount if the difference is same as diff
                curCount++;
                if (curCount >= 2) { //Add combination end with this element, if there has 2 pairs of same diff 
                    result += (curCount-1);
                }
            } else {  // Update the new diff and reset the curCount as 1
                diff = nums[i] - nums[i-1];
                curCount = 1;
            }
        }
        return result;
    }
}