import java.util.Scanner;

public class TradingRiskManagerV5 {
	
	// Calculates total risk across all trades
	public static int totalRisk(int[] risks) 
	{
		int total = 0;
		for(int i = 0; i < risks.length; i++)
		{
			total = total + risks[i];
		}
		return total;
	}
	
	// Calculates users highest risk
	public static int highestRisk(int[] risks) 
	{
		int highest = risks[0];
		for(int i = 0; i < risks.length; i++)
		{
			if(highest < risks[i])
			{
				highest = risks[i];
			}
			
		}
		return highest;
	}
	
	// Calculates users lowest risk
	public static int lowestRisk(int[] risks) 
	{
		int lowest = risks[0];
		for(int i = 0; i < risks.length; i++)
		{
			if(risks[i] < lowest)
			{
				lowest = risks[i];
			}
		}
		return lowest;
	}
	
	// Calculates average risk through all trades
	public static double averageRisk(int[]risks) 
	{
		return (double) totalRisk(risks) / risks.length;
	}
	
	// Returns number of high risk trades taken
	public static int highRiskTradeCount(int[] risks) 
	{
		int highTrades = 0;
		for(int i = 0; i < risks.length; i++)
		{
			if(risks[i] >= 200)
			{
				highTrades++;
			}
		}
		return highTrades;
	}
	
	// Return which trade had the most risk
	public static int highestRiskIndex(int[] risks) 
	{
		int index = 0;
		int highest = risks[0];
		for(int i = 0; i < risks.length; i++)
		{
			if(risks[i] > highest)
			{
				highest = risks[i];
				index = i;
			}
		}
		return index;
	}
	
	//Calculates users Risk:Reward Ratio
	public static void rewardRiskRatio(double[] rewards, int[] risks)
	{
		for(int i = 0; i < risks.length; i++)
		{
			double ratio = 0;
			ratio = rewards[i] / risks[i];
			System.out.printf("Trade #%d Ratio: %.2f%n",(i + 1),ratio);
		}
		
	}
	
	//Returns the index of the trade with the best Risk:Reward ratio
	public static int bestRatioIndex(double[] rewards, int[] risks)
	{
		double bestRatio = rewards[0] / risks[0];
		int bestIndex= 0;
		for(int i = 0; i < risks.length; i++)
		{
			double currentRatio = rewards[i] / risks[i];
			if(currentRatio > bestRatio)
			{
				bestRatio = currentRatio;
				bestIndex = i;
			}
		}
		return bestIndex;
	}
	
	//Returns the index of the trade with the lowest Risk:Reward ratio
	public static int lowestRatioIndex(double[] rewards, int[] risks)
	{
		double lowRatio = rewards[0] / risks[0];
		int lowIndex = 0;
	    for(int i = 0; i < risks.length; i++)
	    {
	    	double currentRatio = rewards[i] / risks[i];
	    	if(currentRatio < lowRatio)
	    	{
	    		lowRatio = currentRatio;
	    		lowIndex = i;
	    	}
	    }
	    return lowIndex;
	}
	
	// Returns a count of how many low risk trades
	public static int lowRiskTradeCount(int[] risks)
	{
		int lowRiskCount = 0;
		for(int i = 0; i < risks.length; i++)
		{
			if(risks[i] < 100)
			{
				lowRiskCount++;
			}
			
		}
		return lowRiskCount;
	}
	
	//Returns a count of how many medium risk trades
	public static int mediumRiskTradeCount(int[] risks)
	{
		int mediumRisk = 0;
		for(int i = 0; i < risks.length; i++)
		{
			if(100 <= risks[i] && risks[i] <= 199)
			{
				mediumRisk++;
			}
		}
		return mediumRisk;
	}
	
	//Returns the ticker with the highest risk
	public static String highestRiskTicker(String[] tickers, int[] risks)
	{
		int highestRisk = risks[0];
		String highestTick = tickers[0];
		for(int i = 0; i < risks.length; i++)
		{
			if(risks[i] > highestRisk)
			{
				highestRisk = risks[i];
				highestTick = tickers[i];
			}
		}
		return highestTick;
	}
	
	//Returns the ticker with lowest risk
	public static String lowestRiskTicker(String[] tickers, int[] risks)
	{
		int lowestRisk = risks[0];
		String lowRiskTick = tickers[0];
		for(int i = 0; i < risks.length; i++)
		{
			if(risks[i] < lowestRisk)
			{
				lowestRisk = risks[i];
				lowRiskTick = tickers[i];
			}
		}
		return lowRiskTick;
	}
	
	//Returns the ticker with the highest reward
	public static String highestRewardTicker(String[] tickers, double[] rewards)
	{
		double highReward = rewards[0];
		String highRewardTick = tickers[0];
		for(int i = 0; i < rewards.length; i++)
		{
			if(rewards[i] > highReward)
			{
				highReward = rewards[i];
				highRewardTick = tickers[i];
			}
		}
		return highRewardTick;
	}
	
	//Return the ticker with the lowest reward
	public static String lowestRewardTicker(String[] tickers, double[] rewards)
	{
		double lowReward = rewards[0];
		String lowRewardTick = tickers[0];
		for(int i = 0; i < rewards.length; i++)
		{
			if(rewards[i] < lowReward)
			{
				lowReward = rewards[i];
				lowRewardTick = tickers[i];
			}
		}
		return lowRewardTick;
	}
	
