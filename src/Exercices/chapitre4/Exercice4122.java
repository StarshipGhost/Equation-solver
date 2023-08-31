package Exercices.chapitre4;

import utils.*;

public class Exercice4122 {

  /**
   * La cheville peut appliquer des couples par rapport à l'axe des x et z: My et Mz = 0. La cheville ne peut
   * empêcher une translation ou une rotation par rapport à y: réaction_A en x = 0
   */
  private Coordinate A, C, D, E, F;

  private Vector3D CF, DE, W, R;
  private Vector3D M_AE, M_AF, M_AC, M_A;
  private Vector3D r_AE, r_AF, r_AW;
  private Vector3D reaction_A;
  private Matrix T;

  public Exercice4122() {

    this.A = new Coordinate(0, 0, 0);
    this.C = new Coordinate(80, 0, 90 + 45).convert(-3);
    this.D = new Coordinate(80, 0, 90).convert(-3);
    this.E = new Coordinate(80, 120, 0).convert(-3);
    this.F = new Coordinate(0, 60, 90 + 45).convert(-3);

    System.out.println("========== Exercice 4.122 ==========");
    System.out.println("========== Coordonnées ==========");
    System.out.println("A = " + A);
    System.out.println("C = " + C);
    System.out.println("D = " + D);
    System.out.println("E = " + E);
    System.out.println("F = " + F);

    this.CF = F.subtract3DCoordinate(C);
    this.DE = E.subtract3DCoordinate(D);
    this.W = new Vector3D(0, -480, 0);
    this.R = new Vector3D(0, 0, 0);

    this.r_AE = E.subtract3DCoordinate(A);
    this.r_AF = F.subtract3DCoordinate(A);
    this.r_AW = C.subtract3DCoordinate(A);

    System.out.println("========== Vecteurs ==========");
    System.out.println("DE = " + DE);
    System.out.println("CF = " + CF);

    System.out.println("========== Vecteurs position ==========");
    System.out.println("r_AE = " + r_AE);
    System.out.println("r_AF = " + r_AF);
    System.out.println("r_AW = " + r_AW);

    CF.unitVector();
    DE.unitVector();

    System.out.println("========== Vecteurs unitaire ==========");
    System.out.println("DE = " + DE);
    System.out.println("CF = " + CF);

    this.M_AE = r_AE.crossProduct(DE);
    this.M_AF = r_AF.crossProduct(CF);
    this.M_AC = r_AW.crossProduct(W);

    this.T =
        new Matrix(
            new double[][] {{M_AE.y(), M_AF.y(), -M_AC.y()}, {M_AE.z(), M_AF.z(), -M_AC.z()}});
    double T_DE = T.solve("T_DE", "T_CF").get("T_DE");
    double T_CF = T.solve("T_DE", "T_CF").get("T_CF");

    DE.multiplyComponents(T_DE);
    CF.multiplyComponents(T_CF);

    M_AF.multiplyComponents(T_CF);
    M_AE.multiplyComponents(T_DE);

    System.out.println("========== Moments de force ==========");
    System.out.println("M_AE = " + M_AE);
    System.out.println("M_AF = " + M_AF);
    System.out.println("M_AC = " + M_AC);

    System.out.println("========== Vecteur de forces ==========");
    System.out.println("T_DE = " + DE);
    System.out.println("T_CF = " + CF);
    System.out.println("W = " + W);

    this.reaction_A =
        new Vector3D(R.x() - DE.x() - CF.x(), DE.y() + CF.y() + W.y(), R.z() - DE.z() - CF.z());
    System.out.println("========== Réaction A ==========");
    System.out.println("A = " + reaction_A);

    this.M_A =
        new Vector3D(
            M_AE.x() + M_AF.x() + M_AC.x(),
            M_AE.y() + M_AF.y() + M_AC.y(),
            M_AE.z() + M_AF.z() + M_AC.z());
    System.out.println("========== Moment de force au point A ==========");
    System.out.println("M_A" + M_A);
  }
}
