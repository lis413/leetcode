package ru.lis154;

import java.util.LinkedList;
import java.util.List;

public class ImplementStackUsingQueues {

    public static void main(String[] args) {
        /**
         * Your MyStack object will be instantiated and called as such:

         */

        MyStack obj = new MyStack();
        obj.push(10);
        obj.push(9);
        obj.push(8);
        int param_2 = obj.pop();
        int param_3 = obj.top();
        boolean param_4 = obj.empty();
    }


}

class MyStack {
    List<Integer> list = new LinkedList<>();
    public MyStack() {

    }

    public void push(int x) {
        list.add(x);
    }

    public int pop() {
        int x = list.get(list.size()-1);
        list.remove(list.size()-1);
        return x;
    }

    public int top() {
        return list.get(list.size()-1);
    }

    public boolean empty() {
        return list.size() == 0;
    }
}
