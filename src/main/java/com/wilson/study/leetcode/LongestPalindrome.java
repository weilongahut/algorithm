package com.wilson.study.leetcode;

/**
 * Created by zhangwl-c
 * Date: 2017/9/20
 * Time: 21:20
 */
public class LongestPalindrome {

	public static void main(String[] args) {
		LongestPalindrome longestPalindrome = new LongestPalindrome();
		int palindromeLength = longestPalindrome.longestPalidrome("abcddcba");
		System.out.println(palindromeLength);

	}

	public int longestPalidrome(String source) {

		if (source == null || source.length() < 1) {
			return 0;
		}
		int length = source.length();

		int max = 0;

		boolean oddLength = false;
		if (length % 2 != 0) {
			oddLength = true;
		}

		// 以i为中心拓展
		for (int i = 0; i < length; i++) {
			int tempLength = 0;
			// 长度为奇数
			if (oddLength) {

				for (int j = 0; i - j >= 0 && i + j < length; ++j) {
					if (source.charAt(i - j) != source.charAt(i + j)) {
						break;
					}
					tempLength = 2 * j + 1;
				}
			} else {
				// 偶数
				for (int j = 0; i -j >= 0 && i + j + 1< length; ++j) {
					if (source.charAt(i - j) != source.charAt(i + j + 1)) {
						break;
					}
					tempLength = 2 * j + 2;
				}
			}

			if (tempLength > max) {
				max = tempLength;
			}
		}
		return max;

	}
}
