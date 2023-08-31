package Exercices.chapitre3;

import static utils.Geometry.*;

import utils.*;

public class Exercice3108 {

  private final double r_F1 = 22 * Math.pow(10, -3);
  private final double r_F2 = (22 + 10) * Math.pow(10, -3);
  private final double r_F3 = (22 + 10 + 16) * Math.pow(10, -3);
  private final double NORM_AB = r_F3;
  private final double NORM_F1 = 18;
  private final double NORM_F2 = 40;
  private final double NORM_F3 = 25;
  private Coordinate A, B;
  private Vector2D AB, F1, F2, F3, R, r1, r2, r3;
  private Vector3D  M_F1, M_F2, M_F3, M_R;

  public Exercice3108() {

    System.out.println("========== Exercice 3.108 ==========");
    this.A = new Coordinate(0, 0);
    this.B = new Coordinate(NORM_AB * cos(25), NORM_AB * sin(25));

    System.out.println("========== Coordonnées ==========");
    System.out.println("A = " + A);
    System.out.println("B = " + B);

    this.AB = B.subtract2DCoordinate(A);
    this.F1 = new Vector2D(-NORM_F1 * sin(30), -NORM_F1 * cos(30));
    this.F2 = new Vector2D(0.0, -NORM_F2);
    this.F3 = new Vector2D(NORM_F3 * cos(40), -NORM_F3 * sin(40));

    this.R = new Vector2D(F1.x() + F2.x() + F3.x(), F1.y() + F2.y() + F3.y());

    this.r1 = new Vector2D(r_F1 * cos(25), r_F1 * sin(25));
    this.r2 = new Vector2D(r_F2 * cos(25), r_F2 * sin(25));
    this.r3 = new Vector2D(r_F3 * cos(25), r_F3 * sin(25));

    System.out.println("========== Vecteurs ==========");
    System.out.println("AB = " + AB);
    System.out.println("F1 = " + F1);
    System.out.println("F2 = " + F2);
    System.out.println("F3 = " + F3);
    System.out.println("r1 = " + r1);
    System.out.println("r2 = " + r2);
    System.out.println("r3 = " + r3);
    System.out.println("R = " + R);

    System.out.println("========== Grandeur et orientation de R ==========");
    System.out.printf("R = %.2f %n", R.norm());
    System.out.printf(
        "%.2f degré en direction sud-est %n",
        Math.abs(Math.toDegrees(Math.atan(R.y() / R.x()))));

    this.M_F1 = r1.crossProduct(F1);
    this.M_F2 = r2.crossProduct(F2);
    this.M_F3 = r3.crossProduct(F3);
    this.M_R = new Vector3D(0, 0, M_F1.z() + M_F2.z() + M_F3.z());


    System.out.println("========== Moments de force ==========");
    System.out.println("M_F1 = " + M_F1);
    System.out.println("M_F2 = " + M_F2);
    System.out.println("M_F3 = " + M_F3);
    System.out.println("M_R = " + M_R);

    System.out.println("========== Grandeur du couple M ==========");
    System.out.printf("M = %.2f %n", M_R.norm());
  }
}
