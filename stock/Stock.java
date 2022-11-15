package stock;

import java.util.ArrayList;
import java.util.Scanner;

public class Stock {
	ArrayList<StockPortfolio> list = new ArrayList<StockPortfolio>();

	public void createAccount() {
		Scanner sc = new Scanner(System.in);
		StockPortfolio account = new StockPortfolio();

		System.out.println("Enter Account Name");
		account.setAccountName(sc.next());
		System.out.println("Enter Amount to deposit");
		account.setDeposit(sc.nextInt());

		list.add(account);
		System.out.println("Account Created.");
	}

	public void accountLogin() {
		Scanner sc = new Scanner(System.in);
		StockPortfolio account = new StockPortfolio();

		if (list.size() > 0) {
			System.out.println("Enter Account name");
			String name = sc.next();
			boolean check = false;

			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getAccountName().equals(name)) {
					check = true;
					System.out.println("-----Welcome to Personal stock Account------");
					list.get(i).accountdetails();
					boolean run = true;

					while (run == true) {
						System.out.println(
								"Enter option :-\n1.Details of Account\n2.Purchase share\n3.Sale Share\n4.Share summary\n5.Add Money\n6.Withdraw Money\n7.Logout");
						int option = sc.nextInt();
						switch (option) {
						case 1:
							list.get(i).accountdetails();
							break;
						case 2:
							list.get(i).Purchase();
							break;
						case 3:
							list.get(i).sale();
							break;
						case 4:
							list.get(i).display();
							break;
						case 5:
							System.out.println("Enter the amount to add");
							list.get(i).setDeposit(sc.nextInt());
							break;
						case 6:
							System.out.println("Enter the amount to withdraw");
							list.get(i).setWithdraw(sc.nextInt());
							break;
						case 7:
							run = false;
							break;
						}
					}
				}
			}
			if (check == false) 
				System.out.println("Account not found in Directory");
			 
			}else
				System.out.println("Create an account first");
		}
	
//	public void editAccount() {
//
//		Scanner sc = new Scanner(System.in);
//		StockPortfolio account = new StockPortfolio();
//		if (list.size() > 0) {
//			System.out.println("Enter the Account name to update");
//			String name = sc.next();
//			boolean check = false;
//
//			for (int i = 0; i < list.size(); i++) {
//				if (list.get(i).getAccountName().equals(name)) {
//					check = true;
//					System.out.println("Choose the option to update \n1.Update  name\n2.Back");
//					int option = sc.nextInt();
//					switch (option) {
//					case 1:
//						System.out.println("Enter  new  Update name");
//						list.get(i).setAccountName(sc.next());
//						break;
////					case 2:
////						//System.out.println("Enter  new Number of share");
////						//list.get(i).setNumberOfShare(sc.nextInt());
//						break;
////					case 3:
////						System.out.println("Enter new Price of share");
////						list.get(i).setPriceOfShare(sc.nextInt());
////						break;
//					}
//					// account.calculate();
//					System.out.println("Name updated");
//				}
//			}
//			if (check == false) {
//				System.out.println("Stock account  not found in Directory");
//			}
//
//		} else
//			System.out.println("Stock directory is empty");
//	}
	public void display() {
		if (list.size() > 0) {
			for (StockPortfolio i : list)
				System.out.println(i);
		} else
			System.out.println("Create an account first");

	}
	public void deleteAccount() {
		Scanner sc = new Scanner(System.in);

		if (list.size() > 0) {
			System.out.println("Enter the Stock name to delete");
			String name = sc.next();
			boolean check = false;

			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getAccountName().equals(name)) {
					check = true;
					StockPortfolio account = list.get(i);
					list.remove(account);
					System.out.println("Employee details deleted...");
					break;
				}
			}
			if (check == false)
				System.out.println("Account not found in Directory");

		} else
			System.out.println("Create an account first");

	}

	public static void main(String[] args) {
		System.out.println("Welcome to stock Account Program ");
		Stock stock = new Stock();
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println(
					"Choose the option \n1.Create account\n2.Login to Account\n3.Delete Account\n4.Display all Account\n5.Exit");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				stock.createAccount();
				break;
			case 2:
				stock.accountLogin();
				break;
			case 3:	
				stock.deleteAccount();
				break;
			case 4:
				stock.display();
				break;
			case 5 :
				run = false;
				break;
			default:
				System.out.println("choose correct option");
			}
		}

	}

}
