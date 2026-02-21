import java.util.HashSet;
import java.util.Set;

class MaxDistinct {
    public int maxDistinct(String s) {
     Set<Character> distinctChars = new HashSet<>();
    for (char c : s.toCharArray()) {
        distinctChars.add(c);
    }
    return distinctChars.size();
    }
}
