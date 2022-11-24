package day15;

public class Binary {
	Node root;
	int counter = 0;

	private Node addRecursive(Node current, int value) {
		if (current == null) {
			System.out.println("New node with value'" + value + "' created");
			return new Node(value);
		}

		if (value < current.value) {
			System.out.println("current'" + current.value + "' value'" + value + "'");
			current.left = addRecursive(current.left, value);
		} else if (value > current.value) {
			System.out.println("current'" + current.value + "' value'" + value + "'");
			current.right = addRecursive(current.right, value);
		} else {
			System.out.println("value is already present in tree");
			return current;
		}

		System.out.println("add returnig  current " + current.value);
		return current;

	}

	public Node add(int value) {

		root = addRecursive(root, value);
		System.out.println("Return to add method with root " + root.value);
		return root;
	}

	
	public void displayInOrder(Node node) {
		if (node == null) {
			return;
		}
		displayInOrder(node.left);
		System.out.printf("%s ", node.value);
		displayInOrder(node.right);
	}

	public void  search(Node node,int key) {
		if (node == null) {
			return;
		} else if (node.value == key) {
			System.out.println("YES THE ELEMENT IS PRESENT IN THE TREE");
			return ;
		}
		search(node.left,key);
		search(node.right,key);
		return;

	}	
}
