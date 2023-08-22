package Exercices.chapitre2;

import utils.Vector3D;

import static utils.Geometry.*;

public class Exercice275 {
    private final double F_x = 110.3;
    private final double XZ_PLAN_ANGLE = 50;
    private final double YZ_PLAN_ANGLE = 30;
    private Vector3D T_AD;

    public Exercice275() {
        double F_h = lawOfSines(F_x, XZ_PLAN_ANGLE, 90.0, true);
        double F = lawOfSines(F_h, YZ_PLAN_ANGLE, 90.0, true);
        double F_y = lawOfSines(F_h, YZ_PLAN_ANGLE, 180 - 90 - 30, true);
        double F_z = lawOfSines(F_x, XZ_PLAN_ANGLE, 180 - 90 - 50, true);
        this.T_AD = new Vector3D(F_x, F_y, -F_z);
        System.out.println("T_AD = " +  String.format("%.1f",F));
        System.out.println("T_AD components = " + T_AD);
        System.out.println("X angle: " + String.format("%.1f", T_AD.XAngle(T_AD.norm(), T_AD.x())));
        System.out.println("Y angle: " + String.format("%.1f", T_AD.YAngle(T_AD.norm(), T_AD.y())));
        System.out.println("Z angle: " + String.format("%.1f",T_AD.ZAngle(T_AD.norm(), T_AD.z())));
    }
}
