package academy.learningprogram;

public class Main {
    public static void main(String[] args) {

        byte challangeByte= 10;
        short challangeShort = 20;
        int challangeInt = 50;
        long challangeLong = 50000L + 10L * (challangeInt + challangeShort + challangeByte );

        System.out.println("Challange Number " + challangeLong);

    }
}