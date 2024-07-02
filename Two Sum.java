class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indexes = new int[2];
        for(int i = 0; i<nums.length -1; i++){
            for(int n = i+1; n<nums.length; n++){
                if(nums[i]+nums[n] == target){
                    indexes[0] = i;
                    indexes[1] = n;
                }
            }
        }

        return indexes;
    }
}
