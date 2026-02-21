import java.util.HashSet;
import java.util.Set;

class NearbyDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            // Remove the element that is now outside the window
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }
            
            // Try to add the current element. If it fails, a duplicate exists.
            if (!set.add(nums[i])) {
                return true;
            }
        }
        
        return false;
    }
}
  //The problem is to determine if there are any duplicate elements within a distance of at most k from each other in an array. 
  //A naive approach would be to use nested loops, but that's inefficient. A more optimal solution uses a sliding window with a hash set. 
  //The hash set will store the elements within our current window of size k. As we move through the array, we check each new element against the elements already in our hash set. 
  //If we find a match, we know we have a duplicate within k distance. To keep the window size constant, we remove elements that fall out of the window as we slide it forward.
