package kr.or.chan.productprice;

public class ProductPrice {
	private String priceTypeName;
	private int price;
	private double discountRate;

	public String getPriceTypeName() {
		return priceTypeName;
	}

	public void setPriceTypeName(String priceTypeName) {
		this.priceTypeName = priceTypeName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	@Override
	public String toString() {
		return "Price [priceTypeName=" + priceTypeName + ", price=" + price + ", discountRate=" + discountRate + "]";
	}
}