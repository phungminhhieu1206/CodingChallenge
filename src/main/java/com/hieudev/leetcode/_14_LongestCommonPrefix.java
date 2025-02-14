package com.hieudev.leetcode;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * Example 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * ------------------
 * Example 2:
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 */
public class _14_LongestCommonPrefix {
    public static void main(String[] args) {
        _14_LongestCommonPrefix obj = new _14_LongestCommonPrefix();
        String[] strs = {"flower","flow","flight"};

        System.out.println("result: " + obj.longestCommonPrefix(strs));
    }


    public String longestCommonPrefix(String[] strs) {
        StringBuilder r = new StringBuilder();
        int n = strs.length;
        int minLength = strs[0].length();
        for (int i = 0; i < n; i++) {
            if (strs[i].length() < minLength) {
                minLength = strs[i].length();
            }
        }
        int sIndex = 0;

        while (minLength > 0) {
            char temp = strs[0].charAt(sIndex);

            for (int i = 1; i < n; i++) {
                if (strs[i].charAt(sIndex) != temp) {
                    return r.toString();
                }
            }
            r.append(temp);
            sIndex++;
            minLength--;
        }

        return r.toString();
    }
}
