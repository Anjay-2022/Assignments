package StackAndQueue;

public class LinkedListMain {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		System.out.println("adding to tail");
		list.append(56);
		list.append(30);
		list.append(70);
		list.append(75);
		list.append(80);
		list.append(92);
		list.display();
		System.out.println("\nadding to head");
		list.add(56);
		list.add(30);
		list.add(70);
		list.add(75);
		list.add(80);
		list.add(92);
		list.display();
		
		System.out.println();
		
		
		System.out.println("first in the list poped ");
		System.out.println(list.pop());
		list.display();
		System.out.println("\nfirst in the list poped ");
		System.out.println(list.pop());
		list.display();
		System.out.println("\nfirst in the list poped ");
		System.out.println(list.pop());
		list.display();
		
		System.out.println("\nPoping from last");
		list.display();
		System.out.println("\n"+list.popLast());
		list.display();
		System.out.println("\nPoping from last");
		System.out.println(list.popLast());
		list.display();
		System.out.println("\nPoping from last");
		System.out.println(list.popLast());
		list.display();
		
	System.out.println("\nSearching for 70  opration");	
		if (list.search(70) != null) {
			System.out.println("data found");
		} else {
			System.out.println("data not found");
		}
		
	    System.out.println("Inserating node in btw 56 and 56");	
		System.out.println(list.insertAfter(56, 40));
		list.display();
		
		
		
		System.out.println("\n poping 30 from list");
		list.popElement(30);
		list.display();
		
		
		
		System.out.println("\nSize of list");
		System.out.println(list.size());

	}
}
