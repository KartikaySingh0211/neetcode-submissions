public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int L = 0, R = numbers.length - 1;

        while (L < R) {
            int curSum = numbers[L] + numbers[R];

            if (curSum > target) {
                R--;
            } else if (curSum < target) {
                L++;
            } else {
                return new int[] { L + 1, R + 1 };
            }
        }
        return new int[0];
    }
}