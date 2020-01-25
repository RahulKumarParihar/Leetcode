package com.rahulkumarpariharmailbox.DataStructureHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    /**
     * Create a new singly linked list
     *
     * @param input array of integers
     * @return singly linked list
     */
    public static ListNode CreateLinkedListFromArray(int[] input){
        ListNode listNode = null;
        ListNode head = null;
        for(int i: input){
            if(listNode == null){
                listNode = new ListNode(i);
                head = listNode;
            }else{
                listNode.next = new ListNode(i);
                listNode = listNode.next;
            }
        }

        return head;
    }

    /**
     * Converts singly linked list into List
     *
     * @param node Singly Linked List
     * @return list containing singly linked list value
     */
    public static List<Integer> LinkedListToList(ListNode node){
        List<Integer> list = new ArrayList<>();
        while(node != null){
            list.add(node.val);
            node = node.next;
        }
        return list;
    }
}
