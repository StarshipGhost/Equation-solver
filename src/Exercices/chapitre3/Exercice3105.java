package Exercices.chapitre3;

import utils.Vector2D;
import utils.Vector3D;

public class Exercice3105 {

    private Vector2D FA, FB, FCa, FCb, Ra, Rb, rA, rB, r;
    private Vector3D M_A, M_B, M_RCa, M_RCb;

    public Exercice3105() {

        this.FA = new Vector2D(0.0, -336.0);
        this.FB = new Vector2D(0.0, -256.0);
        this.FCa = new Vector2D(0.0, -240.0);
        this.FCb = new Vector2D(0.0, -208.0);
        this.Ra = new Vector2D(0.0, FA.y() + FB.y() + FCa.y());
        this.Rb = new Vector2D(0.0, FA.y() + FB.y() + FCb.y());

        this.rA = new Vector2D(2.0, 0.0);
        this.rB = new Vector2D(-2.0, 0.0);
        this.r = new Vector2D(0.0, 0.0);

        this.M_A = rA.crossProduct(FA);
        this.M_B = rB.crossProduct(FB);
        this.M_RCa = r.crossProduct(Ra);
        this.M_RCb = r.crossProduct(Rb);

        System.out.println("M_A = " + M_A);
        System.out.println("M_B = " + M_B);
        System.out.println("M_A + M_B = " + (M_A.z() + M_B.z()));
        System.out.println("M_RC = " + M_RCa);
        System.out.println("M_RC = " + M_RCb);
        double p1 = (M_RCa.z() - M_A.z() - M_B.z()) / FCa.y();
        double p2 = (M_RCb.z() - M_A.z() - M_B.z()) / FCb.y();
        System.out.printf("a) Position du troisième enfant à partir de C: %.4f (À droite) %n", Math.abs(p1));
        System.out.printf("b) Position du troisième enfant à partir de C: %.4f (À droite) %n", Math.abs(p2));
    }
}
