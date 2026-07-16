package TradingRiskManagerNew;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	public static void main(String []args) {
		//Scanner for user to input trade information
		Scanner input = new Scanner(System.in); 
		
		//Creates a trade manager
		TradeManager manager = new TradeManager(); 
		
		//Loads previously stored trades if there are any
		try
		{
			manager.loadTradesFromCSV();
		}
		catch(IOException error)
		{
			System.out.println("Error loading trades: " + error.getMessage());
		}
		
		//Boolean to keep program running as long as user doesn't exit
		boolean running = true;
		
		//Options for user to select using while loop 
		while(running)
		{
			System.out.println("\n===== Trading Risk Manager =====");
			System.out.println("1. Add Trade");
			System.out.println("2. Print All Trades");
			System.out.println("3. Find Trades By Ticker:");
			System.out.println("4. Edit Trade");
			System.out.println("5. Remove Trade");
			System.out.println("6. Exit");
			
			System.out.print("Choose an option: ");
			int choice = input.nextInt();
			input.nextLine();
			
			//Using switch statement to compare variable at hand
			switch(choice)
			{
				//First case enabling user to add to each section of there trade
				case 1: 
				{
					System.out.print("Ticker: ");
					String ticker = input.nextLine();
					
					System.out.print("Direction: ");
					String direction = input.nextLine();
					
					System.out.print("Strike: ");
					double strike = input.nextDouble();
					
					System.out.print("Entry Price: ");
					double entryPrice = input.nextDouble();
					
					System.out.print("Stop Loss: ");
					double stopLoss = input.nextDouble();
					
					System.out.print("Take Profit: ");
					double takeProfit = input.nextDouble();
					
					input.nextLine();
					
					System.out.print("Strategy Used: ");
					String strategyUsed = input.nextLine();
					
					//Calls trade object
					Trade trade = new Trade(ticker, direction, strike, entryPrice,
							                stopLoss, takeProfit, strategyUsed);
					
					//Places in trade object
					manager.addTrade(trade);
					
					System.out.println("Trade added successfully.");
					
					break;
				}
			    //Second case prints all trades saved in journal
				case 2:
				{
					manager.printAllTrades();
					break;
				}
				//Third case searches for all trades by ticker name
				case 3:
				{
					System.out.print("Ticker You Are Searching For? ");
					String tickerName = input.next();
					ArrayList<Trade> matchingTrades = manager.findTradesByTicker(tickerName);
					if(matchingTrades.isEmpty())
					{
						System.out.println("No trades found."); 
						
					}
					else
					{
						for(Trade trade : matchingTrades)
						{
							System.out.print(trade + "\n");
						}
					}
					break;
				}
				//Fourth case enables users with the ability to edit a trade matching the ID entered(Must reinput all information)
				//If ID is not found returns not found
				case 4:
				{
					System.out.print("Enter Trade ID:  ");
					int tradeID = input.nextInt();
					input.nextLine();
					
					System.out.print("Ticker: ");
					String ticker = input.next();
					
					System.out.print("Direction (Call/Put): ");
					String direction = input.next();
					
					System.out.print("Strike: ");
					double strike = input.nextDouble();
					
					System.out.print("Entry Price: ");
					double entryPrice = input.nextDouble();
					
					System.out.print("Stop Loss: ");
					double stopLoss = input.nextDouble();
					
					System.out.print("Take Profit: ");
					double takeProfit = input.nextDouble();
					input.nextLine();
					
					
					System.out.print("Strategy Used: ");
					String strategyUsed = input.nextLine();
					
					boolean edited = manager.editTrade(tradeID, ticker, direction, strike,
													   entryPrice, stopLoss, takeProfit, strategyUsed);
					if(edited)
					{
						System.out.println("Trade updated successfully.");
					}
					else
					{
						System.out.println("Trade ID not found.");
					}
					break;
				}
				//Fifth case allows user to remove a trade with the trade ID if found
				case 5:
				{
					System.out.print("Enter Trade ID to remove: ");
					int removeID = input.nextInt();
					input.nextLine();
					
					boolean removed = manager.removeTrade(removeID);
					
					if(removed)
					{
						System.out.println("Trade removed successfully.");
					}
					else
					{
						System.out.println("Trade could not be found,");
					}
					break;
				}
				//Ends the program when user selects exit
				case 6:
				{
					try
					{
						manager.saveTradesToCSV();
					}
					catch (IOException error)
					{
						System.out.println("Error saving trades.");
					}
					running = false; 
					System.out.println("Exiting Trading Risk Manager");
					break;
				}
				//Default if user inputs anything but the 6 options
				default:
					System.out.println("Invalid option.");
			}			
//		Trade trade1 = new Trade("SPY","Call", 727.00, 727.33, 726.33, 729.33, "ORB Retest");
//		Trade trade2 = new Trade("TSLA", "Puts", 390.00, 390.21, 389.21, 392.21, "PDL Retest");
//		Trade trade3 = new Trade("APPL", "Calls", 310.00, 310.65, 309.65, 312.65, "PMH Retest");
//		manager.addTrade(trade1);
//		manager.addTrade(trade2);
//		manager.addTrade(trade3);
//		manager.printFirstTrade();
//		manager.printAllTrades();
			
			}
		}
	}

