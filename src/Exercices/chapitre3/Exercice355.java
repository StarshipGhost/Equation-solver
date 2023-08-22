package Exercices.chapitre3;

import utils.Coordinate;
import utils.Matrix;
import utils.Vector3D;

public class Exercice355 {

  private Coordinate A, B, C, D, E, F;
  private Vector3D AE,
      CF,
      DB,
      r,
      unitVectorAE,
      unitVectorCF,
      unitVectorDB,
      forceVectorAE,
      forceVectorCF;
  private Matrix M_AD, T_X, T_Y, T_Z, T;

  public Exercice355() {

    this.A = new Coordinate(0, 0.6, 0.2);
    this.B = new Coordinate(1.2, 0.35, 0);
    this.C = new Coordinate(0, 0.9, -0.4);
    this.D = new Coordinate(0, 0.7, 0);
    this.E = new Coordinate(0.9, 0, 0.4);
    this.F = new Coordinate(0.6, 0, -0.6);

    this.AE = E.subtract(A);
    this.CF = F.subtract(C);
    this.DB = B.subtract(D);
    this.r = A.subtract(B); // A.substract(D) works too

    this.unitVectorAE = AE.unitVector();
    this.unitVectorCF = CF.unitVector();
    this.unitVectorDB = DB.unitVector();

    this.forceVectorAE = unitVectorAE.multiplyComponents(55);

    this.M_AD =
        new Matrix(
            new double[][] {
              {unitVectorDB.x(), unitVectorDB.y(), unitVectorDB.z()},
              {r.x(), r.y(), r.z()},
              {forceVectorAE.x(), forceVectorAE.y(), forceVectorAE.z()}
            });
    this.T =
        new Matrix(
            new double[][] {
              {unitVectorCF.x(), 0, 0, -forceVectorAE.x()},
              {0, unitVectorCF.y(), 0, -forceVectorAE.y()},
              {0, 0, unitVectorCF.z(),  -forceVectorAE.z()}
            });

    T.solve();
    this.forceVectorCF = new Vector3D(unitVectorCF.x() * T.solve().get("X1"), unitVectorCF.y() * T.solve().get("X2"), unitVectorCF.z() * T.solve().get("X3"));

//    this.T_X = new Matrix(new double[][] {{unitVectorCF.x(), -forceVectorAE.x()}});
//    this.T_Y = new Matrix(new double[][] {{unitVectorCF.y(), -forceVectorAE.y()}});
//    this.T_Z = new Matrix(new double[][] {{unitVectorCF.z(), -forceVectorAE.z()}});
//    this.forceVectorCF =
//        new Vector3D(
//            unitVectorCF.x() * T_X.solve().get("X1"),
//            unitVectorCF.y() * T_Y.solve().get("X1"),
//            unitVectorCF.z() * T_Z.solve().get("X1"));

    System.out.println("========== Exercice 3.56 ==========");
    System.out.println("========== Coordonnées ==========");
    System.out.println("A = " + A);
    System.out.println("B = " + B);
    System.out.println("C = " + C);
    System.out.println("D = " + D);
    System.out.println("E = " + E);
    System.out.println("F = " + F);

    System.out.println("========== Vecteurs ==========");
    System.out.println("AE = " + AE);
    System.out.println("CF = " + CF);
    System.out.println("DB = " + DB);
    System.out.println("r = " + r);

    System.out.println("========== Vecteurs unitaire ==========");
    System.out.println("AE = " + unitVectorAE);
    System.out.println("CF = " + unitVectorCF);
    System.out.println("DB = " + unitVectorDB);

    System.out.println("========== Vecteurs force ==========");
    System.out.println("F_AE = " + forceVectorAE);
    System.out.println("F_CF = " + forceVectorCF);

    System.out.println("========== Produit mixte ==========");
    System.out.println("d_DB = " + M_AD.determinant());
  }
}
