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

        int low = 0;
        int high = 0;

        while (true) {
            System.out.println("Enter number");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                if (number > high) {
                    high = number;
                }
                if (number < low) {
                    low = number;
                }
            } else {
                break;
            }

        }

        System.out.println("Your high number was: " + high );
        System.out.println("Your low number was: " + low );
        scanner.close();
    }

}
