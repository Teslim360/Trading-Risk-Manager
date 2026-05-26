import java.util.Scanner;

public class TradingRiskManagerV1 {
	
	public static boolean isApproved(int accountSize, int risk)
	{
		return risk <= maxAllowed(accountSize);	
	}
	public static int maxAllowed(int accountSize) //max amount allowed to be taken per trade on account per 2% rule
	{ 
		return accountSize * 2 / 100;
	}
	public static int remainingRisk(int accountSize, int risk)// remaining risk available on account
	{
		return maxAllowed(accountSize) - risk;
	}
	public static double riskPercent(int accountSize, double risk)//calculates percentage of account being used
	{
		return risk / accountSize * 100;
	}
	public static double rewardRiskRatio(int reward, double risk)//calculates risk:reward ratio 
	{
		return reward / risk;
	}
	public static int overRiskAmount(int accountSize, int risk)
	{
		return risk - maxAllowed(accountSize);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter account size:");
		int accountSize = input.nextInt();
		System.out.print("Enter trade risk:");
		int risk = input.nextInt();
		System.out.print("Enter potential profit:");
		int reward = input.nextInt();
		System.out.println("\nMaximum Allowed Risk:" + maxAllowed(accountSize));
		System.out.println("Your Risk:" + risk);
		System.out.println("Risk Percentage:" + riskPercent(accountSize,risk));
		boolean approved = isApproved(accountSize,risk);
		if(approved)
		{
			System.out.println("Trade Approved");
		}
		else
		{
			System.out.println("Trade Rejected");
		}
		double riskReward = rewardRiskRatio(reward,risk);
		System.out.println("Reward/Risk Ratio:" + riskReward);

		if(riskReward >= 3)
		{
			System.out.println("Excellent Trade");
		}
		else if(riskReward >= 2)
		{
			System.out.println("Good Trade");
		}
		else
		{
			System.out.println("Poor Trade");
		}
		int overRisk = overRiskAmount(accountSize,risk);
		if(overRisk > 0)
		{
			System.out.println("Over Risk Limit By:" + overRisk);
		}
		else
		{
			System.out.println("Not Over Risk Limit");
			System.out.println("Risk remaining:" + remainingRisk(accountSize,risk));
		}
	
	}
}



