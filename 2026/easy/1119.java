class Solution {
    public String removeVowels(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o' ,'u');
        StringBuilder result = new StringBuilder();
        for(int i=0; i<s.length();i++){
            if(!vowels.contains(s.charAt(i))){
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    };
}
