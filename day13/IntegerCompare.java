package day13;

import java.util.Scanner;

public class IntegerCompare {
	public static void largest(int num1, int num2, int num3) {
		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println(num1+" is greater");
			} else {
				System.out.println(num3+" is greater");
			}
		} else if (num2 > num3) {
			System.out.println(num2+" is greater");
		}else
			System.out.println(num3+" is greater");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three number");

		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		largest(number1, number2, number3);
	}

}
