package StackAndQueue;

public class Node <T>{
    public T key;
    public Node<T> next;

    public Node(T key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", next=" + next +
                '}';
    }
}
