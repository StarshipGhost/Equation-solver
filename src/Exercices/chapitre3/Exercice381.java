package Exercices.chapitre3;

import utils.Vector2D;

public class Exercice381 {

    private final double NORM_T = 560;
    private final int ANGLE_BETWEEN_X_AXIS_AND_T = 20;
    private final int ANGLE_BETWEEN_X_AXIS_AND_AC = 30;
    private final double r_BC = 10;
    private final double r_AC = r_BC + 8;
    private Vector2D T;

    public Exercice381() {

        System.out.println("========== Exercice 3.81 ==========");
        this.T = new Vector2D(NORM_T, 20);
        double M1 = T.momentOfAForce(r_AC, NORM_T, ANGLE_BETWEEN_X_AXIS_AND_T + ANGLE_BETWEEN_X_AXIS_AND_AC);
        double M2 = T.momentOfAForce(r_BC, NORM_T, ANGLE_BETWEEN_X_AXIS_AND_T + ANGLE_BETWEEN_X_AXIS_AND_AC);
        System.out.printf("Moment de force à partir du point A = %.0f %n", M1);
        System.out.printf("Moment de force à partir du point B = %.0f %n", M2);
    }
}
