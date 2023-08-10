package Exercices;

import utils.*;

public class Exercice349 {

  private final double SUM_MOMENT_OF_FORCE = 6400;
  private Coordinate A, C;
  private Vector AC, DF;
  private Vector unitVectorAC, unitVectorDF;
  private Vector forceVectorAC;
  private Matrix a, b;

  public Exercice349() {

    this.A = new Coordinate(1, 4, 0);
    this.C = new Coordinate(0, 0, 4);
    this.AC = C.subtract(A);
    this.DF = new Vector(1.5, -5, 4);
    this.unitVectorDF = DF.unitVector();
    this.unitVectorAC = AC.unitVector();
    this.forceVectorAC = unitVectorAC.multiplyComponents(1100);
    this.a = new Matrix(new double[][]{{1, 0, 0},
            {0, 4, 0},
            {forceVectorAC.x(), forceVectorAC.y(), forceVectorAC.z()}});
    this.b = new Matrix(new double[][]{{1, 0, 0,},
            {0, 5, 0},
            {unitVectorDF.x(), unitVectorDF.y(), unitVectorDF.z()}});

    System.out.println("========== Exercice 3.49 ==========");

    System.out.println("========== Coordonnées ==========");
    System.out.println("A = " + A);
    System.out.println("C = " + C);

    System.out.println("========== Vecteurs ==========");
    System.out.println("AC = " + AC);
    System.out.println("DF = " + DF);

    System.out.println("========== Vecteurs unitaire ==========");
    System.out.println("AC = " + unitVectorAC);
    System.out.println("DF = " + unitVectorDF);

    System.out.println("========== Vecteurs forces ==========");
    System.out.println("F_AB = " + forceVectorAC);

    System.out.println("========== Produit mixte ==========");
    System.out.println("d_M_AB: " + a.determinant());
    System.out.println("d_M_DF: " + b.determinant());

    double M_DF = SUM_MOMENT_OF_FORCE - a.determinant();
    double F_DE = M_DF / b.determinant();
    System.out.println("Grandeur T_DE = " + F_DE);

    //this.D = new Coordinate(0, 5, 0);
    //this.F = new Coordinate(0, 0, 4);
  }
}
