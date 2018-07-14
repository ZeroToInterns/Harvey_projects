import java.util.*;
public class ArrayListPractice {
	public static void main(String[] args) {
		ArrayList<String> listOfColor = new ArrayList<String>(); //create instance listOfColor aka object 
		listOfColor.add("Blue"); //called on instance listOfColor  
		listOfColor.add("Black");
		listOfColor.add("Yellow");
		listOfColor.add("Red");
		listOfColor.add("Rainbow");
		listOfColor.add("Orange");
		listOfColor.add("Blue");
		listOfColor.add("Lateritious");
		listOfColor.add("Wine");
		listOfColor.add("Grey");
		
		System.out.println(getRepetition("Blue", listOfColor));
		
		replace("Blue","G a Y", listOfColor); //not called by any instance but called by class
		System.out.println(listOfColor);
		
		insertFirst(listOfColor, "Blue");
		System.out.println(listOfColor);

		addSecondToLast(listOfColor, "g A y");
		System.out.println(listOfColor);
		
//		System.out.println(listOfColor); //so we dont need this part for it work 
//		ArrayListPractice tester = new ArrayListPractice(); //belong to class
//		tester.insertFirst(listOfColor, "Pink");
//		System.out.println(listOfColor);
	}
	
	
	public static void insertFirst(ArrayList<String> listOfColor, String element) //static belongs to the class
	{
		listOfColor.add(0, element);
	}
	
	
	public static void addSecondToLast(ArrayList<String> listOfColor, String element)
	{
		listOfColor.add(listOfColor.size()-1, element);
	}
	
	
	public static int getRepetition(String color, ArrayList<String> listOfColor)
	{
		int total = 0;
		for(int i = 0; i < listOfColor.size(); i++)
		{
			if(color.equals(listOfColor.get(i)))
			{
				total++;
			}	
		}
		return total;
	}
	
	
	public static void replace(String oldElement, String newElement, ArrayList<String> listOfColor)
	{
		for(int i = 0; i < listOfColor.size(); i++)
		{
			if(listOfColor.get(i).equals(oldElement))
			{
				listOfColor.set(i,newElement);
			}
		}
	}
}