package stock;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {
	private String accountName;
	protected int balance;
	private int deposit;
	private int withdraw;
	ArrayList<StockType> list2 = new ArrayList<StockType>();

	public void accountdetails() {
		System.out.println("Account name     :"+accountName);
		System.out.println("Account balance  :"+balance);
		System.out.println("Last deposit     :"+deposit);
		System.out.println("Last Withdraw    :"+withdraw);
	}

	@Override
	public String toString() {
		return "StockPortfolio [accountName=" + accountName + ", balance=" + balance + ", deposit=" + deposit
				+ ", withdraw=" + withdraw + "]";
	}

	public void Purchase() {
		Scanner sc = new Scanner(System.in);
		StockType stocktype = new StockType();
		System.out.println("Enter the name of share.");
		String sharename = sc.next();
		boolean check = false;
		if (list2.size() > 0) {
			for (int i = 0; i < list2.size(); i++) {
				if (list2.get(i).getShareName().equals(sharename)) {
					check = true;
					System.out.println("Enter the amount to purachase share.");
					int amount = sc.nextInt();
					System.out.println("Enter the Number of share.");
					int number = sc.nextInt();
					int totalvalue = amount * number;
					System.out.println("balance" + balance + "total value" + totalvalue);
					if (totalvalue <= balance) {
//						list2.get(i).setPriceOfShare(amount);
//						list2.get(i).setNumberOfShare(number);
						balance =balance - totalvalue;
						list2.get(i).purchaseShare(amount, number);
						System.out.println("Share purchased " + totalvalue + " lastpurchase.");
						break;
					} else
						System.out.println("Add more money.");

				} 
			} if (check == false) {
					stocktype.setShareName(sharename);
					System.out.println("Enter the amount to purachase share.");
					int amount = sc.nextInt();
					System.out.println("Enter the Number of share.");
					int number = sc.nextInt();
					int totalvalue = amount * number;
					if (totalvalue <= balance) {
//						stocktype.setPriceOfShare(amount2);
//						stocktype.setNumberOfShare(number2);
						balance =balance - totalvalue;
						stocktype.purchaseShare(amount, number);
						System.out.println("Share purchased " + totalvalue + " lastpurchase.");

						list2.add(stocktype);

					} else
						System.out.println("Add money first.");
			}

		} else {
			stocktype.setShareName(sharename);
			System.out.println("Enter the amount to purachase share.");
			int amount = sc.nextInt();
			System.out.println("Enter the Number of share.");
			int number = sc.nextInt();
			int totalvalue = amount * number;
			if (totalvalue <= balance) {
//				stocktype.setPriceOfShare(amount2);
//				stocktype.setNumberOfShare(number2);
				balance =balance - totalvalue;
				stocktype.purchaseShare(amount, number);
				System.out.println("Share purchased " + totalvalue + " lastpurchase.");

				list2.add(stocktype);

			} else
				System.out.println("Add money first.");
		}

	}

	public void sale() {
		Scanner sc = new Scanner(System.in);
		StockType stocktype = new StockType();
		System.out.println("Enter the name of share.");
		String sharename = sc.next();
		if (list2.size() > 0) {
			for (int i = 0; i < list2.size(); i++) {
				if (list2.get(i).getShareName().equals(sharename)) {
					System.out.println("Enter the amount to  share for sale.");
					int amount = sc.nextInt();
					System.out.println("Enter the Number of share.");
					int number = sc.nextInt();
					int totalvalue = amount * number;
					if (totalvalue > 0) {
						list2.get(i).saleShare(amount, number);
						balance =balance + totalvalue;
						System.out.println("Share sale of " + totalvalue + " totalvalue.");
						break;
					}

				}
			}

		} else
			System.out.println("You have no share.");
	}

	public void display() {
		Scanner sc = new Scanner(System.in);
		StockType stocktype = new StockType();
		if (list2.size() > 0) {
			System.out.println("Enter option:-\n1.Search for single stock\n2.Display All\n3.Back ");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("Enter the Stock name to display.");
				String name = sc.next();
				boolean check = false;

				for (int i = 0; i < list2.size(); i++) {
					if (list2.get(i).getShareName().equals(name)) {
						check = true;
						System.out.println("details are :-" + list2.get(i).toString());
						break;
					}
				}
				if (check == false) {
					System.out.println("Stock name  not found in Directory.");
				}
				break;
			case 2:
				System.out.println("Details of all share.");
				for (StockType i : list2) {
					System.out.println(i);
				}
				break;
			case 3:
				break;
			}
		} else
			System.out.println("Stock directory is empty.");
	}

	public void deleteShare() {
		if (list2.size() > 0) {
			for (int i = 0; i < list2.size(); i++) {
				if (list2.get(i).getBalanceShare() == 0) {
					StockType account = list2.get(i);
					list2.remove(account);
					// System.out.println("Share removed");
					break;
				}
			}
		}
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public void setWithdraw(int withdraw) {
		
		if(balance > withdraw) {
			this.withdraw = withdraw;
			balance = balance - withdraw;
		} else
			System.out.println("Withdraw amount is greater than balance");
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
		balance = balance + deposit;

	}

//     public  void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     StockPortfolio account = new StockPortfolio();
//     System.out.println("-----Welcome to Personal stock Account------");
//		account.accountdetails();
//		boolean run = true;
//
//		while (run == true) {
//			System.out.println(
//					"Enter option :-\n1.Details of Account\n2.Purchase share\n3.Sale Share\n4.Share summary\n5.Add Money\n6.Withdraw Money\n7.Logout");
//			int option = sc.nextInt();
//			switch (option) {
//			case 1:
//				//portfolio.accountdetails();
//				break;
//			case 2:
//				//portfolio.Purchase();
//				break;
//			case 3:
//				//portfolio.sale();
//				break;
//			case 4:
//				//portfolio.display();
//				break;
//			case 5:
//				System.out.println("Enter the amount to add");
//				//portfolio.setDeposit(sc.nextInt());
//				break;
//			case 6:
//				System.out.println("Enter the amount to withdraw");
//				//portfolio.setWithdraw(sc.nextInt());
//				break;
//			case 7:
//				run = false;
//				break;
//			}
//	}
//	}
}
