class EqualSubstring {
    public int equalSubstring(String s, String t, int maxCost) {
        int result = 0;
        int left = 0;
        int currentCost = 0;
        int n = s.length();
        for(int right = 0 ; right<n; right++){
            currentCost += Math.abs(s.charAt(right) - t.charAt(right));

            while(currentCost>maxCost){
                currentCost-=Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }

            result = Math.max(result, right-left+1);
        }
        
        return result;
    }
}
