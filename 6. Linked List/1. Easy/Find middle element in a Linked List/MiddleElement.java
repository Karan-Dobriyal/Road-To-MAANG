// Find middle element in a Linked List
// Problem Statement: Given the head of a singly linked list, return the middle node of the linked list.
//If there are two middle nodes, return the second middle node.

// Examples:

// Input Format: 
// ( Pointer / Access to the head of a Linked list )
// head = [1,2,3,4,5]

// Result: [3,4,5]
// ( As we will return the middle of Linked list the further linked list will be still available )

// Explanation: The middle node of the list is node 3 as in the below image.

// Intuition: In the Tortoise-Hare approach, we increment slow ptr by 1 and fast ptr by 2, so if take a
//  close look fast ptr will travel double that of the slow pointer. So when the fast ptr will be at the
//   end of the Linked List, slow ptr would have covered half of the Linked List till then. So slow ptr will
//    be pointing towards the middle of Linked List.

// Approach: 

// Create two pointers slow and fast and initialize them to a head pointer.
// Move slow ptr by one step and simultaneously fast ptr by two steps until fast ptr is NULL or next
//  of fast ptr is NULL.
// When the above condition is met, we can see that the slow ptr is pointing towards the middle of the
//  Linked List and hence we can return the slow pointer.

class MiddleElement {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast.next != null)
        {
            return slow.next;
        }
        return slow;
    }
}
// Time Complexity: O(N)

// Space Complexity: O(1)