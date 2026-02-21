class BinarySubstring {
    public int countBinarySubstrings(String s) {
        int prevCount = 0;
        int currentCount = 1;
        int result = 0;
        char[] chars = s.toCharArray();

        for(int i=1;i<chars.length;i++){
            if(chars[i-1]!=chars[i]){
                            result = result + Math.min(prevCount, currentCount);
                prevCount = currentCount;
                currentCount=1;

            }
            else{
                currentCount++;
            }
        }
            result = result+ Math.min(prevCount, currentCount);
      
        return result;
    }
}
