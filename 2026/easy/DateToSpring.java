public class DateToSpring {
        public String convertDateToBinary(String date) {
            String[] dates = date.split("-");
            String year = Integer.toBinaryString(Integer.valueOf(dates[0]));
            String month = Integer.toBinaryString(Integer.valueOf(dates[1]));
            String day = Integer.toBinaryString(Integer.valueOf(dates[2]));
            return String.join("-", year, month, day);
        }
}
