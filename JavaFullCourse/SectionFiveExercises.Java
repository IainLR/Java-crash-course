package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isLeapYear(1600));
        System.out.println(isOdd(1));
    }
    // 1
    public static void printNumberInWord(int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }

    //2

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 != 0){
                return false;
            }
            if (year % 100 != 0){
                return true;
            }
            if (year % 400 == 0) {
                return true;
            }
        }

        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        boolean isLeapYear = isLeapYear(year);
        if (isLeapYear && month == 2) {
            return 29;
        }
        int daysInMonth;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                 daysInMonth = 31;
                break;
            case 4: case 6: case 9: case 11:
                daysInMonth = 30;
                break;
            case 2:
                daysInMonth = 28;
                break;
            default:
                daysInMonth = -1;
                break;
        }

        return daysInMonth;
    }

    // 3
    public static boolean isOdd(int number) {
        if(number > 0) {
            if (number % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if(end < start || start < 0 || end < 0){
            return -1;
        }

        for (int i = start; i <= end; i++){
            if (isOdd(i)) {
                sum += i;
            }
        }

        return sum;
    }



}
