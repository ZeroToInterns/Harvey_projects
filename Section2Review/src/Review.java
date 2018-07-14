import java.util.Stack;
public class Review {

	public static void main(String[] args) {
		int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] result = reverseArray(myArray);
		System.out.println(result);
	}
	
	public static int[] reverseArray(int[] list) //local array list
	{
		Stack<Integer>myStack = new Stack<Integer>();
		int[] temp = new int[list.length]; //creating a temp to store value 
		
		for(int i = 0; i < list.length; i++)
		{
			myStack.push(list[i]);
		}
		//while(!myStack.isEmpty()) common way to interact with pop
		
		for(int i = 0; i < list.length; i++)
		{
			temp[i] = myStack.pop(); //need for loop
		}
		return temp;
	}
	
	public static int[] removeDuplicate(int[] list)
	{
		
	}
	
	public static int[] countMostFrequnt(int[] list)
	{
		
	}
	
}
