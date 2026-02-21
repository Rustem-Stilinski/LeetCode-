public class PartitionIntoMinimum {
    public int minPartitions(String n) {
        int maxDigit = 0;
        for(int i =0; i<n.length(); i++){
            int number = n.charAt(i) - '0';
            maxDigit = Math.max(maxDigit, number);
            if(maxDigit == 9) return maxDigit;
        }
        return maxDigit;
    }
}
