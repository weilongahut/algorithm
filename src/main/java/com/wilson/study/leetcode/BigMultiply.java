package com.wilson.study.leetcode;

/**
 * Created by zhangwl-c
 * Date: 2017/9/20
 * Time: 20:45
 */
public class BigMultiply {

	public String multiply(String num1, String num2) {
		char chars1[] = num1.toCharArray();
		char chars2 [] = num2.toCharArray();

		int result[] = new int[chars1.length + chars2.length];
		int n1[] = new int[chars1.length];
		int n2[] = new int[chars2.length];

		for (int i = 0; i < chars1.length; i++) {
			n1[i] = chars1[i] - '0';
		}

		for (int i =0; i < chars2.length; i++) {
			n2[i] = chars2[i] - '0';
		}

		/**
		 * 重点在这里 result[i+j] += n1[i] * n2[j]
		 */
		for (int i = 0; i < chars1.length; i++) {
			for (int j = 0; j <chars2.length; j++) {
				result[i + j] += n1[i] * n2[j];
			}
		}

		for (int i = result.length -1; i > 0; i--) {
			result[i - 1] += result[i] / 10;
			result[i] = result[i] % 10;
		}

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < result.length -1; i ++) {
			sb.append(result[i]);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		BigMultiply bigMultiply = new BigMultiply();
		String result = bigMultiply.multiply("12", "12");

		System.out.println(result);
	}
}
