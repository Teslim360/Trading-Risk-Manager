package TradingRiskManagerNew;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class TradeManager {
	private ArrayList<Trade> trades;
	
	public TradeManager()
	{
		trades = new ArrayList<Trade>();
	}
	
	//Add trade to trade manager
	public void addTrade(Trade trade)
	{
		trades.add(trade);
	}
	
	//Prints all fields in the first trade
	public void printFirstTrade()
	{
		System.out.println(trades.get(0).toString());
	}
	
	//Method printing all trades using enhanced for loop
	public void printAllTrades()
	{
		for(Trade trade : trades)
		{
		System.out.println(trade);
		System.out.println("----------------------");
		}
		
	}
	
	//Method to search for trades by ticker returning first trade of that ticker
	public Trade findFirstTradeByTicker(String ticker)
	{
		for(Trade trade : trades)
		{
			if(trade.getTicker().equals(ticker.toUpperCase()))
			{
				return trade;
			}
		}
		return null;
	}
	
	//Method to search trade by ticker and return all trades from that ticker
	public ArrayList<Trade> findTradesByTicker(String ticker)
	{
		ArrayList<Trade> matchingTrades = new ArrayList<>();
		for(Trade trade : trades)
		{
			if(trade.getTicker().equals(ticker.toUpperCase()))
			{
				matchingTrades.add(trade);
			}
		}
		return matchingTrades;
	} 
	
	//Boolean method that if returns true edits the trade matching the ID searched for
	public boolean editTrade(int tradeID, String ticker, String direction, double strike, double entryPrice, 
		     double stopLoss, double takeProfit, String strategyUsed)
	{
		for(Trade trade : trades)
		{
			if(trade.getTradeID() == tradeID)
			{
				trade.setTicker(ticker);
				trade.setDirection(direction);
				trade.setStrike(strike);
				trade.setEntryPrice(entryPrice);
				trade.setStopLoss(stopLoss);
				trade.setTakeProfit(takeProfit);
				trade.setStrategyUsed(strategyUsed);
				
				return true;
			}
		}
		return false;	
	}
	
	//Boolean method that if returning true removes trade matching the ID searched for 
	public boolean removeTrade(int tradeID)
	{
		for(int i = 0; i < trades.size(); i++)
		{
			if(trades.get(i).getTradeID() == tradeID)
			{
				trades.remove(i);
				return true;
			}
		}
		return false;
	}
	
	//Method to save each trade into CSV file to store
	public void saveTradesToCSV() throws IOException
	{
		try (FileWriter writer = new FileWriter("trades.csv"))
		{
			writer.write("TradeID, Ticker, Direction, Strike, EntryPrice, StopLoss, TakeProfit, Strategy\n");
			for(Trade trade : trades)
			{
				writer.write(trade.toCSV() + "\n");
			}
		}
	}
	
	public void loadTradesFromCSV() throws IOException
	{
		
		//Removes all current elements before rebuilding CSV in case called twice
		trades.clear();
		File file = new File("trades.csv");
		if(!file.exists())
		{
			return;
		}
		
		//Reads an entire line pulling it from the trades.csv file
		try (BufferedReader reader = new BufferedReader(new FileReader(file)))
		{
			//Skips CSV header
			reader.readLine(); 
		
			String line;
			while((line = reader.readLine()) != null)
			{ 
				if(line.isBlank())
				{
					continue;
				}
				String[] parts = line.split(","); 
				int tradeID = Integer.parseInt(parts[0]);
				String ticker = parts[1];
				String direction = parts[2];
				double strike = Double.parseDouble(parts[3]);
				double entryPrice = Double.parseDouble(parts[4]);
				double stopLoss = Double.parseDouble(parts[5]);
				double takeProfit = Double.parseDouble(parts[6]);
				String strategyUsed = parts[7];
			
				Trade trade = new Trade(tradeID, ticker, direction,strike, 
					                entryPrice, stopLoss, takeProfit, strategyUsed);
			
				trades.add(trade); 
			} 
		}
	
	}   
} 

 