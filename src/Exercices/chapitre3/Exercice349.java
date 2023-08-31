package Exercices.chapitre3;

import utils.*;

public class Exercice349 {

  private final double SUM_MOMENT_OF_FORCE = 6400;
  private Coordinate A, C;
  private Vector3D AC, DF;
  private Matrix a, b;

  public Exercice349() {

    this.A = new Coordinate(1, 4, 0);
    this.C = new Coordinate(0, 0, 4);

    this.AC = C.subtract3DCoordinate(A);
    this.DF = new Vector3D(1.5, -5, 4);

    System.out.println("========== Exercice 3.49 ==========");
    System.out.println("========== Coordonnées ==========");
    System.out.println("A = " + A);
    System.out.println("C = " + C);

    System.out.println("========== Vecteurs ==========");
    System.out.println("AC = " + AC);
    System.out.println("DF = " + DF);

    AC.unitVector();
    DF.unitVector();

    System.out.println("========== Vecteurs unitaire ==========");
    System.out.println("AC = " + AC);
    System.out.println("DF = " + DF);

    AC.multiplyComponents(1100);

    System.out.println("========== Vecteurs forces ==========");
    System.out.println("F_AB = " + AC);

    this.a = new Matrix(new double[][] {{1, 0, 0}, {0, 4, 0}, {AC.x(), AC.y(), AC.z()}});
    this.b =
        new Matrix(
            new double[][] {
              {
                1, 0, 0,
              },
              {0, 5, 0},
              {DF.x(), DF.y(), DF.z()}
            });

    System.out.println("========== Produit mixte ==========");
    System.out.println("d_M_AB: " + a.determinant());
    System.out.println("d_M_DF: " + b.determinant());

    double M_DF = SUM_MOMENT_OF_FORCE - a.determinant();
    double T_DE = M_DF / b.determinant();

    System.out.println("========== Grandeur T_DE ==========");
    System.out.println(T_DE + " N");

  }
}
