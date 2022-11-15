package day13;

public class LargestSmallestGenerics <E extends Comparable<E>> {
	E max;
	E min;
	
	public static  <E extends Comparable<E>> void max(E[] array) {
		E largest = array[0];
		for (int j = 1; j < array.length; j++) {
			if (array[j].compareTo(largest) >= 0)

				largest = array[j];
		}
		System.out.println(largest);
	}

	public static  <E extends Comparable<E>> void min(E[] array) {
		E smallest = array[0];
		for (int j = 1; j < array.length; j++) {
			if (array[j].compareTo(smallest) <= 0)

				smallest= array[j];
		}
		System.out.println(smallest);
	}
	
	

	public static void main(String[] args) {
		Integer[] array = { 1, 2, 3, 7, 98, 65, 34, 987 };
		LargestSmallestGenerics.max(array);
		LargestSmallestGenerics.min(array);
		Character[] arraychar = { 'a','b','f','t','z' };
		LargestSmallestGenerics.max(arraychar);
		LargestSmallestGenerics.min(arraychar);
		String[] arraystring = { "anjay","anjaysingh","golu","charu","zaheer" };
		LargestSmallestGenerics.max(arraystring);
		LargestSmallestGenerics.min(arraystring);
		Double[] arraydouble = { 1.14, 2.154, 32.25, 7215.1, 98.155, 65.2458, 34.24855584, 987.2455415 };
		LargestSmallestGenerics.max(arraydouble);
		LargestSmallestGenerics.min(arraydouble);


	}

}
