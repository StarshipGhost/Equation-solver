package Exercices.chapitre4;

import utils.*;

public class Exercice4106 {

  private final double SUM_OF_THE_MOMENTS_ABOUT_C = 0;
  private final double SUM_OF_THE_FORCES = 0;
  private Coordinate A, B, C, D, E;
  private Vector3D F_AC, BC, BD, BE, F, r_CA, r_CE, r_CD, M_CA, M_CE, M_CD, M_C, reaction_C;
  private Matrix T1;
  private double NORM_T_BE_BD;

  public Exercice4106() {

    double Ay = 3 * Geometry.sin(30);
    double Az = 3 * Geometry.cos(30);
    double By = 0.9 * Geometry.sin(30);
    double Bz = 0.9 * Geometry.cos(30);

    this.A = new Coordinate(0, Ay, Az);
    this.B = new Coordinate(0, By, Bz);
    this.C = new Coordinate(0, 0, 0);
    this.D = new Coordinate(-0.9, 0.9, 0);
    this.E = new Coordinate(0.9, 0.9, 0);

    System.out.println("========== Exercice 4.106 ==========");
    System.out.println("========== Coordonnées ==========");
    System.out.println("A = " + A);
    System.out.println("B = " + B);
    System.out.println("C = " + C);
    System.out.println("D = " + D);
    System.out.println("E = " + E);

    this.M_C =
        new Vector3D(
            SUM_OF_THE_MOMENTS_ABOUT_C, SUM_OF_THE_MOMENTS_ABOUT_C, SUM_OF_THE_MOMENTS_ABOUT_C);
    this.F = new Vector3D(SUM_OF_THE_FORCES, SUM_OF_THE_FORCES, SUM_OF_THE_FORCES);

    this.F_AC = new Vector3D(0, -300, 0);
    this.BC = C.subtract3DCoordinate(B);
    this.BD = D.subtract3DCoordinate(B);
    this.BE = E.subtract3DCoordinate(B);

    this.r_CA = A.subtract3DCoordinate(C);
    this.r_CD = D.subtract3DCoordinate(C);
    this.r_CE = E.subtract3DCoordinate(C);

    System.out.println("========== Vecteurs ==========");
    System.out.println("F_AC = " + F_AC);
    System.out.println("BD = " + BD);
    System.out.println("BE = " + BE);
    System.out.println("F = " + F);
    System.out.println("r_CA = " + r_CA);
    System.out.println("r_CD = " + r_CD);
    System.out.println("r_CE = " + r_CE);

    BD.unitVector();
    BE.unitVector();

    this.M_CA = r_CA.crossProduct(F_AC);
    this.M_CD = r_CD.crossProduct(BD);
    this.M_CE = r_CE.crossProduct(BE);

    F_AC.unitVector();

    System.out.println("========== Vecteurs unitaires ==========");
    System.out.println("AC = " + F_AC);
    System.out.println("BD = " + BD);
    System.out.println("BE = " + BE);

    System.out.println("========== Moments de force ==========");
    System.out.println("M_CA = " + M_CA);
    System.out.println("M_CD = " + M_CD);
    System.out.println("M_CE = " + M_CE);
    System.out.println("M_C = " + M_C);

    this.T1 = new Matrix(new double[][] {{M_CD.x() + M_CE.x(), M_C.x() - M_CA.x()}});
    System.out.println("========== Système d'équation ==========");
    NORM_T_BE_BD = T1.solve("T_BD=T_BE").get("T_BD=T_BE");

    BD.multiplyComponents(NORM_T_BE_BD);
    BE.multiplyComponents(NORM_T_BE_BD);
    F.multiplyComponents(300);
    this.reaction_C =
        new Vector3D(F.x() - BD.x() - BE.x(), F.y() - BD.y() - BE.y(), F.z() - BD.z() - BE.z());

    System.out.println("========== Vecteurs force ==========");
    System.out.println("BD = " + BD);
    System.out.println("BE = " + BE);
    System.out.println("C = " + reaction_C);
  }
}
