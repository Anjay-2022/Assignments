package day13;

import java.util.Scanner;

public class FloatCompare {
	public static void largest(double num1, double num2, double num3) {
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
		System.out.println("Enter three Double values");

		double number1 = sc.nextDouble();
		double number2 = sc.nextDouble();
		double number3 = sc.nextDouble();
		largest(number1, number2, number3);
	}


}
