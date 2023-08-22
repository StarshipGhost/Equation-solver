package Exercices.chapitre2;

import utils.*;

public class Exercice273 {
    private final double NORM_T_AC = 120;
    private final int ANGLE_BETWEEN_T_AC_AND_Z_AXIS = 180 - 90 - 60;
    private final int ANGLE_BETWEEN_Z_AND_X_AXIS = 20;
    private Vector3D T_AC;

    public Exercice273() {
        this.T_AC = new Vector3D("T_AC", NORM_T_AC, ANGLE_BETWEEN_T_AC_AND_Z_AXIS, ANGLE_BETWEEN_Z_AND_X_AXIS);
        this.T_AC = new Vector3D(T_AC.x(), -T_AC.y(), -T_AC.z());
        System.out.println("T_AC components = " + T_AC);
        System.out.println("X angle: " + String.format("%.1f", T_AC.XAngle(T_AC.norm(), T_AC.x())));
        System.out.println("Y angle: " + String.format("%.1f", T_AC.YAngle(T_AC.norm(), T_AC.y())));
        System.out.println("Z angle: " + String.format("%.1f",T_AC.ZAngle(T_AC.norm(), T_AC.z())));
    }
}
