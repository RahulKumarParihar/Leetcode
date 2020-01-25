package com.rahulkumarpariharmailbox.Medium;

import com.rahulkumarpariharmailbox.DataStructureHelper.ListNode;

public class AddTwoNumbers implements com.rahulkumarpariharmailbox.IntefaceMedium.AddTwoNumbers {
    @Override
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = null;
        ListNode p = l1, q = l2, curr = null;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            if(curr == null)
                curr = new ListNode(sum % 10);
            else{
                curr.next = new ListNode(sum % 10);
                curr = curr.next;
            }
            if(dummyHead == null)
                dummyHead = curr;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead;
    }
}
