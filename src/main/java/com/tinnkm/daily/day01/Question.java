/*
 * @project: daily
 * @package: com.tinnkm.daily.day01
 * @filename: Question
 *
 * Copyright (c) 2018 eSunny Info. Tech Ltd. All rights reserved.
 *
 */
package com.tinnkm.daily.day01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @typename: Question
 * @brief: 〈一句话功能简述〉
 * @author: quantdo_wh02
 * @date: 2018/7/20 17:49
 * @version: 1.0.0
 * @since
 */
public class Question {
    /**
     *
     * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
     *
     * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
     */
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(5);
        integers.add(3);
        integers.add(6);
        integers.add(8);
        integers.add(22);
        boolean calc = calc(integers, 2);
        System.out.println(calc);
    }

    private static boolean calc(List<Integer> list, int key){
        list.sort(Comparator.naturalOrder());
        int i = Collections.binarySearch(list, key);
        if (i< 0){
            i = Math.abs(i)-1;
        }
        List<Integer> subList = list.subList(0, i);
        for (int j = 0; j < subList.size(); j++) {
            Integer item = subList.get(j);
            subList.remove(j);
            int i1 = Collections.binarySearch(subList, key -item );
            if (i1 >= 0){
                return true;
            }
        }
        return false;
    }
}
