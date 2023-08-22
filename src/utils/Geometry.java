package utils;

public class Geometry {
    public static double sin(double x) {
        return Math.sin(x * (Math.PI / 180));
    }
    public static double cos(double x) {
        return Math.cos(x * (Math.PI / 180));
    }


    public static double[] quadraticFormula(double a, double b, double c) {
        double[] x = new double[2];

        double d = 4 * a * c;
        double e = 2 * a;
        double discriminant = Math.sqrt((Math.pow(b, 2)) - d);
        x[0] = (-b + discriminant) / e;
        x[1] = (-b - discriminant) / e;
        return x;
    }

    public static double lawOfSines(double n1, double n2, double m, boolean isComponentMissing) {
        if (isComponentMissing) {
            return n1 * sin(m) / sin(n2);
        } else {
            return Math.toDegrees(Math.asin((sin(n2) * m) / n1));
        }
    }
    public static double lawOfCosines(double a, double b, double γ) {
        return Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)) - (2 * a * b * cos(γ)));
    }
}
