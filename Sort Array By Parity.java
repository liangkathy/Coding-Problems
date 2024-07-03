class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;
        List<Integer> oddArray = new ArrayList<>();


        if(nums.length > 1){
            for(int n: nums){
                if(n % 2 == 0){
                    result[index] = n;
                    index++;
                } else {
                    oddArray.add(n);
                }
            }

            for(int n: oddArray){
                result[index] = n;
                index++;
            }

            return result;
            
        } else {
            return nums;
        }
    }
}
