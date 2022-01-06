package sampleCode;

public class SameSign {

    public static boolean haveSameSign(double first, double second) {
        return first >= 0 && second >= 0 || first < 0 && second < 0;
    }

    public static void main(String[] args) {
        System.out.println(haveSameSign(-1, -3.2));
        System.out.println(haveSameSign(2.3, 0.2));
        System.out.println(haveSameSign(0.0, 0.0));
        System.out.println(haveSameSign(8.2, -2.9));
        System.out.println(haveSameSign(-7.1, 0));
    }
    
}
