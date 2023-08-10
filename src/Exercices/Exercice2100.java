package Exercices;
import utils.*;
public class Exercice2100 {

  private final double T_AC = 444;
  private Coordinate A, B, C, D, O;
  private Vector AB, AC, AD, OA, unitVectorAB, unitVectorAC, unitVectorAD, unitVectorOA;
  private Matrix T;

  public Exercice2100() {
    this.A = new Coordinate(0, 5.60, 0);
    this.B = new Coordinate(-4.20, 0, 0);
    this.C = new Coordinate(2.40, 0, 4.20);
    this.D = new Coordinate(0, 0, -3.30);
    this.O = new Coordinate(0, 0, 0);
    this.AB = B.subtract(A);
    this.AC = C.subtract(A);
    this.AD = D.subtract(A);
    this.OA = A.subtract(O);
    this.unitVectorAB = AB.unitVector();
    this.unitVectorAC = AC.unitVector();
    this.unitVectorAD = AD.unitVector();
    this.unitVectorOA = OA.unitVector();
    this.T = new Matrix(new double[][] {{unitVectorAB.x(), unitVectorAD.x(), unitVectorOA.x(), -(T_AC * unitVectorAC.x())},
                                        {unitVectorAB.y(), unitVectorAD.y(), unitVectorOA.y(), -(T_AC * unitVectorAC.y())},
                                        {unitVectorAB.z(), unitVectorAD.z(), unitVectorOA.z(), -(T_AC * unitVectorAC.z())}});

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

    System.out.println("========== Vecteurs unitaire ==========");
    System.out.println("AB = " + unitVectorAB);
    System.out.println("AC = " + unitVectorAC);
    System.out.println("AD = " + unitVectorAD);
    System.out.println("OA = " + unitVectorOA);

    System.out.println("========== Système d'équations ==========");
    T.solve();

  }
}

