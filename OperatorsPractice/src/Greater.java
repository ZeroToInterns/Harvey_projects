
public class Greater {

	public static void respondToGrade(char grade)
	{
		switch(grade) //switch only covers certain scenario 
		{
		case 'A': 
			System.out.println("Good Job");
			break;
		
		case 'B':
			System.out.print("You failed as my son");
			break;
			
		case 'C':
			System.out.println("You're not my boy");
			break;
			
		default:
			System.out.println("A shame of the family");
			break;
		}
	}
	
	public static String giveGrade(int precentage)  // if statements can cover a certain range of possible outcomes
	{
		if (precentage >= 90 && precentage <= 100)
		{
			if(precentage >= 90 && precentage <=93)
			{
				return "A-";
			}
			else if(precentage >= 96 && precentage <= 100)
			{
				return "A+";
			}
			else 
			{
				return "A";
			}
		}
		else if (precentage >= 80 && precentage < 90)
		{
			if(precentage >= 80 && precentage <=83)
			{
				return "B-";
			}
			else if(precentage >= 86 && precentage <= 89)
			{
				return "B+";
			}
			else 
			{
				return "B";
			}
		}
		else if (precentage >= 70 && precentage < 80)
		{
			if(precentage >= 70 && precentage <=73)
			{
				return "C-";
			}
			else if(precentage >= 76 && precentage <= 79)
			{
				return "C+";
			}
			else 
			{
				return "C";
			}
		}
		else if (precentage >= 60 && precentage < 70)
		{
			if(precentage >= 60 && precentage <=63)
			{
				return "D-";
			}
			else if(precentage >= 66 && precentage <= 69)
			{
				return "D+";
			}
			else 
			{
				return "D";
			}
		}
		else if (precentage >= 0 && precentage < 60)
		{
			return "F";
		}
		else 
		{
			return "null";
		}
	}
}
