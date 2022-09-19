public class Bus {
    public static void main(String[] args) {
        String sentence = "Number of passengers: ";
        System.out.println(sentence);
        int passengers = 0;
        System.out.println(sentence + passengers);
        passengers = passengers + 9;
        System.out.println(sentence + passengers);

        passengers = passengers - 5;
        System.out.println(sentence + passengers);

        sentence = "end of shift";
        System.out.println(sentence);
    }
}