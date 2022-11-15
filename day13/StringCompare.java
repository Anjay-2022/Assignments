package day13;

import java.util.Scanner;

public class StringCompare {
public static void compare(String word1,String word2,String word3) {
		
		if (word1.compareTo(word2) >= 0) {
			if (word1.compareTo(word3) >= 0) {
				System.out.println(word1+" is greater");
			} else {
				System.out.println(word3+" is greater");
			}
		} else if (word2.compareTo(word3) >= 0) {
			System.out.println(word2+" is greater");
		}else
			System.out.println(word3+" is greater");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three String");
		String string1=sc.next();
		String string2=sc.next();
		String string3=sc.next();
		compare(string1,string2,string3);	
}

}
