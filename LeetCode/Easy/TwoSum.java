class Solution {
    public int[] twoSum(int[] nums, int target) {
        // brute force method
        // first iteration through the list
        for (int i = 0; i < nums.length; i++){
            // second iteration through the list checking values one index higher than i
            for (int j = i + 1; j < nums.length; j++){
                // checking whether j is equal to the compliment
                if (nums[j] == target - nums[i]){
                    //returning the value in a new list wit its index
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}