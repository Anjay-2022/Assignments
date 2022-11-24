package day16_17;

import java.util.Scanner;

public class BubbleSort {

	public static int[] bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
		return arr;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[10];
		for (int j = 0; j < 10; j++) {
			System.out.println("Enter " + j + " string");
			array[j] = scan.nextInt();
		}

		for (int i : array) {
			System.out.print(i + " ");
		}

		int sorted[] = bubbleSort(array);
		System.out.println("");

		for (int i : sorted) {
			System.out.print(i + " ");
		}
	}

}
