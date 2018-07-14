class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
	// poisonedTill, totalDuration := -1, 0
	// for i := 0; i < len(timeSeries); i++ {
	// 	if poisonedTill <= timeSeries[i] {
	// 		totalDuration += duration
	// 	} else {
	// 		totalDuration += timeSeries[i] + duration - poisonedTill
	// 	}
	// 	poisonedTill = timeSeries[i] + duration
	// }
	// return totalDuration
	// }
        
        int poisonedTill = -1;
        int totalDuration = 0;
        
        for(int i =0; i < timeSeries.length; i++)
        {
            if(poisonedTill <= timeSeries[i])
            {
                totalDuration += duration;
            }
            else
            {
                totalDuration += timeSeries[i] + duration - poisonedTill; 
            }
            poisonedTill = timeSeries[i] + duration;
        }
        
        return totalDuration;
}
}