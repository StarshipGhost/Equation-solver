package Exercices.chapitre2;

import utils.Coordinate;
import utils.Vector3D;

import static utils.Geometry.*;

public class Exercice2133 {

    private final double T = 3900;
    private final double y = 11.2;
    private final double NORM_AB = 13;
    private final int ANGLE_BOX = 20;
    private Coordinate A, B, C, D;
    private Vector3D AO, AB, unitVectorAB, forceVectorAB, F_AB;

    public Exercice2133() {

        double angle_OBA = lawOfSines(NORM_AB, 90, y, false);
        double angle_OAB = 180 - 90 - angle_OBA;
        double OB = lawOfSines(NORM_AB, 90, angle_OAB, true);
        double OB_z = lawOfSines(OB, 90, ANGLE_BOX, true);
        double OB_x = lawOfSines(OB, 90, 180 - 90 - ANGLE_BOX, true);
        double OB_y = y;

        System.out.println("========== Exercice 2.133 ==========");
        this.A = new Coordinate(0, y, 0);

        System.out.println("========== Coordonnées ==========");
        System.out.println("A = " + A);

        this.AB = new Vector3D(-OB_x, OB_y, OB_z);

        System.out.println("========== Vecteurs ==========");
        System.out.println("AB = " + AB);

        this.unitVectorAB = AB.unitVector();

        System.out.println("========== Vecteurs unitaire ==========");
        System.out.println("AB = " + unitVectorAB);

        this.forceVectorAB = unitVectorAB.multiplyComponents(T);
        this.F_AB = new Vector3D("T_AB", T, angle_OAB, ANGLE_BOX);

        System.out.println("========== Vecteurs force ==========");
        System.out.println("T_AB = " + forceVectorAB);
        System.out.printf("T_AB = (%.1f, %.1f, %.1f) %n", -F_AB.x(), F_AB.y(), F_AB.z());
        System.out.println(F_AB.getName() + " = " + F_AB);

        System.out.println("========== Direction AB ==========");
        System.out.println("X angle: " + String.format("%.1f", forceVectorAB.XAngle(forceVectorAB.norm(), forceVectorAB.x())));
        System.out.println("Y angle: " + String.format("%.1f", forceVectorAB.YAngle(forceVectorAB.norm(), forceVectorAB.y())));
        System.out.println("Z angle: " + String.format("%.1f",forceVectorAB.ZAngle(forceVectorAB.norm(), forceVectorAB.z())));

    }
}
