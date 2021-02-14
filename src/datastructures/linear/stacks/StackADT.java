package datastructures.linear.stacks;

public interface StackADT<E> {
    boolean push(E item);

    E pop();

    E peek();

    boolean isEmpty();
}
