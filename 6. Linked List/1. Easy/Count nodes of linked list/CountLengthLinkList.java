/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
    
     Node()
     {
         this.data = 0;
         this.next = null;
     }
    
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
    
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/ 
public class CountLengthLinkList {
    public static void main(String[] args)
    { 

    }
    public static int length(Node head)
    {
        int counter = 0;
        Node temp = head;
        while(temp !=null)
        {
            counter++;
            temp = temp.next;
        } 
    return counter;
    }
}
// Time Complexity : O(N) and Space Complexity : O(1)
