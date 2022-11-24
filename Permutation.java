package day16_17;

import java.util.ArrayList;
import java.util.Scanner;

public class Permutation {
	static ArrayList<String> arl = new ArrayList<>();
	static ArrayList<String> arr = new ArrayList<String>();

	public static String swapString(String a, int i, int j) {
		char[] b = a.toCharArray();
		char ch;
		ch = b[i];
		b[i] = b[j];
		b[j] = ch;
		return String.valueOf(b);
	}

	public static void generatePermutation(String str, int start, int end) {
		// Prints the permutations
		if (start == end - 1) {
			arl.add(str);
		} else {
			for (int i = start; i < end; i++) {
				// Swapping the string by fixing a character
				str = swapString(str, start, i);
				// Recursively calling function generatePermutation() for rest of the characters
				generatePermutation(str, start + 1, end);
				// Backtracking and swapping the characters again.
				str = swapString(str, start, i);
			}
		}
	}

	public static void permutations(String s) {

		arr.add(String.valueOf(s.charAt(0)));

		for (int i = 1; i < s.length(); i++) {

			for (int j = arr.size() - 1; j >= 0; j--) {
				String str = arr.remove(j);

				for (int k = 0; k <= str.length(); k++) {
					arr.add(str.substring(0, k) + s.charAt(i) + str.substring(k));
				}
			}
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String name = scan.nextLine();
		permutations(name);
		generatePermutation(name, 0, name.length());
		int i = 0;
		for (; i < arr.size(); i++) {
			System.out.println(arr.get(i) + " " + arl.get(i));
		}

		if (arr.equals(arl)) {
			System.out.println("both are same" + "and the number of permutations are " + i);
		} else {
			System.out.println("Occurance of equal string is Zero");
		}

	}

}
