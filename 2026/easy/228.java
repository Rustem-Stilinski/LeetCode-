import java.util.ArrayList;
import java.util.List;

class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result  = new ArrayList<>();

        if(nums.length == 0){
            return result;
        }

        int i = 0;
        while(i<nums.length){
            int start = nums[i];
            int j = i;
            while(j+1<nums.length && nums[j+1] == nums[j] + 1){
                j++;
            }

            if(nums[j] == start){
                result.add(String.valueOf(start));
            }
            else{
                result.add(start + "->" + nums[j]);
            }
            // Move to the next otential start of a range
            i = j+1;
    }
    return result;
}
}

/*
The problem is to find contiguous ranges in a sorted array of unique integers. 
We can solve this efficiently with a two-pointer approach. 
We use a pointer to mark the start of a range and another to expand and find the end. 
Since the array is sorted, we can simply check if the next number is consecutive. 
When the sequence breaks, we have found a complete range, which we then add to our result list.
*/
