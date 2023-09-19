import java.util.Arrays;

public class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums); // Sort the array in ascending order

        // Iterate through the sorted array
        for (int i = 1; i < nums.length; i++) {
            // Check if adjacent elements are equal
            if (nums[i] == nums[i - 1]) {
                return nums[i]; // Found the duplicate number
            }
        }

        return -1; // No duplicate found (shouldn't happen for this problem)
    }
}