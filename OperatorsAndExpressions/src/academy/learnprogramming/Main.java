package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);

        result = result * 10;
        System.out.println("2 * 10 =" + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3;
        System.out.println("4 % 3 = " + result);

        //result = result + 1
        result++;
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        //result = result +2
        result += 2;
        System.out.println("1 + 2 = " + result);

        result *= 10;
        System.out.println("3 * 10 = " + result);

        result /= 3;
        System.out.println("30 / 3 = " + result);

        result -= 2;
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == true) {
            System.out.println("Its not an Alien");
        } else {
            System.out.println("OH no its an Alien");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the High Score");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second Score, less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or Both are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("this is the right way");
        }

        boolean isCar = false;
        if(isCar){
            System.out.println("This isn't supposed to work");
        }

        isCar = true;
            boolean wasCar = isCar ? true : false;
        if(wasCar){
            System.out.println("wasCar is true");
        }

        double challangeDoubleOne = 20.00d;
        double challangeDoubleTwo = 80.00d;

        double doubleTotal = (challangeDoubleTwo + challangeDoubleOne) * 100.00d;
        System.out.println(doubleTotal);

        double remainder = doubleTotal % 40.00d;
        System.out.println(remainder);

        boolean isNoRemainder = (remainder == 0 ) ? true:false;
        System.out.println(isNoRemainder);

        if(!isNoRemainder){
            System.out.println("Got Something");
        }



    }
}
