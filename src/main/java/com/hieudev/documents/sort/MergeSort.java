package com.hieudev.documents.sort;

/**
 * O(nlogn)
 */
public class MergeSort {
    public static void main(String[] args) {
        MergeSort obj = new MergeSort();
        int nums[] = {5, 1, 0, 0, 1, 2, 4};

        obj.mergeSort(nums);
        for (int i: nums) {
            System.out.print(i + ",");
        }
    }

    public void mergeSort(int[] nums) {
        // solve...
    }
}
