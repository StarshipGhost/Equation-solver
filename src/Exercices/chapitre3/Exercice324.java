package Exercices.chapitre3;

import utils.*;

public class Exercice324 {

  private Coordinate A, B, C;
  private Vector3D BA, r_CB, unitVectorBA, unitVector_r_CB, forceVector_F_BA;

  public Exercice324() {

    System.out.println("========== Exercice 3.24 ==========");

    this.A = new Coordinate(960, -120, 720);
    this.B = new Coordinate(1060, -1800, 1320);
    this.C = new Coordinate(0, 0, 0);
    this.BA = A.subtract(B);
    this.r_CB = B.subtract(C);
    this.unitVectorBA = BA.unitVector();
    this.unitVector_r_CB = r_CB.unitVector();
    this.forceVector_F_BA = unitVectorBA.multiplyComponents(228);


    System.out.println("========== Coordonnées ==========");
    System.out.println("A = " + A);
    System.out.println("B = " + B);
    System.out.println("C = " + C);

    System.out.println("========== Vecteurs ==========");
    System.out.println("BA = " + BA);
    System.out.println("r_CB = " + r_CB);

    System.out.println("========== Vecteurs unitaire ==========");
    System.out.println("BA = " + unitVectorBA);
    System.out.println("r_CB = " + unitVector_r_CB);

    System.out.println("========== Vecteurs force ==========");
    Vector3D forceVector_F_BA = unitVectorBA.multiplyComponents(228);
    System.out.println("F_BA = " + forceVector_F_BA);
  }
}