	//Return ticker with best Risk:Reward Ratio
	public static String bestTickerRatio(String[] tickers, int[] risks, double[] rewards)
	{
		double bestTickRatio = rewards[0] / risks[0];
		String bestTicker = tickers[0];
		for(int i = 0; i < risks.length; i++)
		{
			double currentRatio = rewards[i] / risks[i];
			if(currentRatio > bestTickRatio)
			{
				bestTickRatio = currentRatio;
			bestTicker = tickers[i];
			}
		}
		return bestTicker;
	}
	
	//Returns ticker with the lowest Risk:Reward ratio
	public static String lowestTickerRatio(String[] tickers, int[] risks, double[ ]rewards)
	{
		double lowestTickRatio = rewards[0] / risks[0];
		String lowestTick = tickers[0];
		for(int i = 0; i < risks.length; i++)
		{
			double currentRatio = rewards[i] / risks[i];
			if(currentRatio < lowestTickRatio)
			{
				lowestTickRatio = currentRatio;
				lowestTick = tickers[i];
			}
		}
		return lowestTick;
	}
	public static void main(String[] args) {
		//Scanner for user input
		Scanner input = new Scanner(System.in);
		
		//User chooses number of trades
		System.out.print("How many trades?");
		int trades = input.nextInt();
		
		//Arrays storing risk and reward values
		int[]risks = new int[trades];	
		double[]rewards = new double[trades];
		String[]tickers = new String[trades];
		
		//Collect trade information
		for(int i = 0; i < risks.length; i++)
		{
			System.out.print("Enter ticker for trade #" + (i + 1) + ":");
			tickers[i] = input.next();
			System.out.print("Enter risk for trade #" + (i + 1) + ":");
			risks[i] = input.nextInt();
			System.out.print("Enter your targeted reward:");
			rewards[i]= input.nextDouble();
			
			if(risks[i] <= 99)
			{
				System.out.println("Low Risk");
			}
			else if(risks[i] <= 199)
			{
				System.out.println("Medium Risk");
			}
			else
			{
				System.out.println("High Risk");
			}
		}
		
		//Display Risk:Reward Ratio
		System.out.println("------------------");
		System.out.println("\nRisk/Reward Ratios:");
		System.out.println("------------------");
		rewardRiskRatio(rewards,risks);
		System.out.println("------------------");
		//Display Stored Risk
		System.out.println("Stored Trades: ");
		System.out.println("------------------");
		for(int i = 0; i < risks.length; i++)
		{
			System.out.println("Trade #" + (i + 1) + 
							   " | Ticker: " + tickers[i] + 
							   " | Risk: " + risks[i] + 
							   " | Reward: " + rewards[i]);
		}
		System.out.println("------------------");
		//Calculate all statistics
		int totalRisk = totalRisk(risks);
		int highest = highestRisk(risks);
		double average = averageRisk(risks);
		int lowest = lowestRisk(risks);	
		int highRisk = highRiskTradeCount(risks);
		int lowRisk = lowRiskTradeCount(risks);
		int midRisk = mediumRiskTradeCount(risks);
		int index = highestRiskIndex(risks);
		int bestIndex = bestRatioIndex(rewards,risks);
		double ratioBest = rewards[bestIndex] / risks[bestIndex];
		int lowIndex = lowestRatioIndex(rewards,risks);
		double worseRatio = rewards[lowIndex] / risks[lowIndex];
		String highestRisk = highestRiskTicker(tickers, risks);
		String lowestRisk = lowestRiskTicker(tickers, risks);
		String highestReward = highestRewardTicker(tickers, rewards);
		String lowestReward = lowestRewardTicker(tickers, rewards);
		String bestTickRatio = bestTickerRatio(tickers, risks, rewards);
		String worseTickRatio = lowestTickerRatio(tickers, risks, rewards);
		System.out.println("Trade Statistics:");
		System.out.println("------------------");
		System.out.println("Total Risk: " + totalRisk);
		System.out.println("Highest Risk: " + highest);
		System.out.println("Occurred on Trade #" + (index + 1));
		System.out.println("Highest Risk Ticker: " + highestRisk);
		System.out.println("Lowest Risk Ticker: " + lowestRisk);
		System.out.println("Highest Reward Ticker: " + highestReward);
		System.out.println("Lowest Reward Ticker: " + lowestReward);
		System.out.println("Best Ratio Ticker: " + bestTickRatio);
		System.out.println("Worst Ratio Ticker: " + worseTickRatio);
		System.out.printf("Trade #%d had the best ratio: %.2f%n",(bestIndex + 1), ratioBest);
		System.out.printf("Trade #%d had the worst ratio: %.2f%n",(lowIndex + 1), worseRatio);
		System.out.println("Lowest Risk: " + lowest);
		System.out.printf("Average Risk: %.2f%n", average);
		System.out.println("High Risk Trade Count: " + highRisk);
		System.out.println("Medium Risk Trade Count: " + midRisk);
		System.out.println("Low Risk Trade Count: " + lowRisk);

	}

}

