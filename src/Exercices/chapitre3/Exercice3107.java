package Exercices.chapitre3;

import static utils.Geometry.quadraticFormula;

import java.util.Arrays;
import utils.Vector2D;

public class Exercice3107 {

  private Vector2D F1, F2, F3, F4, R;
  private final double r_AB = 9;

  public Exercice3107() {
    this.F1 = new Vector2D(0.0, -1300.0);
    this.F2 = new Vector2D(0.0, -400.0);
    this.F3 = new Vector2D(0.0, -600.0);
    this.R = new Vector2D(0, -(F1.norm() + F2.norm() + F3.norm()));

    double[] x = quadraticFormula(400 / 3, -3400, 19800);
    System.out.println(Arrays.toString(x));
    double y = 6.9065;
    System.out.println((-(y) * -400) + (-(y + 1.5) * -600) + (-(y / 2) * (400 * (y / 1.5))));

    System.out.println(-9 * (-2300 + (400 * y / 1.5)));

    System.out.println(((400 * Math.pow(y, 2)) / 3) - (3400 * y) + 19800);

    System.out.println(0 * (-2300 + ((400 * y) / 1.5)));
  }
}
