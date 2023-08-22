package Exercices.chapitre3;

import utils.*;
import static utils.Geometry.*;


public class Exercice371 {
    private final double NORM_F = 40;
    private final int XY_Angle = 20;
    private final double r = 270 * Math.pow(10, -3);
    private final double r_AB = 390 * Math.pow(10, -3);
    private final double r_AC = (390 + 270) * Math.pow(10, -3);
    private Vector2D F1, F2;
    public Exercice371() {
        this.F1 = new Vector2D(NORM_F, XY_Angle);
        this.F2 = new Vector2D(-NORM_F, XY_Angle);
        System.out.println("F1 components = " + F1);
        System.out.println("F2 components = " + F2);
        System.out.println("------------------------------------");
        double M1 = F1.momentOfAForce(r, F1.norm(), 55 - XY_Angle);
        System.out.printf("Moment of the force F1 = %.2f %n", M1);
        System.out.println("------------------------------------");
        System.out.printf("Decomposing x and y components = %.2f %n", F1.momentOfAForce(r, F1.x(), 180 + 55) + F1.momentOfAForce(r, F1.y(), 35));
        System.out.println("------------------------------------");
        double d = lawOfSines(r, 90, 55 - XY_Angle, true);
        System.out.printf("Perpendicular distance = %.2f %n", NORM_F * d);
        System.out.println("------------------------------------");
        double M2 = F1.momentOfAForce(r_AC, F1.norm(), 55 - XY_Angle) + F2.momentOfAForce(r_AB, -F2.norm(), 55 - XY_Angle);
        System.out.printf("Sum of both moments from point A = %.2f", M2);




    }
}
