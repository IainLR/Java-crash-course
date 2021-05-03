package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        String apples = "Apples";
        int appleQuantity = 8;
        int applePrice = 100;
        String oranges = "Oranges";
        int orangeQuantity = 12;
        int orangePrice = 80;

        String column1Heading = "Fruit";
        String column2Heading = "Quantity";
        String column3Heading = "Price";

        System.out.printf("%-12s %8s %6s%n", column1Heading, column2Heading, column3Heading);
        System.out.printf("%-12s %-8d %6d cents%n", apples, appleQuantity, applePrice);
        System.out.printf("%-12s %-8d %6d cents%n", oranges, orangeQuantity, orangePrice);
    }
}
