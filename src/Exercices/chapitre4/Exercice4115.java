package Exercices.chapitre4;

import utils.*;

public class Exercice4115 {
  private Coordinate A, B, C, D, E, F, H, L;
  private Vector3D EF, W, R;
  private Vector3D r_AB, r_AW, r_AF, r_BA,r_BW, r_BF;
  private Vector3D  M_AF, M_AW, M_BF, M_BW, M;
  private Vector3D reaction_A, reaction_B;

  public Exercice4115() {

    this.A = new Coordinate(40, 0, 0).convert(-3);
    this.B = new Coordinate(380 - 40, 0, 0).convert(-3);
    this.C = new Coordinate(380, 0, 200).convert(-3);
    this.D = new Coordinate(0, 0, 200).convert(-3);
    this.E = new Coordinate(300, 0, 200).convert(-3);
    this.F = new Coordinate(380, 250, 0).convert(-3);
    this.H = new Coordinate(0, 120, 0).convert(-3);
    this.L = new Coordinate(380 / 2, 0, 200 / 2).convert(-3);


    System.out.println("========== Exercice 4.115 ==========");
    System.out.println("========== Coordonnées ==========");
    System.out.println("A = " + A);
    System.out.println("B = " + B);
    System.out.println("C = " + C);
    System.out.println("D = " + D);
    System.out.println("E = " + E);
    System.out.println("F = " + F);
    System.out.println("H = " + H);
    System.out.println("L = " + L);


    this.EF = F.subtract3DCoordinate(E);
    this.W = new Vector3D(0, -300, 0);
    this.R = new Vector3D(0, 0, 0);
    this.M = new Vector3D(0, 0, 0);

    this.r_AB = B.subtract3DCoordinate(A);
    this.r_AF = F.subtract3DCoordinate(A);
    this.r_AW = L.subtract3DCoordinate(A);
    this.r_BA = A.subtract3DCoordinate(B);
    this.r_BF = F.subtract3DCoordinate(B);
    this.r_BW = L.subtract3DCoordinate(B);

    System.out.println("========== Vecteurs ==========");
    System.out.println("EF = " + EF);
    System.out.println("W = " + W);

    System.out.println("========== Vecteurs position ==========");

    System.out.println("r_AB = " + r_AB);
    System.out.println("r_AF = " + r_AF);
    System.out.println("r_AW = " + r_AW);
    System.out.println("r_BA = " + r_BA);
    System.out.println("r_BF = " + r_BF);
    System.out.println("r_BW = " + r_BW);

    EF.unitVector();

    this.M_AW = r_AW.crossProduct(W);
    this.M_AF = r_AF.crossProduct(EF);
    this.M_BW = r_BW.crossProduct(W);
    this.M_BF = r_BF.crossProduct(EF);

    System.out.println("========== Vecteurs unitaires ==========");
    System.out.println("EF = " + EF);

    System.out.println("========== Moments de force (Vecteur unitaire BF et BH) ==========");
    System.out.println("M_AF = " + M_AF);
    System.out.println("M_BF = " + M_BF);

    double norm_T_EF = -M_BW.x() / M_BF.x();

    System.out.println("Tension EF = " + norm_T_EF + " N");

    EF.multiplyComponents(norm_T_EF);

    System.out.println("========== Vecteurs force ==========");
    System.out.println("EF = " + EF);

    M_AF.multiplyComponents(norm_T_EF);
    M_BF.multiplyComponents(norm_T_EF);

    System.out.println("========== Moments de force ==========");
    System.out.println("M_AW = " + M_AW);
    System.out.println("M_BW = " + M_BW);
    System.out.println("M_AF = " + M_AF);
    System.out.println("M_BF = " + M_BF);

    this.reaction_A =
        new Vector3D(
            R.x() - EF.x(),
            (0 - M_BW.z() - M_BF.z()) / r_BA.x(),
            (0 - M_BW.y() - M_BF.y()) / r_BA.x());
    this.reaction_B =
        new Vector3D(
            0, (M.z() - M_AW.z() - M_AF.z()) / r_AB.x(), (M.y() - M_AW.y() - M_AF.y()) / r_AB.x());

    System.out.println("Réaction A = " + reaction_A);
    System.out.println("Réaction B = " + reaction_B);
  }
}
