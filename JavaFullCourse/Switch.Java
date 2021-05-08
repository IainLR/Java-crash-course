package academy.learnprogramming;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int value = 3;
        if (value == 1){
            System.out.println("Value was 1");
        } else if (value == 2){
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1, 2, 3, 4, or 5");
                break;
        }

        char myChar = 'A';

        switch (myChar) {
            case 'A':
                System.out.println("The char 'A' has been found");
                break;

            case 'B':
                System.out.println("The char 'B' has been found");
                break;

            case 'C':
                System.out.println("The char 'C' has been found");
                break;

            case 'D':
                System.out.println("The char 'D' has been found");
                break;

            case 'E':
                System.out.println("The char 'E' has been found");
                break;

            default:
                System.out.println("Not found");
                break;
        }

        String month = "OCTOBER";

        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            case "october":
                System.out.println("Oct");
                break;
            default:
                System.out.println("Nah");
                break;
        }


        printDayOfTheWeek(0);
    }

    private static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
            //shift tab to move to the left
            
        }
    }
}
