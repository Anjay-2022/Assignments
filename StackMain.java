package StackAndQueue;

public class StackMain {
	public static void main(String[] args) {

		Stack stack = new Stack();
		System.out.println("Creating stack for 56,30 & 70");
		stack.push(56);
		stack.push(30);
		stack.push(70);
		stack.push(75);
		stack.push(80);
		stack.print();
		System.out.println("\nPoping element   type LIFO");
		System.out.println(stack.pop());
		stack.print();
		System.out.println("\nPoping element");
		System.out.println(stack.pop());
		
		stack.print();
		
		
		
		System.out.println("\nPeeping operation :It is used for retrive last entered element");
		System.out.println(stack.peek());
		System.out.println("\n Current stack after peeping opration is ..");
		stack.print();

	}

}
