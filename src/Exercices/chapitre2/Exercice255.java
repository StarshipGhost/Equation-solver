package Exercices.chapitre2;

import static utils.Geometry.*;

import utils.*;

public class Exercice255 {

  private Vector2D P, Q, AC, BC;
  private Matrix T;

  public Exercice255() {

    this.P = new Vector2D(75 * cos(30), 75 * sin(30));
    this.Q = new Vector2D(0, -60);
    this.AC = new Vector2D(-1 * cos(60), 1 * sin(60));
    this.BC = new Vector2D(-1 * cos(30), -1 * sin(30));

    this.T =
        new Matrix(
            new double[][] {
              {AC.x(), BC.x(), -(P.x() + Q.x())}, {AC.y(), BC.y(), -(P.y() + Q.y())}
            });
    System.out.println("========== Exercice 2.55 ==========");
    T.solve("AC", "BC");
  }
}
