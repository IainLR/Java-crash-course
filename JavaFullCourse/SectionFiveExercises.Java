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
        System.out.println(hasSameLastDigit(112, 222, 333));
        printFactors(6);
        numberToWords(0);
        System.out.println(reverse(98));
        System.out.println(reverse(471));
        System.out.println(getDigitCount(0));
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
            if (year % 4 != 0) {
                return false;
            }
            if (year % 100 != 0) {
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
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
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
        if (number > 0) {
            if (number % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (end < start || start < 0 || end < 0) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
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
                number = number / 10;
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

        while (number > 0) {
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

    //8
    public static boolean hasSameLastDigit(int one, int two, int three) {
        if (isValid(one) && isValid(two) && isValid(three)) {
            return one % 10 == two % 10 || two % 10 == three % 10 || one % 10 == three % 10;
        }

        return false;

    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }

    //9
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int divisor = -1;
        int limit = Math.max(first, second);

        for (int i = 1; i <= limit; i++) {
            if(first % i == 0 && second % i == 0) {
                divisor = i;
            }
            if (divisor > first || divisor > second) {
                break;
            }


        }

        return divisor;

        //          cool algo solution!
//            if (first < 10 || second < 10) {
//                return -1;
//            }
//            while (first != second) {
//                if (first > second)
//                    first = first - second;
//                else {
//                    second = second - first;
//                }
//            }
//            return second;
//          }
    }

    // 21

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }

        int factor;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.printf("%d ", i);
            }
        }

    }

    // 22 (overall, not in section)
    public static boolean isPerfectNumber(int number) {
        if (number >= 1) {
            int result = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    result += i;
                }
            }
            return result == number;
        }
        return false;
    }

//    I would also like to point out two possible optimizations for this code:
//            1) We only need to loop until i <= number / 2. We can exit the loop then.
//
//            2) If the number is odd, we can increment i by +2 each loop iteration to skip unnecessary numbers.
//
//
//    This could be one solution with those optimizations:

//    public static boolean isPerfectNumber(int number) {
//
//        int sumOfProperDivisors = 0;
//        int increment = (number % 2 == 0) ? 1 : 2;
//
//        for (int i = 1; i <= number / 2; i += increment)
//            if (number % i == 0)
//                sumOfProperDivisors += i;
//
//        return sumOfProperDivisors == number && number > 1;
//    }

    // 23
//    public static void numberToWords(int number) {
//        if (number < 0) {
//            System.out.println("Invalid Value");
//        }
//        int lastDigit;
//        String entireNumberString = "";
//        while (number > 0) {
//            lastDigit = number % 10;
//            switch (lastDigit) {
//                case 0:
//                    entireNumberString = "Zero " + entireNumberString;
//                    break;
//                case 1:
//                    entireNumberString = "One " + entireNumberString;
//                    break;
//                case 2:
//                    entireNumberString = "Two " + entireNumberString;
//                    break;
//                case 3:
//                    entireNumberString = "Three " + entireNumberString;
//                    break;
//                case 4:
//                    entireNumberString = "Four " + entireNumberString;
//                    break;
//                case 5:
//                    entireNumberString = "Five " + entireNumberString;
//                    break;
//                case 6:
//                    entireNumberString = "Six " + entireNumberString;
//                    break;
//                case 7:
//                    entireNumberString = "Seven " + entireNumberString;
//                    break;
//                case 8:
//                    entireNumberString = "Eight " + entireNumberString;
//                    break;
//                case 9:
//                    entireNumberString = "Nine " + entireNumberString;
//                    break;
//            }
//            number /= 10;
//        }
//        System.out.println(entireNumberString);
//    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int lastDigit;
        int reverse = reverse(number);
        int reverseLength = getDigitCount(reverse);
        int trueLength = getDigitCount(number);

        String entireNumberString = "";
        if (reverse == 0) {
            entireNumberString = "Zero";
        }

        while (reverse > 0) {
            lastDigit = reverse % 10;
            switch (lastDigit) {
                case 0:
                    entireNumberString += "Zero ";
                    break;
                case 1:
                    entireNumberString += "One ";
                    break;
                case 2:
                    entireNumberString += "Two ";
                    break;
                case 3:
                    entireNumberString += "Three ";
                    break;
                case 4:
                    entireNumberString += "Four ";
                    break;
                case 5:
                    entireNumberString += "Five ";
                    break;
                case 6:
                    entireNumberString += "Six ";
                    break;
                case 7:
                    entireNumberString += "Seven ";
                    break;
                case 8:
                    entireNumberString += "Eight ";
                    break;
                case 9:
                    entireNumberString += "Nine ";
                    break;
            }
            reverse /= 10;
        }
        if (trueLength > reverseLength) {
            for (int i = 1; i <= (trueLength - reverseLength); i++) {
                entireNumberString += "Zero ";
            }
        }
            System.out.println(entireNumberString);

    }

    public static int reverse(int number) {
        int reverse = 0;
        int AbsoluteNumber = Math.abs(number);
        while (AbsoluteNumber >= 10) {
            int lastDigit = AbsoluteNumber % 10;
            AbsoluteNumber /= 10;
            reverse = (reverse + lastDigit) * 10 ;
        }
        reverse += AbsoluteNumber;

        if (number < 0){
            return reverse * -1;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        int counter = 0;
        if (number >= 0) {
            if (number == 0) {
                return 1;
            }
            while (number > 0) {
                number /= 10;
                counter++;
            }
            return counter;
        }

        return -1;
    }



}
