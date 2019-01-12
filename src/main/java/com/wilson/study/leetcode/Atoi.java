package com.wilson.study.leetcode;

/**
 * ascii to int
 *
 * 请你来实现一个 atoi 函数，使其能将字符串转换成整数。
 * 首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。
 * 当我们寻找到的第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字组合起来，作为该整数的正负号；假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。
 * 该字符串除了有效的整数部分之后也可能会存在多余的字符，这些字符可以被忽略，它们对于函数不应该造成影响。
 * 注意：假如该字符串中的第一个非空格字符不是一个有效整数字符、字符串为空或字符串仅包含空白字符时，则你的函数不需要进行转换。
 * 在任何情况下，若函数不能进行有效的转换时，请返回 0。
 * Created by wilson on 2019/1/12.
 */
public class Atoi {

    public static void main(String[] args) {
        System.out.println(myAtoi("-2147483649"));
    }

    public static int myAtoi(String str) {
        int number = 0;
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int i = 0;
        int negative = 0;
        boolean numberStart = false;
        while (i < str.length()) {

            char c = str.charAt(i++);
            if (c == ' '){
                if (numberStart) {
                    return number;
                }
                continue;
            }

            // not start with -/+ and numbers
            if ((c != '-' && c != '+') && (c > '9' || c < '0')) {
                break;
            } else {
                // -/+ should only show once
                if (numberStart && (c == '-' || c == '+')) {
                    break;
                }
                numberStart = true;
            }

            if (c == '-'){
                if (negative != 0) {
                    return 0;
                }
                negative = -1;
            } else if (c == '+') {
                if (negative != 0) {
                    return 0;
                }
                negative = 1;
            } else {
                int cur = c - '0';
                cur = negative == 0 ? cur : cur * negative;
                if (number > Integer.MAX_VALUE / 10
                        || (number == Integer.MAX_VALUE/10 && cur > 7)) {
                    return Integer.MAX_VALUE;
                }

                if (number < Integer.MIN_VALUE / 10
                        || (number == Integer.MIN_VALUE/10 && cur < -8)) {
                    return Integer.MIN_VALUE;
                }
                number = number * 10 + cur;
            }

        }
        return number;
    }
}
