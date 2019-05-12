package com.zp.SortRiew;

import static com.zp.SortRiew.BubbleSort.bubbleSort;
import static com.zp.SortRiew.InsertSort.insertSort;
import static com.zp.SortRiew.QuickSort.quick;
import static com.zp.SortRiew.SelectSort.selectSort;
import static com.zp.SortRiew.ShellSort.shellSort;

/**
 * Created by ZP on 2019/5/3.
 * 学习于简书：https://www.jianshu.com/p/8c915179fd02
 */
public class SortTest {

    public static void main(String[] args) {
        int[] bubbleSortnumbers = {10,20,15,0,6,7,2,1,-5,55};
        System.out.print("排序前：");
        printArr(bubbleSortnumbers);

        bubbleSort(bubbleSortnumbers);
        System.out.print("冒泡排序后：");
        printArr(bubbleSortnumbers);

        int[] quicknumbers = {10,20,15,0,6,7,2,1,-5,55};
        quick(quicknumbers);
        System.out.print("快速排序后：");
        printArr(quicknumbers);

        int[] selectSortnumbers = {57,68,59,52};
        selectSort(selectSortnumbers);
        System.out.print("选择排序后：");
        printArr(selectSortnumbers);

        int[] insertSortnumbers = {10,20,15,0,6,7,2,1,-5,55};
        insertSort(insertSortnumbers);
        System.out.print("插入排序后：");
        printArr(insertSortnumbers);

        int[] shellSortnumbers = {10,20,15,0,6,7,2,1,-5,55};
        shellSort(shellSortnumbers);
        System.out.print("希尔排序后：");
        printArr(shellSortnumbers);
    }

    /**
     * 打印函数
     * @param numbers
     */
    public static void printArr(int[] numbers)
    {
        for(int i = 0 ; i < numbers.length ; i ++ )
        {
            System.out.print(numbers[i] + ",");
        }
        System.out.println("");
    }
}
