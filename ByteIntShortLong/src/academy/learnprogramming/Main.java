package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
     int myValue= 10000;
     int myMinIntValue = Integer.MIN_VALUE;
     int myMaxIntValue= Integer.MAX_VALUE;
        System.out.println("Integer Min Value " + myMinIntValue);
        System.out.println("Integer Max Value " + myMaxIntValue);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min Value " + myMinByteValue);
        System.out.println("Byte Max Value " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min Value " + myMinShortValue);
        System.out.println("Short Max Value " + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Min Value " + myMinLongValue);
        System.out.println("Long Max Value " + myMaxLongValue);

        long myLongValue= 100L;

        short bigShortLittleValue = 32767;

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte)(myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

        byte challangeByte= 120;
        short challangeShort = 32500;
        int challangeInt = 50000;
        long challangeLong = 50000L + (challangeInt + challangeShort + challangeByte * 10);

        System.out.println("Challange Number " + challangeLong);

    }
}