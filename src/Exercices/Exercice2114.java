package Exercices;

import utils.*;

public class Exercice2114 {

  private Matrix T;

  public Exercice2114() {

    double x = Math.PI / 180;
    this.T = new Matrix(new double[][]{{-sin(50), cos(40), cos(60), 0},
                                     {1, 1, 1, 692.8},
                                     {cos(50), sin(40), -sin(60), 0}});

    System.out.println("========== Système d'équations ==========");
    T.solve();
  }

  public static double sin(int x) {
    return Math.sin(x * (Math.PI / 180));
  }

  public static double cos(int x) {
    return Math.cos(x * (Math.PI / 180));
  }
}
