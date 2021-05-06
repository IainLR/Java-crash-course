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
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }
    }
}
