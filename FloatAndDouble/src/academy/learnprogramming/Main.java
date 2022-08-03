package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min value" + myMinFloatValue);
        System.out.println("Float max value" + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double min value" + myMinDoubleValue);
        System.out.println("Double max value" + myMaxDoubleValue);

        int myIntValue = 5 / 2;
        float myFloatValue= 5f / 2f;
        double myDoubleValue= 5d /2d;
        System.out.println("MyIntValue" + myIntValue);
        System.out.println("MyFloatValue" + myFloatValue);
        System.out.println("MyDoubleValue" + myDoubleValue);

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted Kg's " + convertedKilograms);

    }
}