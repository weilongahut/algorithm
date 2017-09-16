package com.wilson.study.sort;

/**
 * <p>
 *     插入排序
 *     从待排序数组中找出最小的数插入到有序数组中
 * </p>
 * Created by wilson on 16/09/2017.
 */
public class Insertion extends AbstractSortAlgorithm {

    public void sort(int[] a) {

        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--) {
                swap(a, j, j-1);
            }
        }

    }
}
