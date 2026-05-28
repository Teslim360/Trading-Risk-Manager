import java.util.Scanner;

public class TradingRiskManagerV4 {
	
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
	//Returns the index of the trade with the best reward-to-risk ratio
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
	public static void main(String[] args) {
		//Scanner for user input
		Scanner input = new Scanner(System.in);
		
		//User chooses number of trades
		System.out.print("How many trades?");
		int trades = input.nextInt();
		
		//Arrays storing risk and reward values
		int[]risks = new int[trades];	
		double[]rewards = new double[trades];
		
		//Collect trade information
		for(int i = 0; i < risks.length; i++)
		{
			System.out.print("Enter risk for trade #" + (i + 1) + ":");
			risks[i] = input.nextInt();
			System.out.print("Enter your targeted reward:");
			rewards[i]= input.nextInt();
			
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
		System.out.println("\nRisk/Reward Ratios:");
		rewardRiskRatio(rewards,risks);
		System.out.println("------------------");
		//Display Stored Risk
		System.out.println("Stored Risks: ");
		for(int i = 0; i < risks.length; i++)
		{
			System.out.println("Risk #" + (i + 1) + ": " + risks[i]);
		}
		System.out.println("------------------");
		//Calculate all statistics
		int totalRisk = totalRisk(risks);
		int highest = highestRisk(risks);
		double average = averageRisk(risks);
		int lowest = lowestRisk(risks);	
		int highRisk = highRiskTradeCount(risks);
		int index = highestRiskIndex(risks);
		int bestIndex = bestRatioIndex(rewards,risks);
		double ratioBest = rewards[bestIndex] / risks[bestIndex];
		System.out.println("Trade Statistics:");
		System.out.println("Total Risk: " + totalRisk);
		System.out.println("Highest Risk: " + highest);
		System.out.println("Occurred on Trade #" + (index + 1));
		System.out.printf("Trade #%d had the best ratio: %.2f%n",(bestIndex + 1), ratioBest);
		System.out.println("Lowest Risk: " + lowest);
		System.out.printf("Average Risk: %.2f%n", average);
		System.out.println("High Risk Trade Count: " + highRisk);

	}

}

