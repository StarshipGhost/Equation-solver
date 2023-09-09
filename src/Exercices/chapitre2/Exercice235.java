package Exercices.chapitre2;

import utils.Vector2D;
import static utils.Geometry.*;

public class Exercice235 {

  private final double nF1 = 200;
  private final double nF2 = 150;
  private final double nF3 = 100;
  private final double a = 35;
  private Vector2D F1, F2, F3, R;

  public Exercice235() {

    System.out.println("========== Exercice 2.35 ==========");
    this.F1 = new Vector2D(-nF1 * cos(a), -nF1 * sin(a));
    this.F2 = new Vector2D(nF2 * cos(a + 30), -nF2 * sin(a + 30));
    this.F3 = new Vector2D(nF3 * cos(a), -nF3 * sin(a));

    System.out.println("========== Vecteurs force ==========");
    System.out.println("F1 = " + F1);
    System.out.println("F2 = " + F2);
    System.out.println("F3 = " + F3);

    this.R = new Vector2D(F1.x() + F2.x() + F3.x(), F1.y() + F2.y() + F3.y());

    System.out.println("========== Vecteurs résultant ==========");
    System.out.println("R = " + R);
    System.out.println("R = " + R.norm());
    System.out.println("Orientation R: " + R.angle());
  }
}
