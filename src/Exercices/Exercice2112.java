package Exercices;
import utils.*;
public class Exercice2112 {

  private final double T_CA = 590;
  private Coordinate A;
  private Coordinate B;
  private Coordinate C;
  private Coordinate D;
  private Coordinate O;
  private Vector BA;
  private Vector CA;
  private Vector DA;
  private Vector AO;
  private Vector unitVectorBA;
  private Vector unitVectorCA;
  private Vector unitVectorDA;
  private Vector unitVectorAO;
  private Matrix T;

  public Exercice2112() {


    this.A = new Coordinate(0, 20, 0);
    this.B = new Coordinate(-4, 0, 5);
    this.C = new Coordinate(12, 0, 3.6);
    this.D = new Coordinate(-4, 0, 14.8);
    this.O = new Coordinate(0, 0, 0);
    this.BA = A.subtract(B);
    this.CA = A.subtract(C);
    this.DA = A.subtract(D);
    this.AO = O.subtract(A);
    this.unitVectorBA = BA.unitVector();
    this.unitVectorCA = CA.unitVector();
    this.unitVectorDA = DA.unitVector();
    this.unitVectorAO = AO.unitVector();
    this.T = new Matrix(new double[][]{{unitVectorBA.x(), unitVectorDA.x(), unitVectorAO.x(), -(T_CA * unitVectorCA.x())},
                                       {unitVectorBA.y(), unitVectorDA.y(), unitVectorAO.y(), -(T_CA * unitVectorCA.y())},
                                       {unitVectorBA.z(), unitVectorDA.z(), unitVectorAO.z(), -(T_CA * unitVectorCA.z())}});

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

    System.out.println("========== Vecteurs unitaire ==========");
    System.out.println("BA = " + unitVectorBA);
    System.out.println("CA = " + unitVectorCA);
    System.out.println("DA = " + unitVectorDA);
    System.out.println("AO = " + unitVectorAO);

    System.out.println("========== Système d'équations ==========");
    T.solve();
  }
}
