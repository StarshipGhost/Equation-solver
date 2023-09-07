package Exercices.chapitre4;

import utils.*;

public class Exercice4138 {

  private Coordinate A, B, C, D, E, F;
  private Vector3D DF, W;
  private Vector3D M_AF, M_AB, M_AE, M_EF, M_EB, M_EA, M;
  private Vector3D r_AF, r_AB, r_AE, r_EF, r_EB, r_EA;
  private Vector3D AE;
  private Vector3D reaction_A, reaction_E;
  private Matrix T;

  public Exercice4138() {

    this.A = new Coordinate(0, 0, 240).convert(-3);
    this.B = new Coordinate(200, 0, 240).convert(-3);
    this.C = new Coordinate(480, 0, 240).convert(-3);
    this.D = new Coordinate(480, 160, 240).convert(-3);
    this.E = new Coordinate(480, 160, 0).convert(-3);
    this.F = new Coordinate(0, 490, 0).convert(-3);

    System.out.println("========== Exercice 4.138 ==========");
    System.out.println("========== Coordonnées ==========");
    System.out.println("A = " + A);
    System.out.println("B = " + B);
    System.out.println("C = " + C);
    System.out.println("D = " + D);
    System.out.println("E = " + E);
    System.out.println("F = " + F);

    this.DF = F.subtract3DCoordinate(D);
    this.W = new Vector3D(0, -640, 0);

    this.r_AF = F.subtract3DCoordinate(A);
    this.r_AB = B.subtract3DCoordinate(A);
    this.r_AE = E.subtract3DCoordinate(A);

    this.r_EF = F.subtract3DCoordinate(E);
    this.r_EB = B.subtract3DCoordinate(E);
    this.r_EA = A.subtract3DCoordinate(E);

    System.out.println("========== Vecteurs ==========");
    System.out.println("DF = " + DF);
    System.out.println("W = " + W);

    System.out.println("========== Vecteurs position ==========");
    System.out.println("r_AF = " + r_AF);
    System.out.println("r_AB = " + r_AB);
    System.out.println("r_AE = " + r_AE);

    System.out.println("r_EF = " + r_EF);
    System.out.println("r_EB = " + r_EB);
    System.out.println("r_EA = " + r_EA);

    DF.unitVector();
    r_AE.unitVector();

    this.M_AF = r_AF.crossProduct(DF);
    this.M_AB = r_AB.crossProduct(W);
    this.M_EF = r_EF.crossProduct(DF);
    this.M_EB = r_EB.crossProduct(W);

    System.out.println("========== Vecteur unitaire ==========");
    System.out.println("DF = " + DF);
    System.out.println("r_AE = " + r_AE);

    System.out.println("========== Moments de force ==========");

    System.out.println("========== Au point A ==========");
    System.out.println("M_AF = " + M_AF);
    System.out.println("M_AB = " + M_AB);

    System.out.println("========== Au point E ==========");
    System.out.println("M_EF = " + M_EF);
    System.out.println("M_EB = " + M_EB);

    /**
     * Cette façon fonctionne aussi parce la somme des moments de forces à partir du point A selon la
     * composantes des z est égale à 0.
     */
//    this.T = new Matrix(new double[][] {{M_AF.z(), -M_AB.z()}});
//    double T_DF = T.solve("T_DF").get("T_DF");

    System.out.println("========== Tension DF ==========");
    double T_DF = DF.getForceFromMomentOfForceAboutAnAxis(r_AE, M_AB, r_AF);
    System.out.println("T_DF = " + T_DF);
  }
}
