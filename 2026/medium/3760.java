class Solution {
    public int maxDistinct(String s) {
     Set<Character> distinctChars = new HashSet<>();
    for (char c : s.toCharArray()) {
        distinctChars.add(c);
    }
    return distinctChars.size();
    }
}
