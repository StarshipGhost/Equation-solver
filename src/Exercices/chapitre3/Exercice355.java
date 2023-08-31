package Exercices.chapitre3;

import utils.*;

public class Exercice355 {

  private Coordinate A, B, C, D, E, F;
  private Vector3D AE, CF, DB, r, forceVectorCF;
  private Matrix M_AD, T_X, T_Y, T_Z, T;

  public Exercice355() {

    this.A = new Coordinate(0, 0.6, 0.2);
    this.B = new Coordinate(1.2, 0.35, 0);
    this.C = new Coordinate(0, 0.9, -0.4);
    this.D = new Coordinate(0, 0.7, 0);
    this.E = new Coordinate(0.9, 0, 0.4);
    this.F = new Coordinate(0.6, 0, -0.6);

    this.AE = E.subtract3DCoordinate(A);
    this.CF = F.subtract3DCoordinate(C);
    this.DB = B.subtract3DCoordinate(D);
    this.r = A.subtract3DCoordinate(B); // A.substract(D) works too

    System.out.println("========== Exercice 3.55 ==========");
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

    AE.unitVector();
    CF.unitVector();
    DB.unitVector();

    System.out.println("========== Vecteurs unitaire ==========");
    System.out.println("AE = " + AE);
    System.out.println("CF = " + CF);
    System.out.println("DB = " + DB);

    AE.multiplyComponents(55);

    //    this.T =
    //        new Matrix(
    //            new double[][] {
    //              {CF.x(), 0, 0, -AE.x()},
    //              {0, CF.y(), 0, -AE.y()},
    //              {0, 0, CF.z(), -AE.z()}
    //            });
    //    this.forceVectorCF =
    //        new Vector3D(
    //            CF.x() * T.solve().get("X1"),
    //            CF.y() * T.solve().get("X2"),
    //            CF.z() * T.solve().get("X3"));

    this.T_X = new Matrix(new double[][] {{CF.x(), -AE.x()}});
    this.T_Y = new Matrix(new double[][] {{CF.y(), -AE.y()}});
    this.T_Z = new Matrix(new double[][] {{CF.z(), -AE.z()}});
    this.forceVectorCF =
        new Vector3D(
            CF.x() * T_X.solve("T_CF").get("T_CF"),
            CF.y() * T_Y.solve("T_CF").get("T_CF"),
            CF.z() * T_Z.solve("T_CF").get("T_CF"));

    this.M_AD =
        new Matrix(
            new double[][] {
              {DB.x(), DB.y(), DB.z()},
              {r.x(), r.y(), r.z()},
              {AE.x(), AE.y(), AE.z()}
            });

    System.out.println("========== Vecteurs force ==========");
    System.out.println("F_AE = " + AE);
    System.out.println("F_CF = " + forceVectorCF);

    System.out.println("========== Produit mixte ==========");
    System.out.println("d_DB = " + M_AD.determinant());
  }
}
