package Exercices.chapitre4;

import static utils.Geometry.*;

import utils.*;

public class Exercice447 {

  private final double T = 1300;
  private final double Rx = 0;
  private final double Ry = 0;
  private Coordinate A, B, C, D, E;
  private Vector2D r_CA, r_CB, r_CE;
  private Vector2D F1, F2, BD, reaction_C;
  private Vector3D M_CE, M_CA, M_CB;

  public Exercice447() {

    this.A = new Coordinate(-500, 600).convert(-3);
    this.B = new Coordinate(150, 600).convert(-3);
    this.C = new Coordinate(0, 0).convert(-3);
    this.D = new Coordinate(400, 0).convert(-3);
    this.E = new Coordinate(0, 400).convert(-3);

    System.out.println("========== Exercice 4.47 ==========");
    System.out.println("========== Coordonnées ==========");
    System.out.println("A = " + A);
    System.out.println("B = " + B);
    System.out.println("C = " + C);
    System.out.println("D = " + D);
    System.out.println("E = " + E);

    this.BD = D.subtract2DCoordinate(B);
    this.r_CA = A.subtract2DCoordinate(C);
    this.r_CB = B.subtract2DCoordinate(C);
    this.r_CE = E.subtract2DCoordinate(C);

    System.out.println("========== Vecteurs ==========");
    System.out.println("r_CA = " + r_CA);
    System.out.println("r_CB = " + r_CB);
    System.out.println("r_CE = " + r_CE);

    BD.unitVector();
    BD.multiplyComponents(T);

    this.F1 = new Vector2D(0, -750);
    this.F2 = new Vector2D(-450, 0);

    this.M_CA = r_CA.crossProduct(F1);
    this.M_CE = r_CE.crossProduct(F2);
    this.M_CB = r_CB.crossProduct(BD);

    System.out.println("========== Moments de force au point C ==========");
    System.out.println("M_CA = " + M_CA);
    System.out.println("M_CE = " + M_CE);
    System.out.println("M_CB = " + M_CB);

    double M_C = M_CA.z() + M_CB.z() + M_CE.z();
    double Cx = Rx - F1.x() - F2.x() - BD.x();
    double Cy = Ry - F1.y() - F2.y() - BD.y();

    this.reaction_C = new Vector2D(Cx, Cy);

    System.out.println("========== Somme des Moments de force au point C ==========");
    System.out.println("M_C = " + M_C);

    System.out.println("========== Réaction C ==========");
    System.out.println("C = " + reaction_C);
    System.out.println("C = " + reaction_C.norm());
    System.out.println("Orientation: " + reaction_C.angle());
  }
}
