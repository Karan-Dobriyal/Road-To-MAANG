// Implement Queue Using Array

// Problem Statement: Implement Queue Data Structure using Array with all functions like pop, push, top, size, etc.

// Example:

// Input: push(4)
//        push(14)
//        push(24)
//        push(34)
//        top()
//        size()
//        pop()

// Output: 

// The element pushed is 4
// The element pushed is 14
// The element pushed is 24
// The element pushed is 34
// The peek of the queue before deleting any element 4
// The size of the queue before deletion 4
// The first element to be deleted 4
// The peek of the queue after deleting an element 14
// The size of the queue after deleting an element 3

public class QueueArray {
    class Queue {
        int front, rear;
        int []arr;
        int size ;
        int count ;
        Queue() {
            front = 0;
            rear = 0;
            arr = new int[100001];
            size = arr.length;
            count = 0;
        }

        // Enqueue (add) element 'e' at the end of the queue.
        public void enqueue(int e) {
            // Write your code here.
            if(count == size){
                return;
            }
            arr[rear%size] = e;
            rear++;
            count++;
            
        }

        // Dequeue (retrieve) the element from the front of the queue.
        public int dequeue() {
            // Write your code here.
            if(count == 0){
                return -1;
            }
            int removed = arr[front%size];
            front++;
            count--;
            return removed;
        }
    }
}