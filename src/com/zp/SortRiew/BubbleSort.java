package com.zp.SortRiew;

/**
 * Created by ZP on 2019/5/3.
 */
public class BubbleSort {
/*
 * 冒泡排序
 * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
 * 针对所有的元素重复以上的步骤，除了最后一个。
 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 * @param numbers 需要排序的整型数组
 */
    public static void bubbleSort(int[] numbers){
        int tem = 0;
        int size = numbers.length;
//        因为单j==size时,j++越界，故size-1保证无越界报错
        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < size-i-1; j++) {
                if (numbers[j]>numbers[j+1]) {
                    tem = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = tem;
                }
            }
        }
    }
}
