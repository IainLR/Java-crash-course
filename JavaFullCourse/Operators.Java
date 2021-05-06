package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// You understand operator fundamentals
        // Modulo %, returns remainder.
        int result = 4;
        result = result % 3;
        System.out.println(result);

        // Abbreviating operators
        // result = result + 1
        result++; //
        System.out.println(result);
        // result = result - 1
        result--;
        System.out.println(result);
        //result = result + 2
        result += 2;
        System.out.println(result);
        // result = result * 10
        result *= 10;
        System.out.println(result);
        //result = result / 3
        result /= 3;
        System.out.println(result);
        //result = result - 2
        result -= 2;
        System.out.println(result);

        // control flow and if-then. Conditional logic.
        // use a code block
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("it is not an alien");
        }
        if (!isAlien) {
            System.out.println("it is still not an alien");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("it's a high score!");
        }

        int secondTopScore = 60;
        // logical and operator &&
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }
        // logical or operator ||
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of conditions have been satisfied");
        }

        //
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("this will run, despite lack of second '='");
        }

        // Ternary
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }
        // operator challenge
        double twenty = 20.00d;
        double eighty = 80.00d;
        double addAndMultiply = (twenty + eighty) * 100.00d;
        System.out.println(addAndMultiply);
        double remainder = addAndMultiply % 40.00d;
        System.out.println(remainder);
        boolean isZero = (remainder == 0) ? true : false;
        System.out.println(isZero);
        if (!isZero) {
            System.out.println("Got some remainder");
        }

    }
}
