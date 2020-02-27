package com.leetcode.JJMiao;

import java.util.Arrays;

public class MinimunDifferenceSum {
    public static void main(String[] args) {
        int n=5;
        int [] arr = {1,3,3,2,4};

        System.out.println(getSum(n, arr));

    }
    public static int getSum(int n, int [] arr){
        int sum =0;
        Arrays.sort(arr);
        for (int i =0; i< arr.length-1; i++){

            sum += Math.abs(arr[i]-arr[i+1]);

        }
        return sum;

    }

}
