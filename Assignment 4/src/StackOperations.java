public interface StackOperations<I> {

    void push(I item);
    void pop();
    I peek();
    int size();
    boolean isEmpty();
}
