package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(calculateInterest(10000.0, 2.0));

       // for (init; termination; increment) {}
        for (int i = 2; i < 9; i++) {
            //String.format is limiting decimal places
            System.out.println(String.format("%.2f",calculateInterest(10000.0, i)));
        }

        for (int i = 8; i > 1; i--) {
            //String.format is limiting decimal places
            System.out.println(String.format("%.2f",calculateInterest(10000.0, i)));
        }

        int count = 0;
        for (int i = 1; i < 10; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(isPrime(i));
                System.out.println(i);
                if (count >= 3){
                    //exit loop
                    break;
                }
            }
        }

    }



    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));

    }



    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        // replace n/2 with square root for performance, less loops
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
