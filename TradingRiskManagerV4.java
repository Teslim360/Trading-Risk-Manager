package tradingRiskManager;
import java.util.Scanner;

public class TradingRiskManagerV4 {
	
	public static int totalRisk(int[] risks)
	{
		int total = 0;
		for(int i = 0; i < risks.length; i++)
		{
			total = total + risks[i];
		}
		return total;
	}
	public static int highestRisk(int[] risks)
	{
		int highest = 0;
		for(int i = 0; i < risks.length; i++)
		{
			if(highest < risks[i])
			{
				highest = risks[i];
			}
			
		}
		return highest;
	}
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
	public static double averageRisk(int[]risks)
	{
		return (double) totalRisk(risks) / risks.length;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many trades?");
		int trades = input.nextInt();
		int[]risks = new int[trades];		
		for(int i = 0; i < risks.length; i++)
		{
			System.out.print("Enter risk for trade #" + (i + 1) + ":");
			risks[i] = input.nextInt();
		}
		System.out.println("Stored Risks:");
		for(int i = 0; i < risks.length; i++)
		{
			System.out.println("Risk #" + (i + 1) + ":" + risks[i]);
		}
		int totalRisk = totalRisk(risks);
		int highest = highestRisk(risks);
		double average = averageRisk(risks);
		int lowest = lowestRisk(risks);	
		System.out.println("Total Risk:" + totalRisk);
		System.out.println("Highest Risk:" + highest);
		System.out.println("Lowest Risk:" + lowest);
		System.out.printf("Average Risk:%.2f%n", average);

	}

}

