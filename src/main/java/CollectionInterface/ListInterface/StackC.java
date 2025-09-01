package CollectionInterface.ListInterface;

import java.util.Collections;
import java.util.Stack;

public class StackC {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("abc");
        stack.push("Hii");
        stack.push("Hey");
        stack.push("def"); //Adds item to the top of stack, returns pushed element
        stack.add("ghi"); //Adds item to the end of list, returns boolean value
        System.out.println(stack);

        System.out.println("\nstack.empty() = " + stack.empty());

        System.out.println("\nstack.search(\"def\") = " + stack.search("def"));
        // returns distance from top of the stack

        System.out.println("\nstack.capacity() = " + stack.capacity());

        stack.trimToSize();

        System.out.println("\nstack.capacity() after trim= " + stack.capacity());

        stack.setSize(8);
        System.out.println("\nstack.size() after setSize() = " + stack.size());
        System.out.println("\nstack.capacity() after setSize() = " + stack.capacity());

        System.out.println("\n-----stack.removeElement()-----");
        System.out.println(stack.removeElement("def"));
        System.out.println(stack);

        System.out.println("\n-----stack.removeElementAt(1)-----");
        stack.removeElementAt(1);
        System.out.println(stack);

        System.out.println("\n-----Collections.reversed()-----");
        Collections.reverse(stack);
        System.out.println(stack);

        System.out.println("\n-----stack.removeAllElements()-----");
        stack.removeAllElements();
        System.out.println("stack.size() = " + stack.size());

        System.out.println("\nstack.isEmpty() = " + stack.isEmpty());

    }
}
