package com.hieudev.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class _1_TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        _1_TwoSum obj = new _1_TwoSum();
        System.out.println(Arrays.toString(obj.twoSumOptimal(nums, target)));
    }

    // cách 1
    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    // cách 2
    public int[] twoSum2(int[] nums, int target) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (nums[j] + nums[j - i] == target) {
                    return new int[] { j, j - i };
                }
            }
        }
        return null;
    }

    // cách 3: O(n)
    // tư tưởng: có 1 bộ số với tổng là target, thì sẽ có 1 số duyệt trước, 1 số duyệt sau
    // số duyệt trước sẽ lưu vào trong map
    // for 1 lần, map lưu <nums[i], i> nếu key bù của nó chưa có trong map (tức chưa duyệt qua)
    public int[] twoSumOptimal(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int bu = target - nums[i];
            if (map.containsKey(bu)) {
                return new int[]{map.get(bu), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
