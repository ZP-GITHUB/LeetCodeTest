package com.zp.SortRiew;

/**
 * Created by ZP on 2019/5/3.
 */
public class SelectSort {
    /**
     * 选择排序算法
     * 在未排序序列中找到最小元素，存放到排序序列的起始位置
     * 再从剩余未排序元素中继续寻找最小元素，然后放到排序序列末尾。
     * 以此类推，直到所有元素均排序完毕。
     * @param numbers
     */
    public static void selectSort(int[] numbers){
        int tem;
        int size = numbers.length;
        for (int i = 0; i <size ; i++) {
            for (int j = i+1; j <size; j++) {
                if (numbers[i]>numbers[j]) {
                    tem = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tem;
                }
            }
        }
    }
}
