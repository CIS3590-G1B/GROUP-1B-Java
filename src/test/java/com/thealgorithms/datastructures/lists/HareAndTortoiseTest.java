package com.thealgorithms.datastructures.lists;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HareAndTortoiseTest {

    @Test
    public void testEmptyList() {
        HareAndTortoise.ListNode head = null;
        assertFalse(HareAndTortoise.hasCycle(head));
    }

    @Test
    public void testSingleNoCycle() {
        HareAndTortoise.ListNode head = new HareAndTortoise.ListNode(1);
        assertFalse(HareAndTortoise.hasCycle(head));
    }

    @Test
    public void testTwoNodesNoCycle() {
        HareAndTortoise.ListNode head = new HareAndTortoise.ListNode(1);
        head.next = new HareAndTortoise.ListNode(2);
        assertFalse(HareAndTortoise.hasCycle(head));
    }

    @Test
    public void testCycleInTwoNodes() {
        HareAndTortoise.ListNode head = new HareAndTortoise.ListNode(1);
        HareAndTortoise.ListNode second = new HareAndTortoise.ListNode(2);
        head.next = second;
        second.next = head;
        assertTrue(HareAndTortoise.hasCycle(head));
    }

    @Test
    public void testCycleInMiddle() {
        HareAndTortoise.ListNode head = new HareAndTortoise.ListNode(1);
        HareAndTortoise.ListNode second = new HareAndTortoise.ListNode(2);
        HareAndTortoise.ListNode third = new HareAndTortoise.ListNode(3);
        head.next = second;
        second.next = third;
        third.next = second; // cycle back to second
        assertTrue(HareAndTortoise.hasCycle(head));
    }

    @Test
    public void testNoCycle() {
        HareAndTortoise.ListNode head = new HareAndTortoise.ListNode(1);
        HareAndTortoise.ListNode second = new HareAndTortoise.ListNode(2);
        HareAndTortoise.ListNode third = new HareAndTortoise.ListNode(3);
        head.next = second;
        second.next = third;
        assertFalse(HareAndTortoise.hasCycle(head));
    }
}
