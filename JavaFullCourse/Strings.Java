package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    // byte
	    // short
	    // int - common
	    // long
	    // float
	    // double - common
	    // char
	    // boolean - common

        // String is a class
        String myString = "Behold! The String";
        System.out.printf("oh, my string? It is: '%s'%n", myString);
        myString = myString + "'Bonus String!?'";
        System.out.printf("oh, my string? It is: '%s'%n", myString);

        String numberString = "250.55";

        String lastString = "10";
        int myInt = 50;
        int parseLastString = Integer.parseInt(lastString) + myInt;
        System.out.println("lastString is equal to " + parseLastString);

        

    }
}
