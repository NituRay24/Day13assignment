package Deckcards;
// making class
public class Stock {
    private String stockName;
    private int noOfShares;
    private double sharePrice;
    private double shareTotalValue;

     //making get method
    public String getStockName() {
        return stockName;
    }
 // making set method to set the value
    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getNoOfShares() {
        return noOfShares;
    }

    public void setNoOfShares(int noOfShares) {
        this.noOfShares = noOfShares;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }

    public void setShareTotalValue(int noOfShares,double sharePrice) {
        shareTotalValue = noOfShares * sharePrice;
    }

    public double getShareTotalValue() {
        return this.shareTotalValue;
    }
}
