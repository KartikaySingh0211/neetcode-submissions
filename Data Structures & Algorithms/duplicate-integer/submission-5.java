class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> n = new HashSet<>();
        for(int num: nums){
            if(n.contains(num)) return true;
            n.add(num);
        }
        return false;
    }
}