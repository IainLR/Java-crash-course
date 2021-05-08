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


}
