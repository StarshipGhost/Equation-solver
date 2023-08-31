package Exercices.chapitre4;

import utils.Coordinate;
import utils.Matrix;
import utils.Vector3D;

public class Exercice4135 {

  private Coordinate A, B, C, D, E, F;
  private Vector3D FD, W;
  private Vector3D M_AF, M_AC, M_AE, M_EF, M_EC, M_EA, M;
  private Vector3D r_AF, r_AC, r_AE, r_EF, r_EC, r_EA;
  private Matrix T;

  public Exercice4135() {

    this.A = new Coordinate(70, 0, 0).convert(-3);
    this.B = new Coordinate(70 + 90, 0, 0).convert(-3);
    this.C = new Coordinate(70 + 90, 0, 100).convert(-3);
    this.D = new Coordinate(70 + 90, 0, 100 + 140).convert(-3);
    this.E = new Coordinate(0, 0, 140 + 100).convert(-3);
    this.F = new Coordinate(0, 110, (100 + 140) - 80).convert(-3);

    System.out.println("========== Exercice 4.135 ==========");
    System.out.println("========== Coordonnées ==========");
    System.out.println("A = " + A);
    System.out.println("B = " + B);
    System.out.println("C = " + C);
    System.out.println("D = " + D);
    System.out.println("E = " + E);
    System.out.println("F = " + F);

    this.FD = D.subtract3DCoordinate(F);
    this.W = new Vector3D(0, -600, 0);

    this.r_AF = F.subtract3DCoordinate(A);
    this.r_AC = C.subtract3DCoordinate(A);
    this.r_AE = E.subtract3DCoordinate(A);
    this.r_EF = F.subtract3DCoordinate(E);
    this.r_EC = C.subtract3DCoordinate(E);
    this.r_EA = A.subtract3DCoordinate(E);

    System.out.println("========== Vecteurs ==========");
    System.out.println("FD = " + FD);

    System.out.println("========== Vecteurs position ==========");
    System.out.println("r_AF = " + r_AF);
    System.out.println("r_AC = " + r_AC);
    System.out.println("r_AE = " + r_AE);
    System.out.println("r_EF = " + r_EF);
    System.out.println("r_EC = " + r_EC);
    System.out.println("r_EA = " + r_EA);

    this.FD.unitVector();
    this.r_AE.unitVector();

    System.out.println("========== Vecteurs unitaire ==========");
    System.out.println("FD = " + FD);
    System.out.println("r_AE = " + r_AE);

    this.M_AF = r_AF.crossProduct(FD);
    this.M_AC = r_AC.crossProduct(W);
    this.M_EF = r_EF.crossProduct(FD);
    this.M_EC = r_EC.crossProduct(W);

    System.out.println("========== Moments de force ==========");
    System.out.println("M_AF = " + M_AF);
    System.out.println("M_AC = " + M_AC);
    System.out.println("M_EF = " + M_EF);
    System.out.println("M_EC = " + M_EC);

    double normFD = FD.getForceFromMomentOfForceAboutAnAxis(r_AE, M_AC, r_AF);
    System.out.println("T_FD = " + normFD);

    }
}
