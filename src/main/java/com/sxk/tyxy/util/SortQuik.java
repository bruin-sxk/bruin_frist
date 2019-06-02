package com.sxk.tyxy.util;

import java.util.Arrays;

/**
 * @author suxingkang
 * 2019年 06月 02日
 */
public class SortQuik {

    public static void main(String[] args) {
        int[] sort = new int[]{5, 8, 6, 3, 77, 22};
        sortQuick1(sort, 0, sort.length - 1);
    }

    private static void sortQuick1(int[] sort, int left, int right) {
        int start = left;
        int end = right;
        int key = sort[start];
        while (end > start) {
            while (end > start && sort[end] >= key)
                end--;
            if (sort[end] < key) {
                int temp = sort[end];
                sort[end] = key;
                key = temp;
            }
            while (end > start && sort[start] <= key)
                start++;
            if (sort[start] > key) {
                int temp = sort[start];
                sort[start] = key;
                key = temp;
            }
            if (start > left) {
                sortQuick1(sort, left, start - 1);
            }
            if (end < right) {
                sortQuick1(sort, end + 1, right);
            }
            System.out.println(Arrays.toString(sort));
        }
    }

}
