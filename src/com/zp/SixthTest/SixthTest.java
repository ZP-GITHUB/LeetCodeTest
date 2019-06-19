package com.zp.SixthTest;

/**
 * Created by ZP on 2019/6/19.
 *判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 */
public class SixthTest {

}

class Solution {
    public boolean isPalindrome(int x) {
        //边界判断
        if (x < 0) return false;
        int div = 1;
        int y = 0;
        //判断整个数字的长度
        while (x / div >= 10) div *= 10;
        while (x > 0) {
            int left = x / div;
            int right = x % 10;
            if (left != right)
                return false;
//            y = y *
            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }
}
