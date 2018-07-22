package com.tinnkm.daily.day02;

import java.util.Arrays;
import java.util.List;

/**
 * @author tinnkm
 * @version 1.0
 * @classname Question
 * @description TODO
 * @date 2018/7/22 16:50
 **/
public class Question {
    /*
        Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
        For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
     */


    public static void main(String[] args) {
        Integer[] source = {1, 3, 1, 9, 0};
        Integer[] calc = calc(source);
        Arrays.stream(calc).forEach(i -> System.out.println(i));
    }

    private static Integer[] calc(Integer[] source) {
        Integer[] integers = new Integer[source.length];
        integers[0] = 1;
        for (int i = 1; i < source.length; ++i) {
            integers[i] = integers[i-1] * source[i-1];
        }
        int temp = 1;
        for (int i = source.length - 2;i>=0;--i) {
            temp *= source[i+1];
            integers[i] *= temp;
        }
        return integers;
    }
}
