class LimitedString {
    public String repeatLimitedString(String s, int repeatLimit) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        
        StringBuilder result = new StringBuilder();
        int currIdx = 25; // Start from 'z'
        
        while (currIdx >= 0) {
            // Skip characters with zero frequency
            if (freq[currIdx] == 0) {
                currIdx--;
                continue;
            }
            
            // Use up to repeatLimit of current character
            int useCount = Math.min(freq[currIdx], repeatLimit);
            char currChar = (char)('a' + currIdx);
            result.append(String.valueOf(currChar).repeat(useCount));
            freq[currIdx] -= useCount;
            
            // If more of this character remains, need a separator
            if (freq[currIdx] > 0) {
                // Find next largest available character as separator
                int sepIdx = currIdx - 1;
                while (sepIdx >= 0 && freq[sepIdx] == 0) {
                    sepIdx--;
                }
                
                // No separator available, break
                if (sepIdx < 0) {
                    break;
                }
                
                // Add one separator character
                result.append((char)('a' + sepIdx));
                freq[sepIdx]--;
                // Continue with same character after separator
            } else {
                // Current character exhausted, move to next
                currIdx--;
            }
        }
        
        return result.toString();
    }
}
