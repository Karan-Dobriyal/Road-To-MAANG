// Example 1:

// Input: List = 10->20->30->40->null, Node = 0
// Output: 0->10->20->30->40->null
// Explanation: Inserted the given node at the beginning of the linked list.

// Example 2:
// Input: List = 100->200->300->null, Node =700
// Output: 700->100->200->300->null
// Explanation: Inserted the given node at the beginning of the linked list.

import java.util.*;

class ListNode {

  int val;
  ListNode next;
  ListNode(int x) {
    val = x;
    next = null;
  }
}

class InsertatFirst {
  static void PrintList(ListNode head) // Function to print the LinkedList
  {
    ListNode curr = head;
    for (; curr != null; curr = curr.next)
      System.out.print(curr.val + "-->");
    System.out.println("null");
  }

  static ListNode InsertatFirsts(int value, ListNode head) {

    // Step1 : creating a new Node with the given val
    ListNode newnode = new ListNode(value);

    // Step2 : Making next of newly created Node to point the head of LinkedList
    newnode.next = head;

    // Making the newly created Node as head
    head = newnode;
    return head;
  }

  public static void main(String args[]) {
    ListNode head = null; // head of the LinkedList
    head = InsertatFirsts(40, head);
    head = InsertatFirsts(30, head);
    head = InsertatFirsts(20, head);
    head = InsertatFirsts(10, head);
    System.out.println("LinkedList before inserting 0 at beginning : ");
    PrintList(head);
    head = InsertatFirsts(0, head);
    System.out.println("LinkedList after inserting 0 at beginning : ");
    PrintList(head);
  }
}

// Time Complexity:  O(1) Because we are just Manipulating the links, which is a constant operation.

// Space Complexity: O(1) We are not using any extra space.