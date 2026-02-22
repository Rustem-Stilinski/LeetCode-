public class Main {
    public static void main(String[] args) {
        PartitionIntoMinimum test = new PartitionIntoMinimum();
        int result = test.minPartitions("32");
        System.out.println(result);

        DateToSpring dateToSpring = new DateToSpring();
        System.out.println(dateToSpring.convertDateToBinary("2025-11-23"));

        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverseDegree("abxsx"));

        ValidPalindrome validPalindrome = new ValidPalindrome();
        String word = "hello";
        System.out.println("Is " + word + "palindrome:" + validPalindrome.isPalindrome(word));

        ExcelSheetColumnTitle excelSheetColumnTitle = new ExcelSheetColumnTitle();
        System.out.println("Excel sheet title:" + excelSheetColumnTitle.convertToTitle(100));

        TitleToNumber titleToNumber = new TitleToNumber();
        System.out.println("Excel sheet title:" + titleToNumber.titleToNumber("XY"));

    }
}
