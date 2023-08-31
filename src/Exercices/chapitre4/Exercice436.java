package Exercices.chapitre4;

import utils.*;

public class Exercice436 {

  private final double Rx = 0;
  private final double Ry = 0;
  private final double M_S = 0;
  private Coordinate A, B, C, D, E, F, S;
  private Vector2D r_SE, r_SB, r_SF;
  private Vector2D BD, F1, F2, reaction_A, reaction_C;
  private Vector3D M_SE, M_SB, M_SF;

  public Exercice436() {

    this.A = new Coordinate(0, 0).convert(-3);
    this.B = new Coordinate(150, 75).convert(-3);
    this.C = new Coordinate(500, 250).convert(-3);
    this.D = new Coordinate(500, 0).convert(-3);
    this.E = new Coordinate(100, 50).convert(-3);
    this.F = new Coordinate(400, 200).convert(-3);
    this.S = new Coordinate(0, 250).convert(-3);

    System.out.println("========== Exercice 4.36 ==========");
    System.out.println("========== Coordonnées ==========");
    System.out.println("A = " + A);
    System.out.println("B = " + B);
    System.out.println("C = " + C);
    System.out.println("D = " + D);
    System.out.println("E = " + E);

    this.F1 = new Vector2D(0, -400);
    this.F2 = new Vector2D(0, -400);

    this.BD = D.subtract2DCoordinate(B);

    this.r_SE = E.subtract2DCoordinate(S);
    this.r_SB = B.subtract2DCoordinate(S);
    this.r_SF = F.subtract2DCoordinate(S);

    System.out.println("========== Vecteurs position ==========");
    System.out.println("r_SE = " + r_SE);
    System.out.println("r_SB = " + r_SB);
    System.out.println("r_SF = " + r_SF);

    BD.unitVector();

    System.out.println("========== Vecteurs unitaire ==========");
    System.out.println("BD = " + BD);

    this.M_SE = r_SE.crossProduct(F1);
    this.M_SB = r_SB.crossProduct(BD);
    this.M_SF = r_SF.crossProduct(F2);

    System.out.println("========== Moments des force au point S ==========");
    System.out.println("M_SE = " + M_SE);
    System.out.println("M_SB = " + M_SB);
    System.out.println("M_SF = " + M_SF);

    double normBD = (M_S - M_SE.z() - M_SF.z()) / M_SB.z();
    BD.multiplyComponents(normBD);

    this.reaction_A = new Vector2D(0, Ry - F1.y() - F2.y() - BD.y());
    this.reaction_C = new Vector2D(Rx - BD.x(), 0);

    System.out.println("========== Réaction A et C ==========");
    System.out.println("A = " + reaction_A);
    System.out.println("C = " + reaction_C);
  }
}
