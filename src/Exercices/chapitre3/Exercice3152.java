package Exercices.chapitre3;

import utils.*;

public class Exercice3152 {
  private final double T = 450;
  private Coordinate A, B, C, D, G, H, O;
  private Vector3D BG, BH, AD, AB, M_A;
  private Matrix T_M_AD;

  public Exercice3152() {

    System.out.println("========== Exercice 3.152 ==========");
    this.A = new Coordinate(0, 0, 0.75);
    this.B = new Coordinate(0.5, 0, 0.75);
    this.C = new Coordinate(1, 0, 0.75);
    this.D = new Coordinate(1, 0, 0);
    this.G = new Coordinate(0, 0.925, 0.35);
    this.H = new Coordinate(0.875, 0.75, 0);
    this.O = new Coordinate(0, 0, 0);

    System.out.println("========== Coordonnées ==========");
    System.out.println("A = " + A);
    System.out.println("B = " + B);
    System.out.println("C = " + C);
    System.out.println("D = " + D);
    System.out.println("G = " + G);
    System.out.println("H = " + H);
    System.out.println("O = " + O);

    this.BG = G.subtract3DCoordinate(B);
    this.BH = H.subtract3DCoordinate(B);
    this.AD = D.subtract3DCoordinate(A);
    this.AB = B.subtract3DCoordinate(A);

    System.out.println("========== Vecteurs ==========");
    System.out.println("BG = " + BG);
    System.out.println("BH = " + BH);
    System.out.println("AD = " + AD);
    System.out.println("AB = " + AB);

    AD.unitVector();
    BH.unitVector();
    // AB.unitVector();

    System.out.println("========== Vecteurs unitaire ==========");
    System.out.println("AD = " + AD);
    System.out.println("BH = " + BH);
    System.out.println("AB = " + AB);

    BH.multiplyComponents(T);

    System.out.println("========== Vecteurs force ==========");
    System.out.println("T_BH = " + BH);
    System.out.println("------------------------------------");

    this.T_M_AD =
        new Matrix(
            new double[][] {
              {AD.x(), AD.y(), AD.z()},
              {AB.x(), AB.y(), AB.z()},
              {BH.x(), BH.y(), BH.z()}
            });
    T_M_AD.gaussianElimination();
    double determinantT_M_AD = T_M_AD.determinant();
    System.out.println(
        "Moment par rapport à la diagonale AD (Méthode du détérminant) = " + -determinantT_M_AD);

    this.M_A = AB.crossProduct(BH);
    double M_AD = AD.scalarProduct(M_A);
    System.out.println("Moment par rapport à la diagonale AD (Produit mixte) = " + M_AD);
  }
}
