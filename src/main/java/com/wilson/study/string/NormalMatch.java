package com.wilson.study.string;

import java.util.Objects;

/**
 * 暴力查找.
 *
 * @author zhangweilong
 * @create 1/16/19 14:45
 **/
public class NormalMatch {

    public static void main(String[] args) {

        System.out.println(find("acbdsdssds", "ssd"));
    }

    /**
     * find pattern in target.
     *
     * @param target
     * @param pattern
     * @return return true if pattern exists.
     */
    public static int find(String target, String pattern) {

        if (Objects.isNull(target)
            || Objects.isNull(pattern)
            || target.isEmpty()
            || pattern.isEmpty()) {

            return -1;
        }

        int i = 0;
        int j = 0;
        int m = target.length();
        int n = pattern.length();

        while (i < m && j < n) {
            if (target.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            } else {
                j = 0;
                i = i - j + 1;
            }

            if (j == n) {
                return i - j;
            }
        }

        return -1;
    }
}
