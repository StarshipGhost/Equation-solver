package Exercices.chapitre4;

import static utils.Geometry.*;

import utils.*;

public class Exercice447 {

  Coordinate A, B, C, D, E;
  Vector2D r_CA, r_CB, r_CD, r_CE, M_C;
  Vector2D F1, F2, F_DB;

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

    this.r_CA = A.subtract2DCoordinate(C);
    this.r_CB = B.subtract2DCoordinate(C);
    this.r_CD = D.subtract2DCoordinate(C);
    this.r_CE = E.subtract2DCoordinate(C);

    System.out.println("========== Vecteurs ==========");
    System.out.println("r_CA = " + r_CA);
    System.out.println("r_CB = " + r_CB);
    System.out.println("r_CD = " + r_CD);
    System.out.println("r_CE = " + r_CE);

    double angle = Math.toDegrees(Math.atan(250.0 / 600.0));
    this.F1 = new Vector2D(0, -750);
    this.F2 = new Vector2D(-450, 0);
    this.F_DB = new Vector2D(-1300 * sin(angle), 1300 * cos(angle));

    double M_CA = F1.y() * r_CA.x();
    double M_CE = F2.x() * r_CE.y();
    double M_CBx = F_DB.x() * r_CB.y();
    double M_CBy = F_DB.y() * r_CB.x();

    System.out.println("========== Moments de force au point C ==========");
    System.out.println("M_CA = " + M_CA);
    System.out.println("M_CE = " + M_CE);
    System.out.println("M_CBx = " + M_CBx);
    System.out.println("M_CBy = " + M_CBy);

    this.M_C = new Vector2D(0 - M_CA - M_CBx, 0 - M_CE - M_CBy);

    System.out.println("========== Somme des Moments de force au point C ==========");
    System.out.println("M_C = " + M_C);
    System.out.println("M_C = " + M_C.norm());
  }
}
