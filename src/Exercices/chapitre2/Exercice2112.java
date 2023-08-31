package Exercices.chapitre2;
import utils.*;
public class Exercice2112 {

  private final double T_CA = 590;
  private Coordinate A, B, C, D, O;
  private Vector3D BA, CA, DA, AO;
  private Matrix T;

  public Exercice2112() {


    this.A = new Coordinate(0, 20, 0);
    this.B = new Coordinate(-4, 0, 5);
    this.C = new Coordinate(12, 0, 3.6);
    this.D = new Coordinate(-4, 0, 14.8);
    this.O = new Coordinate(0, 0, 0);
    this.BA = A.subtract3DCoordinate(B);
    this.CA = A.subtract3DCoordinate(C);
    this.DA = A.subtract3DCoordinate(D);
    this.AO = O.subtract3DCoordinate(A);

    System.out.println("========== Exercice 2.112 ==========");

    System.out.println("========== Coordonnées ==========");
    System.out.println("A = " + A);
    System.out.println("B = " + B);
    System.out.println("C = " + C);
    System.out.println("D = " + D);
    System.out.println("O = " + O);

    System.out.println("========== Vecteurs ==========");
    System.out.println("BA = " + BA);
    System.out.println("CA = " + CA);
    System.out.println("DA = " + DA);
    System.out.println("AO = " + AO);

    BA.unitVector();
    CA.unitVector();
    DA.unitVector();
    AO.unitVector();
    this.T = new Matrix(new double[][]{{BA.x(), DA.x(), AO.x(), -(T_CA * CA.x())},
                                       {BA.y(), DA.y(), AO.y(), -(T_CA * CA.y())},
                                       {BA.z(), DA.z(), AO.z(), -(T_CA * CA.z())}});

    System.out.println("========== Vecteurs unitaire ==========");
    System.out.println("BA = " + BA);
    System.out.println("CA = " + CA);
    System.out.println("DA = " + DA);
    System.out.println("AO = " + AO);

    System.out.println("========== Système d'équations ==========");
    T.solve("T_AB", "T_DA", "P");
  }
}
