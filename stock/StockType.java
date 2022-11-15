package stock;

public class StockType extends StockPortfolio {
	private String sharename;
	private int balanceShare;
	private int lastamountpurchase;
	private int lastnumberpurchase;
	private int lastamountsale;
	private int lastnumbersale;
	private int totalvalue;
	private int purchase;
	private int sale;

	public String getShareName() {
		return sharename;
	}

	public int getBalanceShare() {
		return balanceShare;
	}

	public void setShareName(String sharename) {
		this.sharename = sharename;
	}

	public int purchaseShare(int amount, int number) {
		lastnumberpurchase = number;
		lastamountpurchase = amount;
		purchase = (number * amount);
		totalvalue = totalvalue + purchase;
		balanceShare = balanceShare + lastnumberpurchase;
		return purchase;
	}

	public int saleShare(int amount, int number) {
		lastnumbersale = number;
		lastamountsale = amount;
		sale = (number * amount);
		totalvalue = totalvalue - sale;
		balanceShare = balanceShare - lastnumbersale;
		return sale;
	}
	@Override
	public String toString() {
		return "Sharereport [sharename=" + sharename + ", balanceShare=" + balanceShare + ", lastamountpurchase="
				+ lastamountpurchase + ", lastnumberpurchase=" + lastnumberpurchase + ", lastamountsale="
				+ lastamountsale + ", lastnumbersale=" + lastnumbersale + ", totalvalue=" + totalvalue + "]";
	}

}
