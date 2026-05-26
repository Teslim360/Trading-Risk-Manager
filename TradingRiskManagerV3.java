import java.util.Scanner;

public class TradingRiskManagerV3 {
	

	public static int maxAllowed(int accountSize) //max amount allowed to be taken per trade on account per 2% rule
	{ 
		return accountSize * 2 / 100;
	}

	public static double riskPerShare(double entry, double stop) //calculates risk per share for trade
	{
		return entry - stop;
	}
	public static double positionSize(double maxRisk, double riskPerShare) //calculates position size
	{
		return maxRisk / riskPerShare;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //Scanner for user input
		System.out.print("Enter account size:");
		int accountSize = input.nextInt();
		System.out.print("How many trades do you want to analyze? "); //asks user to enter how many trades
		int trades = input.nextInt();
		for(int a = 1; a <= trades; a++) //loop running for amount of trades user input
		{
			System.out.println("\nTrade #" + a);
			System.out.print("Enter entry price:");
			double entry = input.nextDouble(); // entry price for trade is entered here
			System.out.print("Enter stop loss price:");
			double stop = input.nextDouble(); // stop loss for trade is entered here 
			double maxRisk = maxAllowed(accountSize); // maximum amount of risk for this account
			double perShareRisk = riskPerShare(entry,stop); //risk per share variable is calculate and placed here
			double shares = positionSize(maxRisk,perShareRisk); // amount shares is calculated here

			if(perShareRisk <= 0)
			{
				System.out.print("Invalid stop loss"); // if trade stop loss is greater than entry
			}
			else
			{
				System.out.println("\nTrade #" + a + " Results");
				System.out.println("-----------------------");
				System.out.printf("Maximum Allowed Risk:%.2f%n",maxRisk); // prints once user input for stop loss is valid
				System.out.printf("Your Risk Per Share: $%.2f%n", perShareRisk);
				long roundedShares = Math.round(shares);
				System.out.println("Recommended Position Size:" + roundedShares);
				System.out.print("Valid stop loss");
			}

	}
	}
}



