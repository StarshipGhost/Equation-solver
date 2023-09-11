package Exercices.TP;

import utils.Vector2D;

import static utils.Geometry.cos;
import static utils.Geometry.sin;

public class Exercice1 {

  private final double nF1 = 200;
  private final double nF2 = 150;
  private final double nF3 = 100;
  private final double a = 25;
  private Vector2D F1, F2, F3, R, Rc;
  private Vector2D F1c, F2c, F3c;

  public Exercice1() {

    System.out.println("========== TP - Exercice 1 ==========");
    this.F1 = new Vector2D(-nF1 * cos(this.a), -nF1 * sin(this.a));
    this.F2 = new Vector2D(nF2 * cos(this.a + 30), -nF2 * sin(this.a + 30));
    this.F3 = new Vector2D(nF3 * cos(this.a), -nF3 * sin(this.a));

    System.out.println("========== Vecteurs force ==========");
    System.out.println("F1 = " + F1);
    System.out.println("F2 = " + F2);
    System.out.println("F3 = " + F3);

    this.R = new Vector2D(F1.x() + F2.x() + F3.x(), F1.y() + F2.y() + F3.y());

    System.out.println("========== Vecteurs résultant ==========");
    System.out.println("R = " + R);
    System.out.println("a) R = " + R.norm());
    System.out.println("a) Orientation R: " + R.angle());
    System.out.println("b) 3ième quadrant");

    double a = Math.toDegrees(Math.asin((-(((nF1 - nF3) / (nF2)) - cos(30)) / sin(30))));
    System.out.println("========== Valeur de l'angle 'a' sachant que R = (0, -Ry) ==========");
    System.out.println(a);

    this.F1c = new Vector2D(-nF1 * cos(a), -nF1 * sin(a));
    this.F2c = new Vector2D(nF2 * cos(a + 30), -nF2 * sin(a + 30));
    this.F3c = new Vector2D(nF3 * cos(a), -nF3 * sin(a));

    this.Rc = new Vector2D(F1c.x() + F2c.x() + F3c.x(), F1c.y() + F2c.y() + F3c.y());

    System.out.println("========== Force résultante avec le nouvel angle a ==========");
    System.out.println("Rc = " + Rc);
  }
}
