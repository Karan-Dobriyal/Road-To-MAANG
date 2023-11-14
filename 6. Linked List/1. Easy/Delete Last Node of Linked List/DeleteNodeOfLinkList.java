// Delete Last Node of Linked List
// Problem Statement: Given a Singly LinkedList, Delete the Last Node in the LinkedList.

// Examples:

// Example 1:
// Input: List = 10->20->30->40->null
// Output: 10->20->30->null
// Explanation: Deleted the last node of the linked list.

// Example 2:
// Input: List = 100->200->300->null
// Output: 100->200->null
// Explanation: Deleted the last node of the linked list


import java.util.*;

class ListNode {

  int val;
  ListNode next;
  ListNode(int x) {
    val = x;
    next = null;
  }
}
class DeleteNodeOfLinkList {

  static ListNode head, tail; // head and tail of the LinkedList

  static void PrintList() // Function to print the LinkedList
  {
    ListNode curr = head;
    for (; curr != null; curr = curr.next)
      System.out.print(curr.val + "-->");
    System.out.println("null");
  }

  static void InsertatLast(int value) // Function for creating a LinkedList
  {

    ListNode newnode = new ListNode(value);
    if (head == null) {
      head = newnode;
      tail = newnode;
    } else
      tail = tail.next = newnode;
  }

  static void DeleteLast() {
    if (head == null)
      System.out.println("There are no nodes to delete in LinkedList");

    // If there is single node, delete that and make head point to null
    if (head.next == null) {
      head = null;
    } else {

      // step1: Finding First and Second Last Node in LinkedList

      ListNode curr = head, prev = null;
      while (curr.next != null) {
        prev = curr;
        curr = curr.next;
      }

      // Step2 : Pointing prev->next to nullptr

      prev.next = null;

    }
  }

  public static void main(String args[]) {
    InsertatLast(10);
    InsertatLast(20);
    InsertatLast(30);
    InsertatLast(40);
    System.out.println("LinkedList before Deleting Last Node : ");
    PrintList();
    DeleteLast();
    System.out.println("LinkedList after Deleting Lastt Node : ");
    PrintList();
  }
 }
// Time Complexity: O(N) Because we are traversing the LinkedList to find out the first and second 
// Last Nodes in LinkedList. N is the No of Nodes in LinkedList. 

// Space Complexity: O(1) We are not using any extra space.