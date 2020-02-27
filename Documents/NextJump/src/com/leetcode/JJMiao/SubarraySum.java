package com.leetcode.JJMiao;

public class SubarraySum {
    public static void main(String args[]) {
        int arr[] = { 4,5,6 };

            System.out.print(subarraySum(arr));
    }
    private static int subarraySum(int[] arr) {
        long result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i] * (i + 1) * (arr.length - i);
        }
        return (int) result;
    }

}
