import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> repeats = new ArrayList<Integer>();
        //any time an element appears twice
//        
//        ArrayList<Integer> temp = new ArrayList<Integer>();
        //create a temp that will hold all elements as we loop thorough the entire arraylist
        // once the value we scanning next is alreadying existing in the temp, it will print this element

        Set<Integer> temp = new HashSet<>();
        for(Integer x : nums)
        {
        	if(temp.add(x) == false)
        	{
        		repeats.add(x);
        	}
        }
        return repeats;
    }
}