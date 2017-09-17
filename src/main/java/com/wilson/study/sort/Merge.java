package com.wilson.study.sort;

/**
 * <p>
 *     归并排序
 *     不断将数组分成一个个小的数组，让小数组排序，然后合并这些有序的小数组
 *     时间复杂度O(NlogN), 空间复杂度O(N)
 * </p>
 * Created by wilson on 16/09/2017.
 */
public class Merge extends AbstractSortAlgorithm {

    private int [] copy;

    public void sort(int[] a) {
        // 一次性申请空间
        copy = new int[a.length];
        mergeSort(a, 0, a.length - 1);
    }

    private void mergeSort(int[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }

        int mid = (hi + lo) / 2;
        mergeSort(a, lo, mid);
        mergeSort(a, mid + 1, hi);
        // 合并
        merge(a, lo, mid, hi);
    }

    private void merge(int[] a, int lo, int mid, int hi) {

        // 两个起始位置
        int i = lo, j = mid + 1;

        // 复制数组
        for (int k = lo; k <= hi; k++) {
            copy[k] = a[k];
        }

        for (int k = lo; k <= hi; k++) {

            if (i > mid) {
                a[k] = copy[j++];
            } else if (j > hi) {
                a[k] = copy[i++];
            } else if (less(copy[i], copy[j])) {
                a[k] = copy[i++];
            } else {
                a[k] = copy[j++];
            }

        }

    }
}
