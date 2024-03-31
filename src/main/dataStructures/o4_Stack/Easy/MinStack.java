package dataStructures.o4_Stack.Easy;

import java.util.Stack;

public class MinStack {

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(512);
        minStack.push(-1024);
        minStack.push(-1024);
        minStack.push(512);
        minStack.pop();
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
       /* minStack.push(2);
        minStack.push(0);
        minStack.push(3);
        minStack.push(0);
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
        minStack.pop();
        minStack.getMin();*/

        /*minStack.push(0);
        minStack.push(1);
        minStack.push(0);
        minStack.getMin();
        minStack.pop();
        minStack.getMin();*/
        /*["MinStack","push","push","push","getMin","pop","getMin"]
        [[],[0],[1],[0],[],[],[]]
        */
        /*minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin(); // return -3
        minStack.pop();
        minStack.getMin(); // return -3
        minStack.top();    // return 0*/
    }

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minVal_stack = new Stack<>();

    public void push(int val) {
        stack.push(val);

        if (minVal_stack.empty() || val <= getMin())
            minVal_stack.push(val);

    }

    public void pop() {
        Integer popVal =null;
        if (!stack.empty()) {
            popVal = stack.pop();
        }
        if ((!minVal_stack.empty()) && popVal.equals(minVal_stack.peek())) {
            minVal_stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        if (!minVal_stack.empty()) {
            System.out.println("getMin: " + minVal_stack.peek()); // return -2
            return minVal_stack.peek();
        }
        else
            return 0;
    }
}