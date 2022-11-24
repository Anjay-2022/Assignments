package day16_17;

import java.util.Scanner;

public class Anagram {

	public static char[] sortArray( char[] array) {
		char temp;
		for(int i=0;i<array.length;i++){
		for(int j=i+1;j<array.length;j++){
		if(array[i] > (array[j])){
		temp = array[i];
		array[i]=array[j];
		array[j]=temp;
		}
		}
		}
		return array;
	}

	public static void isAnagram(String string1, String string2) {
		char[] array1 = new char[string1.length()];
		char[] array2 = new char[string2.length()];

		if (string1.length() == string2.length()) {
			for (int i = 1; i < string1.length(); i++) {
				array1[i] = string1.charAt(i);
				array2[i] = string2.charAt(i);
			}
			char[] sortedArray1 = sortArray(array1);
			char[] sortedArray2 = sortArray(array2);
			
			String stringfirst = new String(sortedArray1); 
			String stringsecond = new String(sortedArray2); 
			System.out.println("Sorted Strings are  '"+stringfirst+"'  and  '"+stringsecond+"'");
			
			if(stringfirst.equalsIgnoreCase(stringsecond)) {
				System.out.println("YES STRINGS ARE ANAGRAM ");
			}

		} else {
			System.out.println("Strings are not Anagram");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String string1 = scan.nextLine();
		System.out.println("Enter another String");
		String string2 = scan.nextLine();
		isAnagram(string1, string2);
	}

}
