package day16_17;

import java.util.Scanner;

public class InsertionSort {

	public static String[] insertionSort(String[] array) {
		
		
		String temp;
		for(int i=0;i<array.length;i++){
		for(int j=i+1;j<array.length;j++){
		if(array[i].compareToIgnoreCase(array[j])>0){
		temp = array[i];
		array[i]=array[j];
		array[j]=temp;
		}
		}
		}
		return array;
	}

	public static void main(String a[]) {
		Scanner scan = new Scanner(System.in);

		String[] array = new String[10];
		for (int j = 0; j < 10; j++) {
			System.out.println("Enter " + j + " string");
			array[j] = scan.next();
		}

		System.out.println("Before Insertion Sort");
		for (String i : array) {
			System.out.print(i + " ");
		}
		System.out.println();

		String[] sortedArray = insertionSort(array);

		System.out.println("After Insertion Sort");
		for (String i : sortedArray) {
			System.out.print(i + " ");
		}
	}

}
