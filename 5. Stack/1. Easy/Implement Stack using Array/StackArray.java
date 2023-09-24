// Problem statement: Implement a stack using an array.

// Note: Stack is a data structure that follows the Last In First Out (LIFO) rule.

// Explanation: 

// push(): Insert the element in the stack.

// pop(): Remove and return the topmost element of the stack.

// top(): Return the topmost element of the stack

// size(): Return the number of remaining elements in the stack.
 
public class StackArray{
    static class Stack {
        private int[] s;
        private int N = 0;
       Stack(int capacity) {
           // Write your code here.
          s = new int[capacity];
       }
       public void push(int num) {
           // Write your code here.
           if(N < s.length)
           {
               s[N++] = num;
           }
       }
       public int pop() {
           if(N>0)
           {
               int item = s[--N];
               return item>=0?item:1;
           }
           return -1;
       }
       public int top() {
           // Write your code here.
             if(N>0){
               int item = s[N-1];
           return item>=0?item:-1;
           }
           return -1;   
       }
       public int isEmpty() {
           // Write your code here.
           return N==0?1:0;
       }
       public int isFull() {
           // Write your code here.
           return N == s.length?1:0;
       }
   }
}
// Time Complexity: O(N)

// Space Complexity: O(N)