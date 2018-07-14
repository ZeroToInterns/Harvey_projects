import java.util.Arrays;
import java.util.LinkedList;

public class Merger
{
    private static LinkedList<Integer> merge(LinkedList<Integer> first, 
                                             LinkedList<Integer> second)
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        while(first != null && second != null)
        {
           if(first.data < second.data)
           {
              list.next = first;
              first = first.next;
           }
           else if (first.data > second.data)
           {
              list.next = second;
              second = second.next;
           }
           list = list.next;
        }

        return list;
    }

    public static void main(String args[])
    {
        Integer values1[] = { 4, 16, 26, 29, 32, 47, 50, 79, 83, 86, 97};
        Integer values2[] = {14, 16, 18, 54, 61, 63, 64, 88, 92};
        
        LinkedList<Integer> first  = new LinkedList<Integer>(Arrays.asList(values1));
        LinkedList<Integer> second = new LinkedList<Integer>(Arrays.asList(values2));
        
        System.out.println("First  " + first);
        System.out.println("Second " + second);
        System.out.println("Merged " + merge(first, second));
    }

}