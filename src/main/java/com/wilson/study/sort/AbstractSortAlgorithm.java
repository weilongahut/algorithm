package com.wilson.study.sort;

/**
 * Created by wilson on 16/09/2017.
 */
public abstract class AbstractSortAlgorithm implements SortAlgorithm {

    /**
     * <p>
     *     比较方法
     * </p>
     * @param a
     * @param b
     * @return a是否小于b
     */
    protected boolean less(int a, int b){
        return a < b;
    }


    /**
     * <p>
     *     交换数组a的i和j位置的数据
     * </p>
     * @param a
     * @param i
     * @param j
     */
    protected void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    /**
     * <p>
     *     打印数组
     * </p>
     * @param a
     */
    public void printArr(int[] a) {
        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);
        }
    }

    /**
     * <p>
     *     判断数组是否有序
     * </p>
     * @param a
     * @return
     */
    public boolean isSorted(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
            if (less(a[i + 1], a[i])) {
                return false;
            }
        }
        return true;
    }
}
