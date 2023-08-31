package Exercices.chapitre4;

import utils.*;

public class Exercice43 {

  private final double mG = 856;
  private final double mC = 367;
  private final double g = -9.81;
  private final double M_A = 0;
  private final double Ry = 0;
  Coordinate A, G, B, C;
  Vector2D F1, W, R_A, R_B;
  Vector2D r_AG, r_AB, r_AC;
  Vector3D M_AG, M_AB, M_AC;

  public Exercice43() {

    this.A = new Coordinate(0, 0);
    this.G = new Coordinate(0.5, 0);
    this.B = new Coordinate(0.5 + 1, 0);
    this.C = new Coordinate(0.5 + 1 + 1.25, 0);

    System.out.println("========== Exercice 4.3 ==========");
    System.out.println("========== Coordonnées ==========");
    System.out.println("A = " + A);
    System.out.println("G = " + G);
    System.out.println("B = " + B);
    System.out.println("C = " + C);

    this.W = new Vector2D(0, mG * g);
    this.F1 = new Vector2D(0, mC * g);
    this.R_A = new Vector2D(0, 1);
    this.R_B = new Vector2D(0, 1);

    this.r_AB = B.subtract2DCoordinate(A);
    this.r_AG = G.subtract2DCoordinate(A);
    this.r_AC = C.subtract2DCoordinate(A);

    System.out.println("========== Forces ==========");
    System.out.println("W = " + W);
    System.out.println("F1 = " + F1);

    System.out.println("========== Vecteurs position ==========");
    System.out.println("r_AB = " + r_AB);
    System.out.println("r_AG = " + r_AG);
    System.out.println("r_AC = " + r_AC);

    this.M_AG = r_AG.crossProduct(W);
    this.M_AC = r_AC.crossProduct(F1);

    System.out.println("========== Moments de force ==========");
    System.out.println("M_AG = " + M_AG);
    System.out.println("M_AC = " + M_AC);

    double normB = Math.round((M_A - M_AG.z() - M_AC.z()) / r_AB.x());
    R_B.multiplyComponents(normB / 2);
    double normA = Math.round((Ry + W.norm() + F1.norm() - (R_B.norm()) * 2));
    R_A.multiplyComponents(normA / 2);

    System.out.println("========== Réactions A et B de chacunes des roues ==========");
    System.out.println("A = " + R_A);
    System.out.println("B = " + R_B);
  }
}
