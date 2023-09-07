package Exercices.chapitre2;

import utils.Matrix;
import utils.Vector2D;

import static utils.Geometry.*;

public class Exercice270 {

  private final double angleBC = 25;
  private final double angleCAD = 55;
  private Vector2D P, Q, CB, CA, ACB, R;
  private Matrix T;

  public Exercice270() {

    this.Q = new Vector2D(0, -1800);
    this.CA = new Vector2D(-cos(55), sin(55));
    this.CB = new Vector2D(cos(25), sin(25));
    this.ACB = new Vector2D(CA.x() + CB.x(), CA.y() + CB.y());
    this.P = new Vector2D(-cos(55), sin(55));
    this.T = new Matrix(new double[][] {{ACB.x(), P.x(), Q.x()}, {ACB.y(), P.y(), -Q.y()}});

    System.out.println("========== Exercice 2.70 ==========");
    System.out.println("========== Système d'équations ==========");
    System.out.println(T.solve("ACB", "P"));


    ACB.multiplyComponents(T.solve("ACB", "P").get("ACB"));
    P.multiplyComponents(T.solve("ACB", "P").get("P"));

    System.out.println("========== Norme ACB ==========");
    System.out.println("ACB = " + T.solve("ACB", "P").get("ACB"));
    System.out.println("========== Norme P ==========");
    System.out.println("ACB = " + T.solve("ACB", "P").get("P"));

  }

}
