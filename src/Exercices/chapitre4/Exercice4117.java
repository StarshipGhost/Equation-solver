package Exercices.chapitre4;

import utils.*;

public class Exercice4117 {

  private final double g = -9.81;
  private final double m = 100;
  private Coordinate A, B, C, D, E, L;
  private Vector3D CE, CD, W, R;
  private Vector3D r_AB, r_AE, r_AD, r_AW, r_BA, r_BE, r_BD, r_BW;
  private Vector3D M_AE, M_AD, M_AW, M_BW, M_BE, M_BD, M;
  private Vector3D reaction_A, reaction_B;
  private Matrix T;

  public Exercice4117() {

    this.A = new Coordinate(90, 0, 0).convert(-3);
    this.B = new Coordinate(690 + 270 - 90, 0, 0).convert(-3);
    this.C = new Coordinate(690, 0, 450).convert(-3);
    this.D = new Coordinate(0, 675, 0).convert(-3);
    this.E = new Coordinate(960, 675, 0).convert(-3);
    this.L = new Coordinate((690 + 270) / 2, 0, (450 / 2)).convert(-3);

    System.out.println("========== Exercice 4.117 ==========");
    System.out.println("========== Coordonnées ==========");
    System.out.println("A = " + A);
    System.out.println("B = " + B);
    System.out.println("C = " + C);
    System.out.println("D = " + D);
    System.out.println("E = " + E);

    this.CE = E.subtract3DCoordinate(C);
    this.CD = D.subtract3DCoordinate(C);
    this.W = new Vector3D(0, m * g, 0);
    this.R = new Vector3D(0, 0, 0);
    this.M = new Vector3D(0, 0, 0);

    this.r_AB = B.subtract3DCoordinate(A);
    this.r_AE = E.subtract3DCoordinate(A);
    this.r_AD = D.subtract3DCoordinate(A);
    this.r_AW = L.subtract3DCoordinate(A);

    this.r_BA = A.subtract3DCoordinate(B);
    this.r_BE = E.subtract3DCoordinate(B);
    this.r_BD = D.subtract3DCoordinate(B);
    this.r_BW = L.subtract3DCoordinate(B);

    System.out.println("========== Vecteurs ==========");
    System.out.println("CE = " + CE);
    System.out.println("CD = " + CD);

    System.out.println("========== Vecteurs position ==========");
    System.out.println("r_AB = " + r_AB);
    System.out.println("r_AE = " + r_AE);
    System.out.println("r_AD = " + r_AD);
    System.out.println("r_AW = " + r_AW);
    System.out.println("r_BA = " + r_BA);
    System.out.println("r_BE = " + r_BE);
    System.out.println("r_BD = " + r_BD);
    System.out.println("r_BW = " + r_BW);

    CE.unitVector();
    CD.unitVector();

    System.out.println("========== Vecteurs unitaire ==========");
    System.out.println("CE = " + CE);
    System.out.println("CD = " + CD);

    this.M_AE = r_AE.crossProduct(CE);
    this.M_AD = r_AD.crossProduct(CD);
    this.M_AW = r_AW.crossProduct(W);
    this.M_BE = r_BE.crossProduct(CE);
    this.M_BD = r_BD.crossProduct(CD);
    this.M_BW = r_BW.crossProduct(W);

    this.T = new Matrix(new double[][] {{(M_AE.x() + M_AD.x()), -M_AW.x()}});
    double norm_T = T.solve("T").get("T");
    System.out.println("========== Norme de T ==========");
    System.out.println(norm_T + " N");

    CE.multiplyComponents(norm_T);
    CD.multiplyComponents(norm_T);
    M_AE.multiplyComponents(norm_T);
    M_AD.multiplyComponents(norm_T);
    M_BE.multiplyComponents(norm_T);
    M_BD.multiplyComponents(norm_T);

    System.out.println("========== Moments de force ==========");
    System.out.println("M_AE = " + M_AE);
    System.out.println("M_AD = " + M_AD);
    System.out.println("M_AW = " + M_AW);
    System.out.println("M_BE = " + M_BE);
    System.out.println("M_BD = " + M_BD);
    System.out.println("M_BW = " + M_BW);

    this.reaction_A =
        new Vector3D(
            R.x() - CE.x() - CD.x(),
            (M.z() - M_BE.z() - M_BD.z() - M_BW.z()) / r_BA.x(),
            (M.y() - M_BE.y() - M_BD.y() - M_BW.y()) / r_BA.x());
    this.reaction_B =
        new Vector3D(
            0,
            (M.z() - M_AE.z() - M_AD.z() - M_AW.z()) / r_AB.x(),
            (M.y() - M_AE.y() - M_AD.y() - M_AW.y()) / r_AB.x());

    System.out.println("Réaction A = " + reaction_A);
    System.out.println("Réaction B = " + reaction_B);
  }
}
