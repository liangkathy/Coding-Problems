//Given a 0-indexed integer array nums of length n and an integer target, return the number of pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j] < target.

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.size()-1; i++) {
            for (int n = i+1; n < nums.size(); n++) {
                if ((nums.get(i) + nums.get(n)) < target) {
                    count++;
                }
            }
        }
        return count;
    }
}
