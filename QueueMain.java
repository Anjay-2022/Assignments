package StackAndQueue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        System.out.println("Creating Queue for 56,30 & 70");
        queue.append(56);
        queue.append(30);
        queue.append(70);
        queue.append(60);
        queue.append(93);
        queue.print();
        
        System.out.println("\nPoping first element");
        System.out.println(queue.popFirst());
        queue.print();
        System.out.println("\n"+queue.popFirst());
        queue.print();
        System.out.println("\nPeeping head");
        System.out.println( queue.peek());
        System.out.println();
        queue.print();

        System.out.println();
        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.popLast();
            queue.print();
            System.out.println();
        }

    }
}
