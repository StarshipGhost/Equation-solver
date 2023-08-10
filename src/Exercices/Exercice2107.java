package Exercices;
import utils.*;
public class Exercice2107 {

  private final double T_AD = 305;
  private Coordinate A;
  private Coordinate B;
  private Coordinate C;
  private Coordinate D;
  private Vector AB;
  private Vector AC;
  private Vector AD;
  private Vector unitVectorAB;
  private Vector unitVectorAC;
  private Vector unitVectorAD;
  private Matrix T;


  public Exercice2107() {

    this.A = new Coordinate(960, 240, 0);
    this.B = new Coordinate(0, 0, 380);
    this.C = new Coordinate(0, 0, -320);
    this.D = new Coordinate(0, 960, -220);
    this.AB = B.subtract(A);
    this.AC = C.subtract(A);
    this.AD = D.subtract(A);
    this.unitVectorAB = AB.unitVector();
    this.unitVectorAC = AC.unitVector();
    this.unitVectorAD = AD.unitVector();
    this.T = new Matrix(new double[][]{{unitVectorAB.x(), unitVectorAC.x(), 1, -(T_AD * unitVectorAD.x())},
                                       {unitVectorAB.y(), unitVectorAC.y(), 0, -(T_AD * unitVectorAD.y())},
                                       {unitVectorAB.z(), unitVectorAC.z(), 0, -(T_AD * unitVectorAD.z())}});


    System.out.println("========== Exercice 2.107 ==========");
    System.out.println("========== Coordonnées ==========");
    System.out.println("A = " + A);
    System.out.println("B = " + B);
    System.out.println("C = " + C);
    System.out.println("D = " + D);

    System.out.println("========== Vecteurs ==========");
    System.out.println("AB = " + AB);
    System.out.println("AC = " + AC);
    System.out.println("AD = " + AD);

    System.out.println("========== Vecteurs unitaire ==========");
    System.out.println("AB = " + unitVectorAB);
    System.out.println("AC = " + unitVectorAC);
    System.out.println("AD = " + unitVectorAD);

    System.out.println("========== Système d'équations ==========");
    T.solve();
  }
}
