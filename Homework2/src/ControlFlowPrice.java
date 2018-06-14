
public class ControlFlowPrice {
	private double costOfTrip;
	private int index;
	public double calculateCost(double distance)
	{
		if(distance >= 50 && distance <= 100)
		{
			costOfTrip = 100;
		}
		else if (distance >= 25 && distance < 50)
		{
			costOfTrip = 50;
		}
		else if (distance >= 0 && distance < 25)
		{
			costOfTrip = 10;
		}
		else 
		{
			costOfTrip = 0;
		}
		return costOfTrip;
	}
	public void rollDice(int value)
	{
		switch (value)
		{
		case 1:
			System.out.println("The value rolled is: 1");
			break;
		case 2:			
			System.out.println("The value rolled is: 2");
			break;
		case 3:
			System.out.println("The value rolled is: 3");
			break;
		case 4:
			System.out.println("The value rolled is: 4");
			break;
		case 5:
			System.out.println("The value rolled is: 5");
			break;
		case 6:
			System.out.println("The value rolled is: 6");
			break;
			default: 
				System.out.println("Does not exist");
		}
//		return "The value rolled is: " + value;
	}
	
	public int findLetter(String letter, String word)
	{
		int count = 0;
		for(int i = 0; i < word.length(); i++)
		{
			if (word.substring(i, i+1).equals(letter)) //substring 0,1 is going to give 1 
				//the first value is included but the ending index is not included
				// if the letter equals to the dynamic variable 
			{
				if (count ==1) //we start at 0 so it doesn't match the first time it find the matching letter 
					// the second it hits it the count will be at 1 therefore it prints the the index. 
				{
					return i; // you can switch two statements by using ! not statement. 
				}
				else 
				{
					count++; //it increment after the first count
				}
			}
		}
		return 0;
	}
	
	
}
