package Exercices.chapitre2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import utils.Vector2D;

import static utils.Geometry.*;

public class Exercice266 {
  private final double pAngle = 40;
  private final double m = 160;
  private final double g = -9.81;
  private Vector2D W, P, AB;


  public Exercice266() {

    System.out.println("========== Exercice 2.66 ==========");
    this.W = new Vector2D(0, m * g);
    double angleT = Math.toDegrees(Math.asin(cos(40) / 2));
    double T = -W.y() / ((2 * cos(angleT)) + sin(40));
    System.out.println("========== Angle B ==========");
    System.out.println("B = " + angleT);
    System.out.println("========== Grandeur de la force P ==========");
    System.out.println("P = " + T);
  }
}
