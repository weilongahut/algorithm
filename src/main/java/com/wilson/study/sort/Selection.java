package com.wilson.study.sort;

/**
 * <p>
 *     选择排序
 *     从待排序的数组中找出最小的元素，将其放到正确的位置
 *     时间复杂度O(N^2),空间复杂度1
 * </p>
 * Created by wilson on 16/09/2017.
 */
public class Selection extends AbstractSortAlgorithm {

    public void sort(int[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i+1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            swap(a, i, min);
        }
    }


    public static void main(String[] args) {
        int[] array = new int[]{4, 3, 98, 45, 38, 208, 23};
        Selection selection = new Selection();
        selection.sort(array);
        selection.printArr(array);

    }
}
