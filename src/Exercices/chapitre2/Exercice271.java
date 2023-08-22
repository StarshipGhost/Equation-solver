package Exercices.chapitre2;

import utils.Vector3D;

public class Exercice271 {

    private Vector3D F1, F2;
    private final double NORM_F1 = 600;
    private final double NORM_F2 = 450;
    private final int YZ_ANGLE_F1 = 180 - 90 - 65;
    private final int YZ_ANGLE_F2 = 180 - 90 - 35;
    private final int XZ_ANGLE_F1 = 30;
    private final int XZ_ANGLE_F2 = 180 - 90 - 40;

    public Exercice271() {

        this.F1 = new Vector3D("F1", NORM_F1, YZ_ANGLE_F1, XZ_ANGLE_F1);
        System.out.println("F1 = " + F1);
        System.out.println("X angle: " + String.format("%.1f", F1.XAngle(NORM_F1, F1.x())));
        System.out.println("Y angle: " + String.format("%.1f", F1.YAngle(NORM_F1, F1.y())));
        System.out.println("Z angle: " + String.format("%.1f", F1.ZAngle(NORM_F1, F1.z())));
        System.out.println("------------------------------");
        this.F2 = new Vector3D("F2", NORM_F2, YZ_ANGLE_F2, (180 - 90 - XZ_ANGLE_F2) + 90);
        System.out.println("F2 = " + F2);
        System.out.println("X angle: " + String.format("%.1f", F2.XAngle(NORM_F2, F2.x())));
        System.out.println("Y angle: " + String.format("%.1f", F2.YAngle(NORM_F2, F2.y())));
        System.out.println("Z angle: " + String.format("%.1f", F2.ZAngle(NORM_F2, F2.z())));
    }
}

