package Exercices.chapitre2;

import utils.Vector2D;
import static utils.Geometry.sin;

public class Exercice263 {
  private final double m = 25;
  private final double g = -9.81;
  private final double x = 300 * Math.pow(10, -3);
  private final double y = 0.4;
  private Vector2D P, W, AB;

  public Exercice263() {

    this.W = new Vector2D(0, m * g);
    this.AB = new Vector2D(x, y);
    double angle = AB.angle();

    double ABy = -W.y();
    double normAB = ABy / AB.y() * sin(angle);
    double ABx = AB.x() * normAB;

    this.AB = new Vector2D(ABx, ABy);
    this.P = new Vector2D(-AB.x(), 0);

    System.out.println("========== Exercice 2.63 ==========");
    System.out.println("========== Vecteurs forces ==========");
    System.out.println("AB = " + AB);
    System.out.println("P = " + P);

    System.out.println("========== Norme ==========");
    System.out.println("AB = " + AB.norm());
    System.out.println("P = " + P.norm());
  }
}
