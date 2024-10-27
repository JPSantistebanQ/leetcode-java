package com.jpsantq.leetcode.problems.basic.b_0001_two_sum;

public class TwoSum {

    public static int[] solution(int[] nums, int target) {
        // int[] response = null;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int a = nums[i];
            for (int j = i + 1; j < length; j++) {
                // if(j==i) continue;
                int search = target - a;
                if (search == nums[j])
                    return new int[] { i, j };
            }
        }
        return null;
    }

}
