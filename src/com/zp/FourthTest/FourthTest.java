package com.zp.FourthTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 209.单词模式
 * 给定一种 pattern(模式) 和一个字符串 str ，判断 str 是否遵循相同的模式。
 这里的遵循指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应模式。
 示例1:
 输入: pattern = "abba", str = "dog cat cat dog"
 输出: true
 示例 2:
 输入:pattern = "abba", str = "dog cat cat fish"
 输出: false
 * Created by ZP on 2019/5/15.
 */
public class FourthTest {
    public static void main(String[] args) {
        String pattern = "abba", str = "dog dog dog dog";
        boolean b = Solution.wordPattern(pattern, str);
        System.out.println(b);
    }
}
class Solution {
    public static boolean wordPattern(String pattern, String str) {
        Map<Character,String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        String[] str1 = str.split(" ");
        char[] pattern1 = pattern.toCharArray();
        if (str1.length != pattern1.length) {
            return false;
        }
        for (int i = 0; i < str1.length; i++) {
            if(map.containsKey(pattern1[i])){
                if (map.get(pattern1[i]).equals(str1[i])){
                    continue;
                }else {
                    return false;
                }
            }else {
                if(set.add(str1[i]))
                    map.put(pattern1[i],str1[i]);
                else
                    return false;
            }
        }
        return true;
    }
}