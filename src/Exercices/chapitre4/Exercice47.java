package Exercices.chapitre4;

import static utils.Geometry.*;

import utils.*;

public class Exercice47 {

  /** Axis system modified */
  private final double angle = 35;

  private final double m = 40;
  private final double g = -9.81;
  private final double M_B = 0;
  private final double Rx = 0;
  private final double Ry = 0;
  private Coordinate A, B, C, D;
  private Vector2D F1, F2, P, R_B;
  private Vector2D r_BA, r_BC, r_BD;
  private Vector3D M_BC, M_BD, M_BA;

  public Exercice47() {

    this.A = new Coordinate(0, 80 + 350 + 500).convert(-3);
    this.B = new Coordinate(0, 0).convert(-3);
    this.C = new Coordinate(300, 80).convert(-3);
    this.D = new Coordinate(300, 80 + 350).convert(-3);

    System.out.println("========== Exercice 4.7 ==========");
    System.out.println("========== Coordonnées ==========");
    System.out.println("A = " + A);
    System.out.println("B = " + B);
    System.out.println("C = " + C);
    System.out.println("D = " + D);

    this.P = new Vector2D(1 * cos(angle), 1 * sin(angle));
    this.R_B = new Vector2D(1 * cos(angle), 1 * sin(angle));
    this.F1 = new Vector2D(m * g * cos(angle), m * g * sin(angle));
    this.F2 = new Vector2D(m * g * cos(angle), m * g * sin(angle));

    this.r_BA = A.subtract2DCoordinate(B);
    this.r_BC = C.subtract2DCoordinate(B);
    this.r_BD = D.subtract2DCoordinate(B);

    System.out.println("========== Forces ==========");
    System.out.println("P = " + P);
    System.out.println("B = " + R_B);
    System.out.println("F1 = " + F1);
    System.out.println("F2 = " + F2);

    System.out.println("========== Vecteurs position ==========");
    System.out.println("r_BA = " + r_BA);
    System.out.println("r_BC = " + r_BC);
    System.out.println("r_BD = " + r_BD);

    this.M_BA = r_BA.crossProduct(P);
    this.M_BC = r_BC.crossProduct(F1);
    this.M_BD = r_BD.crossProduct(F2);

    System.out.println("========== Moments de force ==========");
    System.out.println("M_BA = " + M_BA);
    System.out.println("M_BC = " + M_BC);
    System.out.println("M_BD = " + M_BD);

    System.out.println("========== Force P et Réaction B ==========");
    double norm_P = ((M_B - M_BC.z() - M_BD.z()) / M_BA.z());
    P.multiplyComponents(norm_P);
    System.out.println("P = " + P);

    this.R_B = new Vector2D((Rx - F2.x() - F1.x() - P.x()), (Ry - F2.y() - F1.y() - P.y()));

    System.out.println("B = " + R_B);

    /**
     * On divise par 2 la norme de la réaction B pour obtenir la réaction dans chacune des roues.
     */
    System.out.println("Réaction B dans chacune des deux roues: " + (R_B.norm() / 2));
  }
}
