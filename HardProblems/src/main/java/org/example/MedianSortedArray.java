package org.example;

public class MedianSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l = 0, r = 0, k = 0;
        int[] arr = new int[nums1.length + nums2.length];

        // Merging two sorted arrays into one sorted array
        while (l < nums1.length && r < nums2.length) {
            if (nums1[l] <= nums2[r]) {
                arr[k++] = nums1[l++];
            } else {
                arr[k++] = nums2[r++];
            }
        }

        // Add remaining elements from nums1
        while (l < nums1.length) {
            arr[k++] = nums1[l++];
        }

        // Add remaining elements from nums2
        while (r < nums2.length) {
            arr[k++] = nums2[r++];
        }

        // Print the merged array (optional, for debugging)
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Calculate and return the median
        if (arr.length % 2 != 0) {
            return arr[arr.length / 2];
        } else {
            return (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2.0;
        }
    }
}
