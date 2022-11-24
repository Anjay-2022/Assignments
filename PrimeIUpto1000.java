package day16_17;

import java.util.Scanner;

public class PrimeIUpto1000 {

	public static void prime(int start, int range) {
		int count;
		for (int num = start; num <= range; num++) {
			count = 0;
			if (num <= 1) {
				continue;
			}
			for (int j = 2; j <= num / 2; j++) {
				if (num % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.print(num + "-This no is prime");
				if (num > 10) {
					int rev = 0;
					for (int i = num; i > 0; i = i / 10) {
						rev = (rev * 10) + (i % 10);
					}
					if (num == rev) {
						System.out.print(" and also palindrome\n");
					} else
						System.out.print(" but not  palindrome\n");
				} else
					System.out.print(" but not  palindrome\n");
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter start limit");
		int start = scan.nextInt();
		System.out.println("Enter stop limit");
		int stop = scan.nextInt();
		prime(start, stop);
	}

}
