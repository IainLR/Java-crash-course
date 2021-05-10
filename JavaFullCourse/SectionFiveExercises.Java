package academy.learnprogramming;

import com.sun.source.tree.IfTree;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println(isLeapYear(1600));
//        System.out.println(isOdd(1));
//        System.out.println(sumDigits(32123));
//        System.out.println(isPalindrome(-1221));
//        System.out.println(sumFirstAndLastDigit(222));
        System.out.println(getEvenDigitSum(2344));
        System.out.println(hasSharedDigit(22, 31));
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

    //video challenge digit sum
    // my solution
    public static int sumDigits(int number) {
        int counter = 0;
        if (number >= 10) {
            while (number >= 10) {
                counter += (number % 10);
                number = number/10;
                if (number < 10) {
                    return counter += number;
                }
            }
        }
        return -1;
    }
    // instructor solution:
    public static int sumDigits(int number, int ignore) {
       if (number < 10) {
           return -1;
       }

       int sum = 0;

       while (number > 0) {
           //isolate least sig digit (last digit)
           int digit = number % 10;
           sum += digit;
           //drop least sig digit
           number /= 10;
       }

       return sum;
    }


    // 4
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int lastDigit;
        int comparisonNumber = Math.abs(number);
        number = comparisonNumber;

        while(number > 0) {
            lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;

//            if (number < 10) {
//                reverse *= 10;
//                reverse += number;
//                System.out.println(reverse);
//                break;
//            }
        }

        return comparisonNumber == reverse;
    }

    //5
    public static int sumFirstAndLastDigit(int number) {
        int lastDigit;
        if (number >= 0) {
            lastDigit = number % 10;
            while (number >= 10) {
                number /= 10;
            }

            return lastDigit + number;
        }
        return -1;
    }

    //6
    public static int getEvenDigitSum(int number) {
        int sum = 0;
        int lastDigit;

        if (number >= 0) {
            while (number > 0) {
                lastDigit = number % 10;
                if (lastDigit % 2 == 0) {
                    sum += lastDigit;
                }
                number /= 10;
            }
            return sum;
        }

        return -1;
    }

    //7
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
            return false;
        }

        int lastDigitOne = firstNumber % 10;
        int lastDigitTwo = secondNumber % 10;
        firstNumber /= 10;
        secondNumber /= 10;
        return lastDigitOne == lastDigitTwo || lastDigitOne == secondNumber
                || firstNumber == lastDigitTwo || firstNumber == secondNumber;

        // Q&A Answer
//        if((x > 99) || (x < 10) || (y > 99) || (y < 10)) {
//            return false;
//        }else {
//            return((x/10 == y/10)||(x/10 == y % 10)||(y/10 == x % 10)||(x%10 == y%10));
//        }
    }


}
