package com.zp.FirstTest;

/**
 * Created by ZP on 2019/4/23.
 */
public class FirstTest {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] solu = new Solution().twoSum(nums,target);
        System.out.println(solu[0]);
        System.out.println(solu[1]);
    }

    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] solu = {0,0};
            for (int i = 0; i < nums.length; i++) {
                for (int j = i+1; j <nums.length ; j++) {
                    if (nums[i] + nums[j] == target) {
                        solu[0] = i;
                        solu[1] = j;
                        return solu;
                    }
                }
            }
            return solu;
        }
    }
}
