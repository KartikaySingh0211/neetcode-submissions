class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> arr = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int diff = target - num;

            if(arr.containsKey(diff)){
                return new int[]{
                    arr.get(diff), i
                };
            }

            arr.put(num, i);
        }

        return new int[]{};
    }
}
