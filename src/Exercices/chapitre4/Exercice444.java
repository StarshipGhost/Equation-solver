package Exercices.chapitre4;

import static utils.Geometry.*;

import utils.*;

public class Exercice444 {

  private final double g = -9.81;
  private final double m = 175;
  private final double MAX_M = 500;
  private final double MIN_M = -500;

  private double angleADB;
  private Coordinate A, B, C, D, E;
  private Vector2D r_AB, r_AC, r_AD, r_AE, DB;

  public Exercice444() {

    this.A = new Coordinate(0, 0);
    this.B = new Coordinate(0, 3.6);
    this.C = new Coordinate(0, 4.5);
    this.D = new Coordinate(-1.5, 0);
    this.E = new Coordinate(0, C.y() / 2);

    System.out.println("========== Exercice 4.44 ==========");
    System.out.println("========== Coordonnées ==========");
    System.out.println("A = " + A);
    System.out.println("B = " + B);
    System.out.println("C = " + C);
    System.out.println("D = " + D);

    this.DB = B.subtract2DCoordinate(D);
    this.r_AB = B.subtract2DCoordinate(A);
    this.r_AC = C.subtract2DCoordinate(A);
    this.r_AD = D.subtract2DCoordinate(A);
    this.r_AE = E.subtract2DCoordinate(A);

    System.out.println("========== Vecteurs ==========");
    System.out.println("r_AB = " + r_AB);
    System.out.println("r_AC = " + r_AC);
    System.out.println("r_AD = " + r_AD);
    System.out.println("r_AE = " + r_AE);

    double angle = Math.toDegrees(Math.atan(r_AB.y() / -r_AD.x()));
    System.out.println(angle);
    Vector2D F_C = new Vector2D(600 * cos(15), -600 * sin(15));
    Vector2D W = new Vector2D(0, m * g);

    System.out.println("========== Vecteurs force ==========");
    System.out.println("F_C = " + F_C);
    System.out.println("W = " + W);

    double M_ACx = F_C.x() * r_AC.y();
    double M_ACy = F_C.y() * r_AC.x();
    double M_ABx = cos(angle) * r_AB.y();
    double M_ABy = sin(angle) * r_AB.x();

    Vector2D M_AC = new Vector2D(M_ACx, M_ACy);
    Vector2D M_AB_MIN = new Vector2D(-M_ABx, -M_ABy);
    Vector2D M_AB_MAX = new Vector2D(-M_ABx, -M_ABy);

    System.out.println("========== T_BD MIN et MAX ==========");
    System.out.println("M_AC = " + M_AC);
    System.out.println("M_AD = " + M_AB_MIN);

    System.out.println("========== MIN ==========");
    double T_BD_Min = (MAX_M - M_AC.x()) / M_AB_MIN.x();
    M_AB_MIN.multiplyComponents(T_BD_Min);
    System.out.println("M_AC = " + M_AC);
    System.out.println("M_AB = " + M_AB_MIN);
    double resultWithTMin = M_AC.x() + M_AB_MIN.x();
    System.out.println("T_BD mininimal nécessaire pour que la grandeur du couple ne dépasse pas 500 N * m :" + T_BD_Min);
    System.out.println("Somme des moments de force au point A: " + resultWithTMin + " N * m");

    System.out.println("========== MAX ==========");
    double T_BD_Max = (MIN_M - M_AC.x()) / M_AB_MAX.x();
    M_AB_MAX.multiplyComponents(T_BD_Max);
    System.out.println("M_AC = " + M_AC);
    System.out.println("M_AD = " + M_AB_MAX);
    double resultWithTMax = M_AC.x() + M_AB_MAX.x();
    System.out.println("T_BD maximal nécessaire pour que la grandeur du couple ne dépasse pas 500 N * m :" + T_BD_Max);
    System.out.println("Somme des moments de force au point A: " + resultWithTMax + " N * m");

    Vector2D M_A1 = new Vector2D(M_AC.x() + M_AB_MIN.x(), M_AC.y() + M_AB_MIN.y());
    Vector2D M_A2 = new Vector2D(M_AC.x() + M_AB_MAX.x(), M_AC.y() + M_AB_MAX.y());
    System.out.println("M_A = " + M_A1.norm() + " N * m");
    System.out.println("M_A = " + M_A2.norm() + " N * m");
  }
}
