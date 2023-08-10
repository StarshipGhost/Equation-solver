package Exercices;

import utils.*;

public class Exercice2121 {

  private Coordinate A;
  private Coordinate B;
  private Coordinate C;
  private Coordinate D;
  private Coordinate E;
  private Vector AB;
  private Vector AC;
  private Vector AD;
  private Vector AE;
  private Vector unitVectorAB;
  private Vector unitVectorAC;
  private Vector unitVectorAD;
  private Vector unitVectorAE;

  public Exercice2121() {

    this.A = new Coordinate(0, -1.60, 0);
    this.B = new Coordinate(-0.78, 0, 0);
    this.C = new Coordinate(0, 0, 1.20);
    this.D = new Coordinate(1.30, 0, 0.40);
    this.E = new Coordinate(-0.40, 0, -0.86);
    this.AB = B.subtract(A);
    this.AC = C.subtract(A);
    this.AD = D.subtract(A);
    this.AE = E.subtract(A);
    this.unitVectorAB = AB.unitVector();
    this.unitVectorAC = AC.unitVector();
    this.unitVectorAD = AD.unitVector();
    this.unitVectorAE = AE.unitVector();

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

    System.out.println("========== Vecteurs unitaire ==========");
    System.out.println("AB = " + unitVectorAB);
    System.out.println("AC = " + unitVectorAC);
    System.out.println("AD = " + unitVectorAD);
    System.out.println("AE = " + unitVectorAE);
  }
}
