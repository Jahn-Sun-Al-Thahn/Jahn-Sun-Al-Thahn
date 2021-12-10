public class Stocks {
	private String stockName;
	private String Symbol;
	private String Sector;
	private String industry;
	private double oneYearTarget;
	private double todaysLows;
	private int shareValue;
	private int averageVolume;
	private long marketCap;
	private double PEratio;
	private double currentPrice;
	private double shareChange;
	private double lastPrice;
	
	public Stocks() {
		
	}
	
	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public String getSymbol() {
		return Symbol;
	}

	public void setSymbol(String symbol) {
		Symbol = symbol;
	}

	public String getSector() {
		return Sector;
	}

	public void setSector(String sector) {
		Sector = sector;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public double getOneYearTarget() {
		return oneYearTarget;
	}

	public void setOneYearTarget(double oneYearTarget) {
		this.oneYearTarget = oneYearTarget;
	}

	public double getTodaysLows() {
		return todaysLows;
	}

	public void setTodaysLows(double todaysLows) {
		this.todaysLows = todaysLows;
	}

	public int getShareValue() {
		return shareValue;
	}

	public void setShareValue(int shareValue) {
		this.shareValue = shareValue;
	}

	public int getAverageVolume() {
		return averageVolume;
	}

	public void setAverageVolume(int averageVolume) {
		this.averageVolume = averageVolume;
	}

	public long getMarketCap() {
		return marketCap;
	}

	public void setMarketCap(long marketCap) {
		this.marketCap = marketCap;
	}

	public double getPEratio() {
		return PEratio;
	}

	public void setPEratio(double pEratio) {
		PEratio = pEratio;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public double getShareChange() {
		return shareChange;
	}

	public void setShareChange(double shareChange) {
		this.shareChange = shareChange;
	}

	public double getLastPrice() {
		return lastPrice;
	}

	public void setLastPrice(double lastPrice) {
		this.lastPrice = lastPrice;
	}


	
}