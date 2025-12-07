/*Given an integer array nums, return an array answer such that answer[i] is equal 
to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0] */
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int ans[] = new int[l];
        // trying in 0(n) time complexity
        // finding the number of zeroes in the array
        /* the array can contain 0 zeroes,1 zeroes, 2+ zeroes */

        int count_zeroes = 0;

        for (int i = 0; i < l; i++) {
            if (nums[i] == 0)
                count_zeroes++;
        }
        if (count_zeroes == 0) {
            // calculate product of the whole array
            int product = 1;
            for (int i = 0; i < l; i++) {
                if (nums[i] == 0) {
                    continue;
                } else {
                    product = product * nums[i];

                }

            }

            for (int i = 0; i < l; i++) {
                if (nums[i] == 0) {
                    ans[i] = product;
                } else {
                    ans[i] = product / nums[i];

                }

            }
        }

        if (count_zeroes == 1) {
            // code to be written
            int index = -1;
            for (int i = 0; i < l; i++) {
                if (nums[i] == 0) {
                    index = i;
                    break;
                }
            }
            int product = 1;
            for (int i = 0; i < l; i++) {
                if (i != index) {
                    product = product * nums[i];
                }
            }
            for (int i = 0; i < l; i++) {
                if (i == index) {
                    ans[i] = product;
                } else {
                    ans[i] = 0;
                }
            }

        }

        if (count_zeroes >= 2) {
            for (int i = 0; i < l; i++) {
                ans[i] = 0;
            }
        }

        return ans;

        // brute force
        // int count = 0;
        // int ans[] = new int[l];
        // int p = 1;

        // int k = l;
        // while (k != 0) {
        // p = 1;
        // for (int i = 0; i < l; i++) {

        // if (i == count) {
        // continue;
        // } else {
        // p = p * nums[i];
        // }
        // }
        // ans[count] = p;
        // count++;
        // k--;
        // }
        // return ans;

    }
}