package com.wilson.study.string;

import java.util.Objects;

/**
 * KMP string match.
 *
 * @author zhangweilong
 * @create 1/16/19 15:43
 **/
public class KMP {

    public static void main(String[] args) {
        System.out.println(find("acbdsdssds", "ssd"));
    }

    public static int find(String target, String pattern) {

        if (Objects.isNull(target)
            || Objects.isNull(pattern)
            || target.isEmpty()
            || pattern.isEmpty()) {

            return -1;
        }

        // 初始化next数组
        int[] next = getNext(pattern);

        int i = 0;
        int j = 0;
        while (i < target.length() && j < pattern.length()) {

            if (j == -1 || target.charAt(i) == pattern.charAt(j)) {

                i ++;
                j ++;
            } else {
                j = next[j];
            }

            if (j >= pattern.length()) {
                return i - pattern.length();
            }
        }
        return -1;
    }

    private static int[] getNext(String pattern) {
        int[] next = new int[pattern.length()];

        int i = 0;
        int j = -1;
        next[0] = -1;
        while (i < pattern.length() - 1) {

            if (j == -1 || pattern.charAt(i) == pattern.charAt(j)) {
                next[++i] = ++j;
            } else {
                j = next[j];
            }
        }
        return next;
    }
}
