package com.zp.ThirdTest;

/**
 * Created by ZP on 2019/5/12.
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，
 * 并且它们的每个节点只能存储 一位 数字。
 *如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 示例：
 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 输出：7 -> 0 -> 8
 原因：342 + 465 = 807
 */
public class ThirdTest {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(0);
        ListNode listNode = Solution.addTwoNumbers(node1,node2);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
        System.out.println("111");
    }

    //结点的数据结构
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    static class Solution {

        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            ListNode listNode = new ListNode(0);
            ListNode p1 = l1 , p2 = l2 , newNode = listNode;
            int carry = 0;
            while (p1!=null || p2!=null){
                int x = (p1!=null) ? p1.val:0;
                int y = (p2!=null) ? p2.val:0;
                int sum = x + y +carry;
                carry = sum / 10;
                newNode.next = new ListNode(sum%10);
                newNode = newNode.next;
                if (p1 != null)
                    p1 = p1.next;
                if (p2 != null)
                    p2 = p2.next;
            }
            if (carry > 0) {
                newNode.next = new ListNode(carry);
            }
            return listNode.next;
//            while (p1.next != null && p2.next != null) {
//                p1 = p1.next;
//                p2 = p2.next;
//            }

//            p1.val = p1.val + p2.val + addTwoNumbers(p1.next,p2.next).val/10;
//            if (p1 == null && p2 != null) {
//                p1 = p2;
//                return listNode;
//            }else if (p1 != null && p2 == null){
//                return listNode;
//            }

//            return p1;
        }
    }
}

