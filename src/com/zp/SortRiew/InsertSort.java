package com.zp.SortRiew;

/**
 * Created by ZP on 2019/5/3.
 */
public class InsertSort {
    /**基本思想：每步将一个待排序的记录，按其顺序码大小插入到前面已经排序的字序列的合适位置
     * （从后向前找到合适位置后），直到全部插入排序完为止。
     *
     * 插入排序
     *
     * 从第一个元素开始，该元素可以认为已经被排序
     * 取出下一个元素，在已经排序的元素序列中从后向前扫描
     * 如果该元素（已排序）大于新元素，将该元素移到下一位置
     * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
     * 将新元素插入到该位置中
     * 重复步骤2
     * @param numbers  待排序数组
     */
    public static void insertSort(int[] numbers){
        int tem = 0;
        int size = numbers.length;
        int j = 0;

        for (int i = 0; i < size; i++) {
            tem = numbers[i];
            //假如temp比前面的值小，则将前面的值后移
            for (j = i; j >0 && tem<numbers[j-1] ; j--) {
                    numbers[j] = numbers[j-1];
            }
            numbers[j] = tem;
        }
    }
}
