package pkg_stack;
import pkg_stack.Interface_STK;

import java.util.Vector;

public class Growable_stk implements Interface_STK{
    Vector<Integer> stack = new Vector<Integer>();
    @Override
    public void push(int a) {
        stack.add(a);
    }

    @Override
    public int pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty - Cannot remove element");
            return 0;
        }
        else
            return stack.remove(stack.size()-1); //.get method
    }

    @Override
    public void displayStkTop() {
        System.out.println("Stack top "+ stack.get(stack.size()-1));
    }

    @Override
    public void displayStk() {
        System.out.println("Stack elements");
        for(int i=0;i<stack.size();i++)
            System.out.print(stack.get(i)+" ");
        System.out.println("\n");
    }
}

