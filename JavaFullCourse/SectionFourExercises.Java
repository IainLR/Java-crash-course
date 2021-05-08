package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // printMegaBytesAndKiloBytes(2500);
        // System.out.println(isLeapYear(1924));
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int kiloRemainder = kiloBytes % 1024;

            System.out.printf("%d KB = %d MB and %d KB%n", kiloBytes, megaBytes, kiloRemainder);
        }
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking) {
            if (hourOfDay >= 0 && hourOfDay < 8 || hourOfDay == 23) {
                return true;
            }
//            return false;
        }

        return false;
    }

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

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
//        int checkFirst = (int) (first * 1000);
//        int checkSecond = (int) (second * 1000);
//        return checkFirst == checkSecond;
        // Math.pow(10, 3) the 3 is decimal places
        int checkFirst = (int) (first * Math.pow(10, 3));
        int checkSecond = (int) (second * Math.pow(10,3));
        return checkFirst == checkSecond;

    }

    public static boolean hasEqualSum(int firstNum, int secondNum, int thirdNum){
        if ((firstNum + secondNum) == thirdNum){
            return true;
        }
        return false;
    }

    public static boolean hasTeen(int firstNum, int secondNum, int thirdNum) {
//        if (firstNum >= 13 && firstNum <= 19){
//            return true;
//        }
//        if (secondNum >= 13 && secondNum <= 19){
//            return true;
//        }
//        if (thirdNum >= 13 && thirdNum <= 19){
//            return true;
//        }
//        boolean check = isTeen(firstNum);
//        if(check) return check;
//        check = isTeen(secondNum);
//        if(check) return check;
//        check = isTeen(thirdNum);
//        if(check) return check;
//        return check;

        if (isTeen(firstNum) || isTeen(secondNum) || isTeen(thirdNum)) {
            return true;
        }

        return false;
    }

    public static boolean isTeen(int num) {
        if (num >= 13 && num <= 19){
            return true;
        }
        return false;
    }

}
