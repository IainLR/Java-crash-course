package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    int count = 0;
	    while (count != 5) {
            System.out.println("Count is " + count);
            count++;
        }

	    count = 1;
	    while(true) {
	        if (count == 5) {
	            break;
            }
            System.out.println("Count is " + count);
	        count++;
        }

	    // do while will always execute at least once
	    count = 1;
	    do{
            System.out.println("Count was " + count);
            count++;
        } while(count != 5);

	    int number = 4;
	    int finishNumber = 20;
        // continue is the coolest
	    while(number <= finishNumber) {
	        number++;
	        if (!isEvenNumber(number)){
	            continue;
            }
            System.out.println("Even number " + number);
        }

    }

    public static boolean isEvenNumber(int number) {
        if(number % 2 == 0) {
            return true;
        }
        return false;
    }
}
