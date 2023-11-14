// Problem Statement: Given head, the head of a linked list, determine if the linked list has
//  a cycle in it. There is a cycle in a linked list if there is some node in the list that can be reached
//   again by continuously following the next pointer.

// Return true if there is a cycle in the linked list. Otherwise, return false.

// Examples:

// Example 1:
// Input:
//  Head = [1,2,3,4]
// Output:
//  true
// Explanation: Here, we can see that we can reach node at position 1 again by following the next
//  pointer. Thus, we return true for this case.

public class DetectCycle {
    public boolean hasCycle(ListNode head) {
       if(head == null) return false;
    ListNode fast = head;
    ListNode slow = head;
        
    while(fast.next != null && fast.next.next != null) {
        fast = fast.next.next;
        slow = slow.next;
        if(fast == slow) return true;
    }
    return false;
    }
}

// Time Complexity: O(N)

// Reason: In the worst case, all the nodes of the list are visited.

// Space Complexity: O(1)