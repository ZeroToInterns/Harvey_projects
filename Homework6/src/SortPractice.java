
public class SortPractice {

	public static int[] insertSort(int list[]) //takes in a list when calling 
	{
		int temp;
		for(int i = 1; i < list.length; i++)
		{
			for(int j = i; j > 0; j--)
			{
				if(list[j] < list[j - 1]) // if the current value is smaller than the value before then swap 
				{
					temp = list[j];
					list[j] = list[j - 1];
					list [j - 1] = temp;
				}
			}
		}
		return list;
	}
	
	public static void bubbleSort(int[] aList)
	{
		int n = aList.length;
		int temp;
		for(int i = 0; i < n; i++)
		{
			for(int j = 1; j < (n - i); j++)
			{
				if(aList[j - 1] > aList[j])
				{
					temp = aList[j - i];
					aList[j - i] = aList[j];
					aList[j] = temp;
				}
			}
		}
	}
}
