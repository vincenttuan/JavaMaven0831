package day10_collection;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(80);
        stack.push(90);
        System.out.println("Stack: " + stack);
        
        while (!stack.isEmpty()) {
            int data = stack.pop();
            System.out.print("得到: " + data + ", ");
            System.out.println("Stack: " + stack);
        }
        System.out.println("Stack: " + stack);
    }
}
