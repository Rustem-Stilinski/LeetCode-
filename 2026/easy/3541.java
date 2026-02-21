import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class MaxFreq {
    public int maxFreqSum(String s) {
        Map<Character, Integer> vowelCharToFreqMap = new HashMap<>();
        Map<Character, Integer> consonantCharToFreqMap = new HashMap<>();
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int maxVowels = 0;  
        int consonantMax = 0;  
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (vowels.contains(c)) {
                int freq = vowelCharToFreqMap.merge(c, 1, Integer::sum);
                maxVowels = Math.max(maxVowels, freq);  
            } else {
                int freq = consonantCharToFreqMap.merge(c, 1, Integer::sum);
                consonantMax = Math.max(consonantMax, freq);  
            }
        }
        
        return consonantMax + maxVowels;
    }
}
