package Exercices.chapitre3;

import utils.Vector2D;
import utils.Vector3D;

public class Exercice3106 {

    private Vector2D r1, r2, r3, F1, F2, F3, R, r_Ra, r_Rb;
    private Vector3D M_R1, M_R2, M_R3, M_RDa, M_RDb;

    public Exercice3106() {

        this.r1 = new Vector2D(0.25, 0.0);
        this.r2 = new Vector2D(r1.x() + 0.85, 0.0);
        this.r3 = new Vector2D(r1.x() + r2.x() + 0.625, 0.0);

        this.F1 = new Vector2D(0.0, -16.4);
        this.F2 = new Vector2D(0.0, -16.4);
        this.F3 = new Vector2D(0.0, -14.0);

        this.M_R1 = r1.crossProduct(F1);
        this.M_R2 = r2.crossProduct(F2);
        this.M_R3 = r3.crossProduct(F3);

        this.R = new Vector2D(0, F1.y() + F2.y() + F3.y());
        this.M_RDa = new Vector3D(M_R1.x() + M_R2.x() + M_R3.x(), M_R1.y() + M_R2.y() + M_R3.y(), M_R1.z() + M_R2.z() + M_R3.z());
        this.r_Ra = new Vector2D( R.y() / M_RDa.z(), 0.0);

        System.out.println("========== Exercice 3.106 ==========");
        System.out.println("M_R1 = " + M_R1);
        System.out.println("M_R2 = " + M_R2);
        System.out.println("M_R3 = " + M_R3);
        System.out.println("Force résultate = " + R);
        System.out.println("M_RD = " + M_RDa);

        System.out.println("========== Distance entre D et la ligne d'action de R ==========");
        System.out.println("r = " + r_Ra);

        this.r_Rb = new Vector2D(2.1 / 2, 0.0);
        this.M_RDb = r_Rb.crossProduct(R);
        double d = ((M_RDb.z() - M_R1.z() - M_R2.z()) / F3.y()) - r2.x() ;

        System.out.println("========== Distance d pour que la résultante passe par le millieu de la barre ==========");
        System.out.printf("Distance d = %.4f %n", d);





    }
}
