// Given a linked list and a key ‘X‘ in, the task is to check if X is present in the linked list or not. 

// Examples:

// Input: 14->21->11->30->10, X = 14
// Output: 1
// Explanation: 14 is present in the linked list.

// Input: 6->21->17->30->10->8, X = 13
// Output: 0

public class SearchElementInLL {
    public static void main(String[] args)
    {
        Node temp = head;
        while(temp != null)
        {
            if(temp.data == k) System.out.println(1);
            temp = temp.next;
        }
        System.out.println(0);
    }
}

// Time Complexity : O(N) and Space Complexity : O(1)
