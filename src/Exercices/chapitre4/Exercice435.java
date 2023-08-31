package Exercices.chapitre4;

import utils.*;

public class Exercice435 {

  private final double M_B = 0;
  private final double Rx = 0;
  private final double Ry = 0;
  private Coordinate A, B, C, D, E, F;
  private Vector2D BE, CF, F1, reaction_D;
  private Vector2D r_BA, r_BC;
  private Vector3D M_AB;

  public Exercice435() {

    this.A = new Coordinate(-100, 0).convert(-3);
    this.B = new Coordinate(0, 0).convert(-3);
    this.C = new Coordinate(100, 0).convert(-3);
    this.D = new Coordinate(200, 0).convert(-3);
    this.E = new Coordinate(200, 80).convert(-3);
    this.F = new Coordinate(200, -80).convert(-3);

    this.BE = E.subtract2DCoordinate(B);
    this.CF = F.subtract2DCoordinate(C);
    this.r_BA = A.subtract2DCoordinate(B);
    this.r_BC = C.subtract2DCoordinate(B);

    System.out.println("========== Exercice 4.35 ==========");
    System.out.println("========== Coordonnées ==========");
    System.out.println("A = " + A);
    System.out.println("B = " + B);
    System.out.println("C = " + C);
    System.out.println("D = " + D);
    System.out.println("E = " + E);
    System.out.println("F = " + F);

    System.out.println("========== Vecteurs ==========");
    System.out.println("BE = " + BE);
    System.out.println("CF = " + CF);

    System.out.println("========== Vecteurs position ==========");
    System.out.println("r_BA = " + r_BA);
    System.out.println("r_BC = " + r_BC);

    BE.unitVector();
    CF.unitVector();

    System.out.println("========== Vecteurs unitaire ==========");
    System.out.println("BE = " + BE);
    System.out.println("CF = " + CF);

    this.F1 = new Vector2D(0, -600);
    this.M_AB = r_BA.crossProduct(F1);

    System.out.println("========== Moments de force ==========");
    System.out.println("M_AB = " + M_AB);

    double M_CF = CF.y() * r_BC.x();

    double T_CF = (M_B - M_AB.norm()) / M_CF;
    CF.multiplyComponents(T_CF);
    double T_BE = (Ry - F1.y() - CF.y()) / BE.y();
    BE.multiplyComponents(T_BE);

    System.out.println("========== Grandeur des Tensions ==========");
    System.out.println("T_CF = " + CF);
    System.out.println("T_BE = " + BE);

    double Dx = Rx - CF.x() - BE.x();
    this.reaction_D = new Vector2D(Dx, 0);
    System.out.println("Réaction au point D: " + reaction_D);

    System.out.println("========== Résultante des forces ==========");
    Vector2D R = new Vector2D(CF.x() + BE.x() + F1.x() + reaction_D.x(), CF.y() + BE.y() + F1.y() + reaction_D.y());
    System.out.println("R = " + R);
  }
}
