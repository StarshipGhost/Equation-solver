package Exercices.chapitre3;

import utils.*;

public class Exercice356 {

  private Coordinate A, B, C, D, E, F;
  private Vector3D AE, CF, DB, r, forceVectorAE;
  private Matrix M_AD, T, T_X, T_Y, T_Z;

  public Exercice356() {
    this.A = new Coordinate(0, 0.6, 0.2);
    this.B = new Coordinate(1.2, 0.35, 0);
    this.C = new Coordinate(0, 0.9, -0.4);
    this.D = new Coordinate(0, 0.7, 0);
    this.E = new Coordinate(0.9, 0, 0.4);
    this.F = new Coordinate(0.6, 0, -0.6);

    this.AE = E.subtract3DCoordinate(A);
    this.CF = F.subtract3DCoordinate(C);
    this.DB = B.subtract3DCoordinate(D);
    this.r = C.subtract3DCoordinate(B); // C.substract(D) works too

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

    AE.unitVector();
    CF.unitVector();
    DB.unitVector();

    System.out.println("========== Vecteurs unitaire ==========");
    System.out.println("AE = " + AE);
    System.out.println("CF = " + CF);
    System.out.println("DB = " + DB);

    CF.multiplyComponents(33);

    this.T_X = new Matrix(new double[][] {{AE.x(), -CF.x()}});
    this.T_Y = new Matrix(new double[][] {{AE.y(), -CF.y()}});
    this.T_Z = new Matrix(new double[][] {{AE.z(), -CF.z()}});

//    this.T =
//        new Matrix(
//            new double[][] {
//              {AE.x(), 0, 0, -CF.x()}, {0, AE.y(), 0, -CF.y()}, {0, 0, AE.z(), -CF.z()}
//            });

    this.forceVectorAE =
        new Vector3D(
            AE.x() * T_X.solve("T_AE").get("T_AE"),
            AE.y() * T_Y.solve("T_AE").get("T_AE"),
            AE.z() * T_Z.solve("T_AE").get("T_AE"));

    System.out.println("========== Vecteurs force ==========");
    System.out.println("F_AE = " + forceVectorAE);
    System.out.println("F_CF = " + CF);

    this.M_AD =
        new Matrix(
            new double[][] {
              {DB.x(), DB.y(), DB.z()}, {r.x(), r.y(), r.z()}, {CF.x(), CF.y(), CF.z()}
            });

    System.out.println("========== Produit mixte ==========");
    System.out.println("d_DB = " + M_AD.determinant());
  }
}
