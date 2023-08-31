package Exercices.chapitre4;

import utils.Coordinate;
import utils.Matrix;
import utils.Vector3D;

public class Exercice4139 {

  private Coordinate A, B, C, D, E, F;
  private Vector3D CF, W;
  private Vector3D M_AF, M_AB, M_AE, M_EF, M_EB, M_EA, M;
  private Vector3D r_AF, r_AB, r_AE, r_EF, r_EB, r_EA;
  private Vector3D reaction_A, reaction_E;
  private Matrix T;

  public Exercice4139() {

    this.A = new Coordinate(0, 0, 240).convert(-3);
    this.B = new Coordinate(200, 0, 240).convert(-3);
    this.C = new Coordinate(480, 0, 240).convert(-3);
    this.D = new Coordinate(480, 160, 240).convert(-3);
    this.E = new Coordinate(480, 160, 0).convert(-3);
    this.F = new Coordinate(0, 490, 0).convert(-3);

    System.out.println("========== Exercice 4.139 ==========");
    System.out.println("========== Coordonnées ==========");
    System.out.println("A = " + A);
    System.out.println("B = " + B);
    System.out.println("C = " + C);
    System.out.println("D = " + D);
    System.out.println("E = " + E);
    System.out.println("F = " + F);

    this.CF = F.subtract3DCoordinate(C);
    this.W = new Vector3D(0, -640, 0);

    this.r_AF = F.subtract3DCoordinate(A);
    this.r_AB = B.subtract3DCoordinate(A);
    this.r_AE = E.subtract3DCoordinate(A);

    this.r_EF = F.subtract3DCoordinate(E);
    this.r_EB = B.subtract3DCoordinate(E);
    this.r_EA = A.subtract3DCoordinate(E);

    System.out.println("========== Vecteurs ==========");
    System.out.println("CF = " + CF);
    System.out.println("W = " + W);

    System.out.println("r_AF = " + r_AF);
    System.out.println("r_AB = " + r_AB);
    System.out.println("r_AE = " + r_AE);

    System.out.println("r_EF = " + r_EF);
    System.out.println("r_EB = " + r_EB);
    System.out.println("r_EA = " + r_EA);

    CF.unitVector();
    r_AE.unitVector();

    this.M_AF = r_AF.crossProduct(CF);
    this.M_AB = r_AB.crossProduct(W);
    this.M_EF = r_EF.crossProduct(CF);
    this.M_EB = r_EB.crossProduct(W);

    System.out.println("========== Vecteur unitaire ==========");
    System.out.println("CF = " + CF);
    System.out.println("r_AE = " + r_AE);

    System.out.println("========== Moments de force ==========");
    System.out.println("M_AF = " + M_AF);
    System.out.println("M_AB = " + M_AB);
    System.out.println("M_EF = " + M_EF);
    System.out.println("M_EB = " + M_EB);

   double normCF = CF.getForceFromMomentOfForceAboutAnAxis(r_AE, M_AB, r_AF);
    System.out.println("T_CF = " + normCF);
  }
}
