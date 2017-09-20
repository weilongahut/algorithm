package com.wilson.study.leetcode;

/**
 * Created by zhangwl-c
 * Date: 2017/9/19
 * Time: 17:59
 */
public class MergeSortedArray {

	public static void main(String[] args) {
		int a[] = new int[10];
		for (int i = 0; i<4; i++) {
			a[i] = i + 1;
		}

		int b[] = new int[3];
		for (int i = 0; i<b.length; i++) {
			a[i] = i + 4;
		}

		MergeSortedArray mergeSortedArray = new MergeSortedArray();
		mergeSortedArray.merge(a, 4, b, 3);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public void merge(int a[], int m, int [] b, int n) {
		int i = m - 1;
		int j = n - 1;

		int merged = m + n -1;

		while (merged >= 0) {
			if (i >= 0 && j >= 0) {
				if (a[i] > b[j]) {
					a[merged] = a[i--];
				} else {
					a[merged] = b[j--];
				}
			} else if (j >= 0) {
				a[merged] = b[j--];
			} else if (i >= 0){
				a[merged] = a[i--];
			}
			merged--;
		}
	}
}
