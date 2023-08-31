package Exercices.chapitre3;

import utils.*;

public class Exercice324 {

  private Coordinate A, B, C;
  private Vector3D BA, r_CB, M_C;

  public Exercice324() {

    System.out.println("========== Exercice 3.24 ==========");

    double convert = Math.pow(10, -3);
    this.A = new Coordinate(960 * convert, -120 * convert, 720 * convert);
    this.B = new Coordinate(1060 * convert, -1920 * convert, 1320 * convert);
    this.C = new Coordinate(0, 0, 0);
    this.BA = A.subtract3DCoordinate(B);
    this.r_CB = B.subtract3DCoordinate(C);

    System.out.println("========== Coordonnées ==========");
    System.out.println("A = " + A);
    System.out.println("B = " + B);
    System.out.println("C = " + C);

    System.out.println("========== Vecteurs ==========");
    System.out.println("BA = " + BA);
    System.out.println("r_CB = " + r_CB);

    BA.unitVector();
   // r_CB.unitVector();

    System.out.println("========== Vecteurs unitaire ==========");
    System.out.println("BA = " + BA);
    System.out.println("r_CB = " + r_CB);

    BA.multiplyComponents(228);

    System.out.println("========== Vecteurs force ==========");
    System.out.println("F_BA = " + BA);

    this.M_C = r_CB.crossProduct(BA);

    System.out.println("========== Moment de la force BA au point C ==========");
    System.out.println(M_C + " N*m");
  }
}
