package com.sxk.tyxy.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author suxingkang
 * 2019年 06月 02日
 */
public class AllSort {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> rsList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(Integer.valueOf(i));
        }
        sortAll(list, rsList);
    }

    private static void sortAll(List<Integer> list, List<Integer> rsList) {
        if (list.size() == 1) {
            rsList.add(list.get(0));
            System.out.println(rsList.toString());
            rsList.remove(rsList.size() - 1);
        } else {
            for (int i = 0; i < list.size(); i++) {
                rsList.add(list.get(i));
                List<Integer> temp = new ArrayList<>();
                list.forEach(num -> temp.add(num));
                temp.remove(i);
                sortAll(temp, rsList);
                rsList.remove(rsList.size() - 1);
            }
        }
    }

}
