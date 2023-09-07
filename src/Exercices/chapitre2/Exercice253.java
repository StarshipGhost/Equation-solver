package Exercices.chapitre2;

import static utils.Geometry.*;

public class Exercice253 {

  private final double B = 40;
  private final double a = 45;
  private final double W = 22.5;
  private double T_CA, T_CB, T_DE;

  public Exercice253() {

    double angleBetweenWAndAC = 90 + a;
    double angleBetweenWAndCB = 90 - B;
    double angleBetweenACAndCB = a - B;

    T_CA = lawOfSines(W, sin(angleBetweenACAndCB), sin(angleBetweenWAndCB), true);
    T_CB = lawOfSines(W, sin(angleBetweenACAndCB), sin(angleBetweenWAndAC), true);
    T_DE = T_CA - T_CB;

    System.out.println("========== Exercice 2.53 ==========");
    System.out.println("========== Tension dans le cable ACB ==========");
    System.out.println("ACB = " + T_CB);
    System.out.println("========== Force de traction du cable-tracteur DE ==========");
    System.out.println("T_DE = " + T_DE);
  }
}
