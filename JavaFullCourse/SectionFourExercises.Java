package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        //printMegaBytesAndKiloBytes(2500);
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

}
