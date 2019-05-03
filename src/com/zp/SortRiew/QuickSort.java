package com.zp.SortRiew;

/**
 * Created by ZP on 2019/5/3.
 */
public class QuickSort {
    /**
     * 快速排序
     * 通过一趟排序将待排序记录分割成独立的两部分，其中一部分记录的关键字均比另一部分关键字小，
     * 则分别对这两部分继续进行排序，直到整个序列有序。
     * /

     /**
     * 快速排序提供方法调用
     * @param numbers 带排序数组
     */
    public static void quick(int[] numbers)
    {
        if(numbers.length > 0)   //查看数组是否为空
        {
            quickSort(numbers, 0, numbers.length-1);
        }
    }

    /**
     *递归形式的分治排序算法
     * @param numbers 带排序数组
     * @param low  开始位置
     * @param high 结束位置
     */
    public static void quickSort(int[] numbers,int low,int high){
        if(low < high){
            int middle = getMiddle(numbers,low,high);//将numbers数组进行一分为二
            quickSort(numbers,low,middle-1);//对低字段表进行递归排序
            quickSort(numbers,middle+1,high);//对高字段表进行递归排序
        }
    }

     /**
     * 查找出中轴（默认是最低位low）的在numbers数组排序后所在位置
     * @param numbers 带查找数组
     * @param low   开始位置
     * @param high  结束位置
     * @return  中轴所在位置
     */
    public static int getMiddle(int[] numbers,int low,int high){
        int tem = numbers[low]; //数组第一个作为中轴
        while (low<high){
            while (low<high && numbers[high] >= tem){
                high--;
            }
            numbers[low] = numbers[high];//比中轴小的记录移到低端
            while (low<high && numbers[low] < tem){
                low++;
            }
            numbers[high] = numbers[low];//比中轴大的记录移到高端
        }
        numbers[low] = tem;
        return low;
    }

}
