package Exercices.chapitre4;

import utils.*;

public class Exercice4116 {
  private Coordinate A, B, C, D, E, F, H, L;
  private Vector3D r_AB, r_BA, r_AH, r_BH, r_AW, r_BW;
  private Vector3D M, M_AH, M_AW, M_BH, M_BW;
  private Vector3D EH, W, R;
  private Vector3D reaction_A, reaction_B;
  private double Mx = 0;

  public Exercice4116() {

    this.A = new Coordinate(40, 0, 0).convert(-3);
    this.B = new Coordinate(380 - 40, 0, 0).convert(-3);
    this.C = new Coordinate(380, 0, 200).convert(-3);
    this.D = new Coordinate(0, 0, 200).convert(-3);
    this.E = new Coordinate(300, 0, 200).convert(-3);
    this.F = new Coordinate(380, 250, 0).convert(-3);
    this.H = new Coordinate(0, 120, 0).convert(-3);
    this.L = new Coordinate(380 / 2, 0, 200 / 2).convert(-3);

    System.out.println("========== Exercice 4.116 ==========");
    System.out.println("========== Coordonnées ==========");
    System.out.println("A = " + A);
    System.out.println("B = " + B);
    System.out.println("C = " + C);
    System.out.println("D = " + D);
    System.out.println("E = " + E);
    System.out.println("F = " + F);
    System.out.println("H = " + H);
    System.out.println("L = " + L);

    this.EH = H.subtract3DCoordinate(E);
    this.W = new Vector3D(0, -300, 0);
    this.R = new Vector3D(0, 0, 0);

    this.r_AB = B.subtract3DCoordinate(A);
    this.r_AH = H.subtract3DCoordinate(A);
    this.r_AW = L.subtract3DCoordinate(A);
    this.r_BA = A.subtract3DCoordinate(B);
    this.r_BH = H.subtract3DCoordinate(B);
    this.r_BW = L.subtract3DCoordinate(B);

    System.out.println("========== Vecteurs ==========");
    System.out.println("EH = " + EH);
    System.out.println("W = " + W);

    System.out.println("========== Vecteurs position ==========");
    System.out.println("r_AB = " + r_AB);
    System.out.println("r_BA = " + r_BA);
    System.out.println("r_AH = " + r_AH);
    System.out.println("r_BH = " + r_BH);
    System.out.println("r_AW = " + r_AW);
    System.out.println("r_BW = " + r_BW);

    EH.unitVector();

    this.M = new Vector3D(0, 0, 0);
    this.M_AW = r_AW.crossProduct(W);
    this.M_AH = r_AH.crossProduct(EH);
    this.M_BW = r_BW.crossProduct(W);
    this.M_BH = r_BH.crossProduct(EH);

    System.out.println("========== Vecteurs unitaires ==========");
    System.out.println("EH = " + EH);

    System.out.println("========== Moments de force ==========");
    System.out.println("M_AH = " + M_AH);
    System.out.println("M_BH = " + M_BH);
    System.out.println("M_AW = " + M_AW);
    System.out.println("M_BW = " + M_BW);

    double norm_T_EH = (Mx - M_AW.x()) / M_AH.x();
    EH.multiplyComponents(norm_T_EH);
    System.out.println("========== Norme et vecteur force T_EH ==========");
    System.out.println(norm_T_EH + " N");
    System.out.println("EH = " + EH);

    M_AH.multiplyComponents(norm_T_EH);
    M_BH.multiplyComponents(norm_T_EH);

    System.out.println("========== Moments de force ==========");
    System.out.println("M_AH = " + M_AH);
    System.out.println("M_BH = " + M_BH);
    System.out.println("M_AW = " + M_AW);
    System.out.println("M_BW = " + M_BW);

    this.R = new Vector3D(0, 0, 0);
    this.reaction_A =
        new Vector3D(
            (R.x() - EH.x()),
            (M.z() - M_BH.z() - M_BW.z()) / r_BA.x(),
            (M.y() - M_BH.y() - M_BW.y()) / r_BA.x());
    this.reaction_B =
        new Vector3D(
            0, (M.z() - M_AH.z() - M_AW.z()) / r_AB.x(), (M.y() - M_AH.y() - M_AW.y()) / r_AB.x());

    System.out.println("Réaction A = " + reaction_A);
    System.out.println("Réaction B = " + reaction_B);
  }
}
