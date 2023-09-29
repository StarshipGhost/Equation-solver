package Exercices.TP;

import utils.*;

public class Exercice3 {

  private Coordinate A, B, C, D, E, F;
  private Vector3D DF, W, DE, DB;
  private Vector3D r_AF, r_AC, r_EF, r_EC;
  private Vector3D M_AF, M_AC, M_EF, M_EC;
  private Vector3D r_AE;

  public Exercice3() {

    this.A = new Coordinate(70, 0, 0).convert(-3);
    this.B = new Coordinate(70 + 90, 0, 0).convert(-3);
    this.C = new Coordinate(70 + 90, 0, 100).convert(-3);
    this.D = new Coordinate(70 + 90, 0, 100 + 140).convert(-3);
    this.E = new Coordinate(0, 0, 140 + 100).convert(-3);
    this.F = new Coordinate(0, 110, (100 + 140) - 80).convert(-3);

    System.out.println("========== TP - Exercice 3 ==========");
    System.out.println("========== Coordonnées ==========");
    System.out.println("A = " + A);
    System.out.println("B = " + B);
    System.out.println("C = " + C);
    System.out.println("D = " + D);
    System.out.println("E = " + E);
    System.out.println("F = " + F);

    this.DF = F.subtract3DCoordinate(D);
    this.W = new Vector3D(0, -800, 0);
    this.DE = E.subtract3DCoordinate(D);
    this.DB = B.subtract3DCoordinate(D);

    this.r_AE = E.subtract3DCoordinate(A);

    this.r_AF = F.subtract3DCoordinate(A);
    this.r_AC = C.subtract3DCoordinate(A);
    this.r_EF = F.subtract3DCoordinate(E);
    this.r_EC = C.subtract3DCoordinate(E);

    System.out.println("========== Vecteurs ==========");
    System.out.println("FD = " + DF);
    System.out.println("W = " + W);

    System.out.println("========== Vecteurs position ==========");
    System.out.println("r_AF = " + r_AF);
    System.out.println("r_AC = " + r_AC);
    System.out.println("r_AE = " + r_AE);
    System.out.println("r_EF = " + r_EF);
    System.out.println("r_EC = " + r_EC);

    this.DF.unitVector();
    this.DE.unitVector();
    this.DB.unitVector();
    this.r_AE.unitVector();

    System.out.println("========== Vecteurs unitaire ==========");
    System.out.println("FD = " + DF);
    System.out.println("r_AE = " + r_AE);

    this.M_AF = r_AF.crossProduct(DF);
    this.M_AC = r_AC.crossProduct(W);
    this.M_EF = r_EF.crossProduct(DF);
    this.M_EC = r_EC.crossProduct(W);

    System.out.println("========== Moments de force ==========");
    System.out.println("M_AF = " + M_AF);
    System.out.println("M_AC = " + M_AC);
    System.out.println("M_EF = " + M_EF);
    System.out.println("M_EC = " + M_EC);

    System.out.println("========== Moments de force W et DF à partir de l'axe EA ==========");
    System.out.println("M_C_EA = " + r_AE.scalarProduct(M_AC));

    System.out.println("========== Tension DF ==========");
    double norm_DF_1 = DF.getForceFromMomentOfForceAboutAnAxis(r_AE, M_AC, r_AF);
    double norm_DF_2 = DF.getForceFromMomentOfForceAboutAnAxis(r_AE, M_EC, r_EF);
    System.out.println("T_DF = " + norm_DF_1);
    System.out.println("T_DF = " + norm_DF_2);

    M_AF.multiplyComponents(norm_DF_1);

    System.out.println("========== Moments de force DF à partir de l'axe EA ==========");
    System.out.println("M_DF_EA = " + r_AE.scalarProduct(M_AF));

    System.out.println("========== Angles ==========");
    System.out.println("DF∠DE = " + DF.angleBetween(DE));
    System.out.println("DF∠DB = " + DF.angleBetween(DB));

  }
}
