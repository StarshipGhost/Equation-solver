package Exercices.chapitre2;

import utils.*;

public class Exercice2123 {

  private final double NORM_W = -270;
  private final double NORM_Q = 36;
  private Coordinate A, B, C;
  private Vector3D AB, AC, P, Q, W, unitVectorAB, unitVectorAC;
  private Matrix T1, T2;

  public Exercice2123() {
    this.A = new Coordinate(0, -720, 0);
    this.B = new Coordinate(-480, 0, -160);
    this.C = new Coordinate(240, 0, -130);

    System.out.println("========== Exercices 2.123 ==========");
    System.out.println("========== Coordonnées ==========");
    System.out.println("A = " + A);
    System.out.println("B = " + B);
    System.out.println("C = " + C);

    this.AB = B.subtract3DCoordinate(A);
    this.AC = C.subtract3DCoordinate(A);
    this.P = new Vector3D(1, 0, 0);
    this.Q = new Vector3D(0, 0, 1);
    this.W = new Vector3D(0, 1, 0);

    System.out.println("========== Vecteurs ==========");
    System.out.println("AB = " + AB);
    System.out.println("AC = " + AC);

    AB.unitVector();
    AC.unitVector();

    System.out.println("========== Vecteurs unitaire ==========");
    System.out.println("AB = " + AB);
    System.out.println("AC = " + AC);

    this.T1 = new Matrix(new double[][] {
            {AB.x() + AC.x(), P.x(), Q.x(), 0},
            {AB.y() + AC.y(), P.y(), Q.y(), -NORM_W},
            {AB.z() + AC.z(), P.z(), Q.z(), 0}
    });

    this.T2 = new Matrix(new double[][] {
            {AB.x() + AC.x(), P.x(), W.x(), -Q.x() * NORM_Q},
            {AB.y() + AC.y(), P.y(), W.y(), -Q.y() * NORM_Q},
            {AB.z() + AC.z(), P.z(), W.z(), -Q.z() * NORM_Q}
    });

    System.out.println("========== Système d'équation ==========");
    T1.solve("T_AB=T_AC", "P", "Q");
    T2.solve("T_AB=T_AC", "P", "W");
  }
}
