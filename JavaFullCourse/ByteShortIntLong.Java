package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myValue = 1000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.printf("Integer Minimum Value = %d%n", myMinIntValue);
        System.out.printf("Integer Maximum Value = %d%n", myMaxIntValue);
        System.out.printf("Busted Maximum Value = %d%n", myMaxIntValue + 1);
        System.out.printf("Busted Minimum Value = %d%n", myMinIntValue - 1);

        int myMaxInt = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.printf("Byte Minimum Value = %d%n", myMinByteValue);
        System.out.printf("Byte Maximum Value = %d%n", myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.printf("Short Minimum Value = %d%n", myMinShortValue);
        System.out.printf("Short Maximum Value = %d%n", myMaxShortValue);

        // Size of Primitive Types and Width
        // Byte occupies 8 bits, We say that a byte has a width of 8
        // short occupies 16 bits, width of 16
        // int occupies 32 bits, and has a width of 32
        // each primitive type occupies a different amount of memory
        // An int needs 4 times the amount of space a byte does

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.printf("Long Minimum Value = %d%n", myMinLongValue);
        System.out.printf("Long Maximum Value = %d%n", myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_432L;
    }
}
