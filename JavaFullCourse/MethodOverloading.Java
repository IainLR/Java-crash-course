package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
       int newScore = calculateScore("Doug", 500);
        System.out.println("New score is " + newScore);
        calculateScore();

//        System.out.println(calcFeetAndInchesToCentimeters(2, 8));
        System.out.println(calcFeetAndInchesToCentimeters(81.4));
        System.out.println(getDurationString(80, 25));
        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(4825));
        System.out.println(getDurationString(3945));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.printf("Player %s scored %d points%n", playerName, score);
        return score * 1000;
    }

    // we can overload the method by changing
    // the number of args/parameters
    // the parameters are part of the unique
    // method signature
    public static int calculateScore( int score) {
        System.out.printf("Unnamed player scored %d points%n", score);
        return score * 1000;
    }

    public static int calculateScore( ) {
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12){
            double totalInches = (feet * 12) + inches;
            return totalInches * 2.54;
        }
        return -1;
    }
    // here we overload our function and call the other
    // version inside our new one
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0){
            double remainingInches = inches % 12;
            // double remainingInches = (int) inches % 12;
            double feet = (inches - remainingInches) / 12;
            // double feet = (int) inches / 12;
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
        return -1;
    }

    //method overloading, particularly cool for something
    // like a sum method, so that the only difference is
    // the number of parameters you wish to sum

    // improves code readability and re-usability
    // easier to remember one name
    // achieves consistency in naming

    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds <= 59){
            int hours = (int) minutes / 60;
            int remainingMinutes = (int) minutes % 60;
            if (seconds == 0){
                return hours +"h " + remainingMinutes + "m " + "00s";
            }
            return hours +"h " + remainingMinutes + "m " + seconds + "s";
        }
        return "Invalid value";
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutes = seconds / 60;
            int remainderSeconds = seconds % 60;
            return getDurationString(minutes, remainderSeconds);
        }
        return "Invalid value";
    }

}
