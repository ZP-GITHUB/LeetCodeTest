package com.zp.SecondTest;

/**
 * Created by ZP on 2019/4/24.
 * 设计链表的实现。您可以选择使用单链表或双链表。单链表中的节点应该具有两个属性：val 和 next。val 是当前节点的值，next 是指向下一个节点的指针/引用。如果要使用双向链表，则还需要一个属性 prev 以指示链表中的上一个节点。假设链表中的所有节点都是 0-index 的。
 在链表类中实现这些功能：
 get(index)：获取链表中第 index 个节点的值。如果索引无效，则返回-1。
 addAtHead(val)：在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。
 addAtTail(val)：将值为 val 的节点追加到链表的最后一个元素。
 addAtIndex(index,val)：在链表中的第 index 个节点之前添加值为 val  的节点。如果 index 等于链表的长度，则该节点将附加到链表的末尾。如果 index 大于链表长度，则不会插入节点。
 deleteAtIndex(index)：如果索引 index 有效，则删除链表中的第 index 个节点。
 示例：
 MyLinkedList linkedList = new MyLinkedList();
 linkedList.addAtHead(1);
 linkedList.addAtTail(3);
 linkedList.addAtIndex(1,2);   //链表变为1-> 2-> 3
 linkedList.get(1);            //返回2
 linkedList.deleteAtIndex(1);  //现在链表是1-> 3
 linkedList.get(1);            //返回3
 提示：
 所有值都在 [1, 1000] 之内。
 操作次数将在  [1, 1000] 之内。
 请不要使用内置的 LinkedList 库。
 */
public class SecondTest {

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();


        linkedList.addAtIndex(-1,0);
        int num = linkedList.get(0);
        linkedList.deleteAtIndex(-1);
        System.out.println(num);
    }

}

class Node{
    Node next = null;
    int data;

    public Node(int data) {
        this.data = data;
    }
}

class MyLinkedList {

    private Node head;
    private int size;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = new Node(-1);
        size = 0;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        //这里是个坑，index >= size时要退出，不然会数组越界
        if (index < 0 || index >= size) {
            return -1;
        }
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        //head节点类似于处于-1的位置，若index为0，node.next才是0的位置
        //所以这里node表示index的上一个节点，node.next表示index的节点
        return node.next.data;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        addAtIndex(0,val);
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        addAtIndex(size,val);
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index < -1 || index > size) {
            return;
        }
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        Node newNode = new Node(val);
        newNode.next = node.next;
        node.next = newNode;
        size++;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        node.next = node.next.next;
        size--;
    }
}