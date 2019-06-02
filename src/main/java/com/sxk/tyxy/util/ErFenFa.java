package com.sxk.tyxy.util;

import java.util.Arrays;

/**
 * @author suxingkang
 * 2019年 06月 02日
 */
public class ErFenFa {

    private static final int SUCCESS = 0;
    private static final int FIALD = -1;

    public static void main(String[] args) {
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
        int fd = binarySearch(a, 101);
        if (fd > 0) {
            System.out.println(fd + "找到了");
        } else {
            System.out.println(fd);
        }
        int found = binarySearch(a, 55);
        if (found > 0) {
            System.out.println(found + "找到了！");
        }
    }

    private static int binarySearch(int[] a, int num) {
        int low = 0;
        int hight = a.length;
        while (low < hight) {
            int mid = low + hight >>> 1;
            int midValue = a[mid];
            if (midValue > num) {
                hight = mid - 1;
            } else if (midValue < num) {
                low = mid + 1;
            } else {
                return SUCCESS;
            }
        }
        return FIALD;
    }
}
