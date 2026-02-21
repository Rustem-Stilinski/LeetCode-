public class Main {
    public static void main(String[] args) {
        PartitionIntoMinimum test = new PartitionIntoMinimum();
        int result = test.minPartitions("32");
        System.out.println(result);

        DateToSpring dateToSpring = new DateToSpring();
        System.out.println(dateToSpring.convertDateToBinary("2025-11-23"));

        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverseDegree("abxsx"));
    }
}
