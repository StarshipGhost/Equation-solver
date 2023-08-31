package Exercices.chapitre2;

import utils.Vector2D;
import static utils.Geometry.sin;

public class Exercice263 {
  private final double m = 25;
  private final double g = -9.81;
  private final double x = 0.09;
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

    System.out.println("AB = " + AB);
    System.out.println("P = " + P);
  }
}
