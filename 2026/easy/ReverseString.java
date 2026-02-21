public class ReverseString {
        public int reverseDegree(String s) {
            int result = 0;
            for (int i = 0; i < s.length(); i++) {
                int number = s.charAt(i) - 'a';
                result += Math.abs(number - 26) * (i + 1);
            }
            return result;
        }
}
