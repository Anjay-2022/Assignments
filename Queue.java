package StackAndQueue;

public class Queue <T> {
    LinkedList<T> list = new LinkedList<>();

    void append(T key){
        list.append(key);
    }
    public T popFirst(){
        return list.popFirst();
    }

    public T popLast(){
        return list.pop();
    }

    public T peek(){
        return list.peek();
    }

    public boolean isEmpty(){
        if(list.size() == 0){
            return  true;
        }else{
            return false;
        }

    }



    void print(){
        list.display();
    }
}
