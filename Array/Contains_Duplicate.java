/*Given an integer array nums, return true if any value appears at least twice in the array,
 and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true
Explanation:
The element 1 occurs at the indices 0 and 3. */
//
//
//
//
//
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int l = nums.length;
        int count = 0;
        // Arrays.sort(nums);
        for (int i = 0; i < l - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
            }
            if (count > 0)
                break;

        }
        if (count > 0)
            return true;
        else
            return false;

    }
}