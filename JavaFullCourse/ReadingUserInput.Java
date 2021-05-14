package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner((System.in));

//        System.out.println("Enter your year of birth:");
//
//        boolean hasNextInt = scanner.hasNextInt();
//        if (hasNextInt) {
//            int yearOfBirth = scanner.nextInt();
//            scanner.nextLine(); //handle next line character (enter key)
//
//            System.out.println("Enter your name: ");
//            String name = scanner.nextLine();
//            int age = 2021 - yearOfBirth;
//
//            if (age >= 0 && age <= 100) {
//                System.out.println("Hello " + name + ", and you are about " + age + " years old");
//            } else {
//                System.out.println("Invalid year of birth");
//            }
//        } else {
//            System.out.println("Unable to parse year of birth");
//        }
//
//        scanner.close();

        //CHALLENGE
//        int count = 1;
//        int sum = 0;
//        while (count < 11) {
//            System.out.println("Enter number #" + count);
//            boolean hasNextInt = scanner.hasNextInt();
//            if (hasNextInt) {
//                int number = scanner.nextInt();
//                sum += number;
//                count++;
//            } else {
//                System.out.println("Invalid Number");
//
//            }
//            // prevent infinite loop if invalid entry
//            scanner.nextLine(); // handle end of line (enter key)
//
//        }
//        System.out.println("Your Total is: " + sum);

        //CHALLENGE

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
//        boolean first = true;

        while (true) {
            System.out.println("Enter number");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();

//                if (first) {
//                    high = number;
//                    low = number;
//                    first = false;
//                }

                if (number > high) {
                    high = number;
                }

                if (number < low) {
                    low = number;
                }
            } else {
                break;
            }

            scanner.nextLine(); // handle input

        }

        System.out.println("Your high number was: " + high );
        System.out.println("Your low number was: " + low );
        scanner.close();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner((System.in));

        int sum = 0;
        int count = 0;
        double average;

        while (true) {
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;

            } else {
                break;
            }

            scanner.nextLine();

        }
        average = (double)sum / count;
        System.out.println("SUM = " + sum + " AVG = " + Math.round(average));

        scanner.close();
    }

}
