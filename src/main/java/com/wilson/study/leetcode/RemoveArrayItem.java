package com.wilson.study.leetcode;

/**
 * <p>
 *     移除数组中的指定元素，并且返回数组最终的长度
 * </p>
 * Created by zhangwl-c
 * Date: 2017/9/19
 * Time: 17:43
 */
public class RemoveArrayItem {

	public static void main(String[] args) {

		int arr[] = new int[] {1, 2, 3, 4, 1, 2};
		RemoveArrayItem removeArrayItem = new RemoveArrayItem();
		System.out.println(removeArrayItem.removeItems(arr, 2));
	}

	public int removeItems(int[] arr, int target) {

		int i = 0, j = 0;

		if (arr.length > 0) {

			for (; i < arr.length; i++) {
				if (arr[i] == target) {
					continue;
				}
				arr[j] = arr[i];
				j++;
			}
		}

		return j;
	}
}
