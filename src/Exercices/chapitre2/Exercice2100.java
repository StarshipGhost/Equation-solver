package Exercices.chapitre2;

import utils.*;

public class Exercice2100 {

  private final double T_AC = 444;
  private Coordinate A, B, C, D, O;
  private Vector3D AB, AC, AD, OA;
  private Matrix T;

  public Exercice2100() {
    this.A = new Coordinate(0, 5.60, 0);
    this.B = new Coordinate(-4.20, 0, 0);
    this.C = new Coordinate(2.40, 0, 4.20);
    this.D = new Coordinate(0, 0, -3.30);
    this.O = new Coordinate(0, 0, 0);
    this.AB = B.subtract3DCoordinate(A);
    this.AC = C.subtract3DCoordinate(A);
    this.AD = D.subtract3DCoordinate(A);
    this.OA = A.subtract3DCoordinate(O);

    System.out.println("========== Exercice 2.100 ==========");
    System.out.println("========== Coordonnées ==========");
    System.out.println("A = " + A);
    System.out.println("B = " + B);
    System.out.println("C = " + C);
    System.out.println("D = " + D);
    System.out.println("O = " + O);

    System.out.println("========== Vecteurs ==========");
    System.out.println("AB = " + AB);
    System.out.println("AC = " + AC);
    System.out.println("AD = " + AD);
    System.out.println("OA = " + OA);

    AB.unitVector();
    AC.unitVector();
    AD.unitVector();
    OA.unitVector();

    this.T =
        new Matrix(
            new double[][] {
              {AB.x(), AD.x(), OA.x(), -(T_AC * AC.x())},
              {AB.y(), AD.y(), OA.y(), -(T_AC * AC.y())},
              {AB.z(), AD.z(), OA.z(), -(T_AC * AC.z())}
            });

    System.out.println("========== Vecteurs unitaire ==========");
    System.out.println("AB = " + AB);
    System.out.println("AC = " + AC);
    System.out.println("AD = " + AD);
    System.out.println("OA = " + OA);

    System.out.println("========== Système d'équations ==========");
    T.solve("P", "AD", "AB");
  }
}
