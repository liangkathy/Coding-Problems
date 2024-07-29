class Solution {
    public int[] twoSum(int[] nums, int target) {
       //hashmap (key = int, value = index)
       HashMap<Integer, Integer> newHashMap = new HashMap<>();
       int[] ans = new int[2];

       for (int i = 0; i < nums.length; i++) {
        if (newHashMap.containsKey(target - nums[i])) {
            ans[1] = newHashMap.get(target - nums[i]);
            ans[0] = i;
            return ans;
        } else {
            newHashMap.put(nums[i], i);
        }
       }

       return ans;
    }
}
