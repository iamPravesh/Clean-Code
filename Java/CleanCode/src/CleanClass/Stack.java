package CleanClass;

import java.util.LinkedList;
import java.util.List;

public class Stack {
    private int topOfStack = 0;
    List<Integer> elements = new LinkedList<Integer>();

    public int size(){
        return topOfStack;
    }

    public void push(int element) {
        topOfStack++;
        elements.add(element);
    }

    public int pop() throws PoppedWhenEmpty {
        if(topOfStack == 0) {
            throw new PoppedWhenEmpty();
        }

        int element = elements.get(topOfStack - 1);
        elements.remove(topOfStack - 1);
        return element;
    }
}
