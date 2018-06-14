import java.util.ArrayList;
public class StringLoop {

	//print the number 1-100
	//prints the numbers 0 - 100 but only the evens / printEVEN
	//prints the odds from 1-100 / but only odds 
	public void printNumbers()
	{
		for(int i = 1; i <= 100; i++)
		{
			System.out.println(i);
		}
	}
	
	public void printEvenNumbers()
	{
		for (int e = 0; e <=100; e+=2)
		{
			System.out.println(e);
		}
	}
	
	public void printOddNumbers()
	{
		for (int o = 1; o <= 100; o+=2)
		{
			System.out.println(o);
		}
	}
//	
//	"Hello World"
//	 012345678910
	 // print() method loops through a string and prints "Found o!"
//	 public void getTheOs(String word) //need parameters because it needs to get the word so it can get the os from the word 
//	 {
//		 
//		 for(String o : word) 
//		 {
//			 if(o.equals("o"))
//			 {
//				 System.out.println("Found o!");
//			 }
//		 }
//	 }
	 
	//first character print once, second character print twice
	public void printCharacters(String phrase)
	{
		for (int i = 0; i < phrase.length(); i++)
		{
			for (int n = 0; n < i+1; n++)
			{
				System.out.print(phrase.substring(i, i+1)); //i +1 is a value and i++ is an operation 
			}
			System.out.println("");
		}
	}
	
	@Test 
	public void testStringLoopprintEvenNumbers(); // testing one unit of StringLoop class, an unit test
	

	 
}
