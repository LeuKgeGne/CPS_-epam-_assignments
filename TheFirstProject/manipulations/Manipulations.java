package bsuir.epam.first_application.manipulations;

public class Manipulations {
    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        return (a == b || b == c || a == c) ? true : false;
    }

    public static boolean isEquilateralTriangle(int a, int b, int c) {
        return (a == b && b == c) ? true : false;
    }

    public static boolean isRightTriangle(int a, int b, int c) {
        if ((c * c) == ((a * a) + (b * b))) {
            return true;
        } else if ((b * b) == ((a * a) + (c * c))) {
            return true;
        } else if ((a * a) == ((b * b) + (c * c))) {
            return true;
        } else {
            return false;
        }
    }
}
