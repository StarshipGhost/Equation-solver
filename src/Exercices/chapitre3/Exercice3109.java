package Exercices.chapitre3;

import static utils.Geometry.*;

import utils.*;

public class Exercice3109 {
  private final double NORM_F1 = 100;
  private final double NORM_F2 = 212;
  private final double NORM_P = 88;
  private final double NORM_F3 = 180;
  private Vector2D F1, F2, P, F3, R, r1, r2;
  private Vector3D M_R;

  public Exercice3109() {

    double x = Math.toDegrees(Math.atan(280.0 / 450.0));
    this.F1 = new Vector2D(NORM_F1, 0);
    this.F2 = new Vector2D(NORM_F2 * cos(x), -NORM_F2 * sin(x));
    this.P = new Vector2D(0, -NORM_P);
    this.F3 = new Vector2D(-NORM_F3, 0);
    this.R = new Vector2D(F1.get(0) + F2.get(0) + P.get(0) + F3.get(0), F1.get(1) + F2.get(1) + P.get(1) + F3.get(1));

    this.r1 = new Vector2D((450 + 80) * Math.pow(10, -3), 0);
    this.r2 = new Vector2D(280, 0);

    this.M_R = r1.crossProduct(R);
    System.out.println("M_R = " + M_R);

    System.out.println("========== Exercice 3.109 ==========");
    System.out.println("========== Vecteurs ==========");
    System.out.println("F1 = " + F1);
    System.out.println("F2 = " + F2);
    System.out.println("P = " + P);
    System.out.println("F3 = " + F3);
    System.out.println("R = " + R);

    System.out.println("========== Grandeur et orientation de R ==========");
    System.out.println(R.norm());
    System.out.printf("%.2f degrés en direction sud-est %n", Math.abs(Math.toDegrees(Math.atan(R.get(1) / R.get(0)))));
  }
}
