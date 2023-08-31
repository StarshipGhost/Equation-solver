package Exercices.chapitre2;

import utils.Vector2D;
import static utils.Geometry.*;

public class Exercice266 {
    private final double pAngle = 40;
  private final double m = 160;
  private final double g = -9.81;
  private Vector2D W, P, AB;

  public Exercice266() {

      this.W = new Vector2D(0, m * g);
      this.P = new Vector2D(-1 * cos(pAngle), 1 * sin(pAngle));
      this.AB = new Vector2D(0, -P.x());
  }
}
