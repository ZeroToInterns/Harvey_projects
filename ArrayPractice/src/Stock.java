
public class Stock {
//check if the next day stock is lower than today, if it is then sell today, if the next day is lower than today then buy on the next day.
	private int[] stocks;
	//an array of stocks 
	// can not sell stocks unless you have one 
	public Stock()
	{
		stocks = new int[2];
	}
	
	public int findMaxProfit()
	{
		int maxProfit = 0; 
		int totalProfit = 0;
		for(int i = 0; i < stocks.length; i++) //loop through the future stocks you can see
		{
			if(stocks[i] < stocks[i+1]) // if today's stock is smaller than tomorrow, you can make profit by buying today and sell tomorrow
			{
				System.out.println("Buy on this day because next day you can make profit tommorrow");
				totalProfit = totalProfit + stocks[i+1] - stocks[i];
			}
			
			else if(stocks[i] > stocks[i+1])
			{
				System.out.println("No transaction on day ");
				System.out.print(stocks[i]);
			}
			else
			{
				System.out.println("No transaction on day ");
				System.out.print(stocks[i]);
			}
		}
		maxProfit = totalProfit;
		return maxProfit;
	}
}
