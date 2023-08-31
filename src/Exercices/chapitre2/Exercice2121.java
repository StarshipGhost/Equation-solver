package Exercices.chapitre2;

import utils.*;

public class Exercice2121 {

  public final double Wy = -1000;
  private Coordinate A, B, C, D, E, F;
  private Vector3D AB, AC, AD, AE, FB, W;
  private Matrix T1, T2;

  public Exercice2121() {

    this.A = new Coordinate(0, -1.60, 0);
    this.B = new Coordinate(-0.78, 0, 0);
    this.C = new Coordinate(0, 0, 1.20);
    this.D = new Coordinate(1.30, 0, 0.40);
    this.E = new Coordinate(-0.40, 0, -0.86);
    this.F = new Coordinate(-0.78, -1.60, 0);
    this.AB = B.subtract3DCoordinate(A);
    this.AC = C.subtract3DCoordinate(A);
    this.AD = D.subtract3DCoordinate(A);
    this.AE = E.subtract3DCoordinate(A);
    this.FB = B.subtract3DCoordinate(F);

    System.out.println("========== Exercices 2.121 ==========");

    System.out.println("========== Coordonnées ==========");
    System.out.println("A = " + A);
    System.out.println("B = " + B);
    System.out.println("C = " + C);
    System.out.println("D = " + D);
    System.out.println("E = " + E);

    System.out.println("========== Vecteurs ==========");
    System.out.println("AB = " + AB);
    System.out.println("AC = " + AC);
    System.out.println("AD = " + AD);
    System.out.println("AE = " + AE);
    System.out.println("FB = " + FB);

    AB.unitVector();
    AC.unitVector();
    AD.unitVector();
    AE.unitVector();
    FB.unitVector();
    this.T1 =
        new Matrix(
            new double[][] {
              {AB.x() + AD.x(), AE.x(), AC.x(), 0},
              {AB.y() + AD.y(), AE.y(), AC.y(), -Wy},
              {AB.z() + AD.z(), AE.z(), AC.z(), 0}
            });

    this.T2 =
        new Matrix(
            new double[][] {
              {AB.x() + AD.x(), AE.x(), 0, -AC.x() * 150},
              {AB.y() + AD.y(), AE.y(), -1, -AC.y() * 150},
              {AB.z() + AD.z(), AE.z(), 0, -AC.z() * 150}
            });

    System.out.println("========== Vecteurs unitaire ==========");
    System.out.println("AB = " + AB);
    System.out.println("AC = " + AC);
    System.out.println("AD = " + AD);
    System.out.println("AE = " + AE);
    System.out.println("FB = " + FB);

    System.out.println("========== Système d'équation ==========");
    T1.solve("T_AB=T_AD=P", "T_AE", "T_AC");
    T2.solve("T_AB=T_AD=P", "T_AE", "W");
  }
}
