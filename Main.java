package day15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Binary bt = new Binary();
		Node root;
		bt.add(56);
		bt.add(30);
		bt.add(40);
		bt.add(22);
		bt.add(11);
		bt.add(16);
		bt.add(70);
		bt.add(60);
		bt.add(95);
		bt.add(65);
		bt.add(63);
		root = bt.add(67);

		System.out.println("PRINTING OF BINARY TREE IN ORDER");
		bt.displayInOrder(root);

		System.out.println("\nSEARCH IN TREE ");
		System.out.println("Enter value to  search");
		int key = read.nextInt();
		bt.search(root, key);

	}

}
