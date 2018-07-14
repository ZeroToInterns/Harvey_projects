import java.lang.reflect.Array;

public class GroceryList {
	private String[] groceryList;
	public GroceryList()
	{
		groceryList = new String[50];
	}
	
	public GroceryList(int length)
	{
		groceryList = new String[length];
	}
	
	public GroceryList(String[] list)
	{
		groceryList = new String[list.length];//create a new array with the same amount of memory slots as the instance variable
		//length is not a method but a property of array, so it doesn't have length()
		
		for(int i = 0; i < list.length; i++)
		{
			groceryList[i] = list[i]; // how to copy the contents of groceryList to list
		}
	}
	
	//return the length of the longest item
	public int findLongestItem()
	{
		int maxLength = 0;
		for(int i = 0; i < groceryList.length; i++)
		{
			int itemLength = groceryList[i].length();//loop through every item, as i increases
			
			if(itemLength > maxLength)
			{
				maxLength = itemLength; //update
			}
		}
		return maxLength;
	}
	
	public int findShortestItem()
	{
		int shortest = groceryList[0].length(); //this is a string, so length() is a method 
		for(int i = 0; i < groceryList.length; i++)
		{
			int itemLength2 = groceryList[i].length();//loop through every item, as i increases
			
			if(itemLength2 < shortest)
			{
				shortest = itemLength2; //update
			}
		}
		return shortest;
	}
}
