package TradingRiskManagerNew;

public class Trade {
	
	//All Fields for each trade
	private int tradeID;
	private static int nextTradeID = 1;
	private String ticker;
	private String direction;
	private double strike;
	private double entryPrice;
	private double stopLoss;
	private double takeProfit;
	private String strategyUsed;
	

	//Constructor
	public Trade(String ticker, String direction, double strike, double entryPrice, 
			     double stopLoss, double takeProfit, String strategyUsed) 
	{
		this.tradeID = nextTradeID;
		nextTradeID++;
		setTicker(ticker);
		setDirection(direction);
		this.strike = strike;
		this.entryPrice = entryPrice;
		this.stopLoss = stopLoss;
		this.takeProfit = takeProfit;
		this.strategyUsed = strategyUsed;
		
	}
	
	//Second Constructor to handle with existing trades
	public Trade(int tradeID, String ticker, String direction, double strike, 
			     double entryPrice, double stopLoss, double takeProfit, String strategyUsed)
	{ 
		this.tradeID = tradeID;
		setTicker(ticker);
		setDirection(direction);
		this.strike = strike;
		this.entryPrice = entryPrice; 
		this.stopLoss = stopLoss;
		this.takeProfit = takeProfit;
		this.strategyUsed = strategyUsed;
		
		//If statement make sure that next brand new trade gets new ID and doesn't end up sharing ID with any previous trades
		if(tradeID >= nextTradeID)
		{
			nextTradeID = tradeID + 1;
		}
	}
	
	//Getter to return ticker name
	public String getTicker()
	{
		return ticker;
	}
	
	//Getter to return whether call or puts
	public String getDirection()
	{
		return direction;
	}
	
	//Getter to return strike price
	public double getStrike()
	{
		return strike;
	}
	
	//Getter to return entry price
	public double getEntryPrice()
	{
		return entryPrice;
	}
	
	//Getter to return stop loss
	public double getStopLoss()
	{
		return stopLoss;
	}
	
	//Getter to return take profit
	public double getTakeProfit()
	{
		return takeProfit;
	}
	
	//Getter to return strategy used 
	public String getStrategyUsed()
	{
		return strategyUsed;
	}
	
	//Getter to return trade ID#
	public int getTradeID()
	{
		return tradeID;
	}
	
	//Method printing all information for trade
	@Override
	public String toString()
	{
		return "\nTrade ID#: " + getTradeID() 
		    + "\nTicker: " + getTicker() 
		    + "\nDirection: " + getDirection() 
		    + "\nStrike: " + getStrike() 
		    + "\nEntry Price: " + getEntryPrice()  
		    + "\nStop Loss: " + getStopLoss() 
		    + "\nTake Profit: " + getTakeProfit() 
		    + "\nStrategy Used: " + getStrategyUsed();
			
	} 
	
	//Converts trade into one line that can be written into a CSV(Comma Separated Values) file to store data of old trades
	public String toCSV()
	{
		return getTradeID() + ","
			 + getTicker() + ","
			 + getDirection() + ","
			 + getStrike() + ","
			 + getEntryPrice() + ","
			 + getStopLoss() + ","
			 + getTakeProfit() + ","
			 + getStrategyUsed() + ",";
	}
	//Setter to edit ticker name
	public void setTicker(String ticker)
	{
		this.ticker = ticker.toUpperCase();
	}
	
	//Setter to edit direction
	public void setDirection(String direction)
	{
		this.direction = direction.substring(0,1).toUpperCase() 
				         + direction.substring(1).toLowerCase() ;
	}
	
	//Setter to edit Strike price
	public void setStrike(double strike)
	{
		this.strike = strike;
	}
	
	//Setter to edit entry price
	public void setEntryPrice(double entryPrice)
	{
		this.entryPrice = entryPrice;
	}
	
	//Setter to edit stop loss
	public void setStopLoss(double stopLoss)
	{
		this.stopLoss = stopLoss;
	}
	
	//Setter to edit take profit
	public void setTakeProfit(double takeProfit)
	{
		this.takeProfit = takeProfit;
	}
	
	//Setter to edit strategy Used
	public void setStrategyUsed(String strategyUsed)
	{
		this.strategyUsed = strategyUsed;
	}
}

