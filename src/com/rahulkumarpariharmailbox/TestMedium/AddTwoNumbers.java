package com.rahulkumarpariharmailbox.TestMedium;

import com.rahulkumarpariharmailbox.DataStructureHelper.ListNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AddTwoNumbers {
    com.rahulkumarpariharmailbox.IntefaceMedium.AddTwoNumbers addTwoNumbers = new com.rahulkumarpariharmailbox.Medium.AddTwoNumbers();

    @Test
    public void TestCase1(){
        ListNode list1 = ListNode.CreateLinkedListFromArray(new int[] {2,4,3});
        ListNode list2 = ListNode.CreateLinkedListFromArray(new int[] {5,6,4});
        ListNode result = addTwoNumbers.addTwoNumbers(list1,list2);
        assertThat(ListNode.LinkedListToList(result),is(new ArrayList<>(Arrays.asList(7,0,8))));
    }

    @Test
    public void TestCase2(){
        ListNode list1 = ListNode.CreateLinkedListFromArray(new int[] {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1});
        ListNode list2 = ListNode.CreateLinkedListFromArray(new int[] {5,6,4});
        ListNode result = addTwoNumbers.addTwoNumbers(list1,list2);
        assertThat(ListNode.LinkedListToList(result),is(new ArrayList<>(Arrays.asList(6,6,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1))));
    }
}
